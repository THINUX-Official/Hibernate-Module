package lk.ijse.superMarket.util;

/*
    @author THINUX
    @created 20-Mar-23 - 09:44 
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration();
    }

    public static FactoryConfiguration getInstance(){
        return factoryConfiguration == null ? new FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }

}
