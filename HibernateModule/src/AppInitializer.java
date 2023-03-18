/*
    @author THINUX
    @created 18-Mar-23 - 08:38 
*/

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class AppInitializer {
    public static void main(String[] args) {
        System.out.println("Hi");

        Customer c1 = new Customer();

        c1.setId(1);
        c1.setName("Thinusha");
        c1.setSalary(100000);
        c1.setAddress("Galle");

        Customer c2 = new Customer();
        c2.setId(2);
        c2.setName("Supun");
        c2.setSalary(200000);
        c2.setAddress("Galle");

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

//        session.save(c1);
        session.save(c2);

        transaction.commit();

        session.close();
    }
}
