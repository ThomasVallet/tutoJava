package org.example.demo.ticket.webapp.rest.resource;


import org.example.demo.ticket.business.impl.ManagerFactoryImpl;

public abstract class AbstractResource {

    private static ManagerFactoryImpl managerFactoryImpl;

    protected static ManagerFactoryImpl getManagerFactoryImpl() {
        return managerFactoryImpl;
    }
    public static void setManagerFactory(ManagerFactoryImpl pManagerFactoryImpl) {
        managerFactoryImpl = pManagerFactoryImpl;
    }
}