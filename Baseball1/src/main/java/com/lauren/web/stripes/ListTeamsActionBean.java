package com.lauren.web.stripes;

import com.lauren.db.PersistenceManager;
import com.lauren.db.Team;
import java.util.List;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;


public class ListTeamsActionBean implements ActionBean {
    private ActionBeanContext context;
    public void setContext(ActionBeanContext actionBeanContext) {
        context = actionBeanContext;
    }

    public ActionBeanContext getContext() {
        return context;
    }

    @DefaultHandler
    public Resolution teams() {
        List teams = PersistenceManager.findAll(Team.class);
        context.getRequest().setAttribute("teams", teams);
                return new ForwardResolution("listteams.jsp");
    }
}
