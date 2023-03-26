package lk.ijse.hibernate.layered.util;

/*
    @author THINUX
    @created 18-Feb-23
*/

import lk.ijse.hibernate.layered.entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private SessionFactoryConfiguration(){
        sessionFactory = new Configuration()
                .mergeProperties(Utility.getProperties())
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
    }

    public static SessionFactoryConfiguration getInstance() {
        return (null == factoryConfiguration) ?
                factoryConfiguration = new SessionFactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession() throws HibernateException {
        Session session = sessionFactory.openSession();

        return session;
    }

}
