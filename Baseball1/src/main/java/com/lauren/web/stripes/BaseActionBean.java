package com.lauren.web.stripes;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public class BaseActionBean implements ActionBean {
    protected ActionBeanContext context;
    public void setContext(ActionBeanContext actionBeanContext) {
        context = actionBeanContext;
    }
    public ActionBeanContext getContext() {
        return context;
    }

}
