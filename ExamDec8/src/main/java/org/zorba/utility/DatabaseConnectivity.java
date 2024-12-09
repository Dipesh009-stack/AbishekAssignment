package org.zorba.utility;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.zorba.entity.General;
import org.zorba.entity.Passanger;
import org.zorba.entity.PhysicallyHandicapp;
import org.zorba.entity.SeniorCitizen;

public class DatabaseConnectivity {
    public static SessionFactory getSession() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Passanger.class);
        configuration.addAnnotatedClass(General.class);
        configuration.addAnnotatedClass(PhysicallyHandicapp.class);
        configuration.addAnnotatedClass(SeniorCitizen.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        System.out.println("Connection Established...");

        return sessionFactory;
    }
}
