package com.lauren.web.stripes;

import com.lauren.db.HibernateUtil;
import com.lauren.web.restclient.RestClient;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ErrorResolution;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.StreamingResolution;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class BaseImportActionBean extends BaseActionBean {
    @DefaultHandler
    @SuppressWarnings("unused")
    public Resolution DisplayImportPage() {
        return new ForwardResolution(getImportJsp());
    }

    public abstract String getImportJsp();

    @SuppressWarnings("unused")
    public Resolution doImport () {
        RestClient client = new RestClient();
        Session newSession = HibernateUtil.getSessionFactory().openSession();

        try {
            doImportImpl(newSession, client);
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResolution(500, e.getMessage());
        } finally {
            newSession.close();
        }

        return new StreamingResolution("text/plain", "OK");
    }

    abstract void doImportImpl(Session session, RestClient client) throws Exception;


    void doInTransaction(Session session, Runnable transactionalWork) {
        Transaction tx=null;
        try {
            tx = session.beginTransaction();
            transactionalWork.run();
            tx.commit();
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
            throw e;
        }

    }


}
