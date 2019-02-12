package com.lauren.web.stripes;

import com.lauren.db.PersistenceManager;
import com.lauren.db.Team;
import java.util.List;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;


public class ListTeamsActionBean extends BaseActionBean {
    @DefaultHandler
    public Resolution team() {
        List teams = PersistenceManager.findAll(Team.class);
        context.getRequest().setAttribute("teams", teams);
                return new ForwardResolution("listteams.jsp");
    }
}
