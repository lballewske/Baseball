package com.lauren.db;

import org.hibernate.Session;
import org.hibernate.Query;


import java.util.List;

public class PersistenceManager {

    public static List<Object> findAll(Class<?> entityClass) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from " + entityClass.getName());
        return query.list();
    }

    public static void persist(Object entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.persist(entity);
    }
}
