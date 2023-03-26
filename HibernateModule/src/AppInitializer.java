/*
    @author THINUX
    @created 18-Mar-23 - 08:38 
*/

import entity.Customer;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class AppInitializer {
    public static void main(String[] args) {
        System.out.println("Hi");

        /*Customer c1 = new Customer();

        c1.setId(1);
        c1.setName("Thinusha");
        c1.setSalary(100000);
        c1.setAddress("Galle");

        Customer c2 = new Customer();
        c2.setId(2);
        c2.setName("Supun");
        c2.setSalary(200000);
        c2.setAddress("Galle");*/

        Student s1 = new Student();

        s1.setsId(1L);
        s1.setName("Thinusha");

        Laptop l1 = new Laptop();

        l1.setlId(1L);
        l1.setDesc("ASUS");
        l1.setStudent(s1);

        Student s2 = new Student();

        s2.setsId(2L);
        s2.setName("Supun");

        Laptop l2 = new Laptop();

        l2.setlId(2L);
        l2.setDesc("HP");
        l2.setStudent(s2);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        /*// Every code should be in between here.

        // for save customer
        session.save(c2);

        // for update customer
        session.update(c1);

        // for get customer
        Customer c = session.get(Customer.class, 1l);
        System.out.println(c);
        System.out.println(c.getName() + " - " + c.getAddress());

        // for delete customer
        Customer c = new Customer();
        c.setId(2l);
        session.delete(c);*/

        session.save(s2);
        session.save(l2);

        transaction.commit();

        session.close();
    }
}
