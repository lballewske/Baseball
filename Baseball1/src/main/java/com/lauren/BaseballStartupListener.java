package com.lauren;

import com.lauren.db.HibernateUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BaseballStartupListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        HibernateUtil.initialize();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
