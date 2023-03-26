package lk.ijse.hibernate.layered.repository;

/*
    @author THINUX
    @created 25-Feb-23
*/

import lk.ijse.hibernate.layered.entity.Customer;
import lk.ijse.hibernate.layered.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerRepository {
    private final Session session;

    public CustomerRepository(){
        session = SessionFactoryConfiguration.getInstance().getSession();
    }

    // Transaction Handling part
    public Long saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        /*Integer id = (Integer) session.save(customer);
        transaction.commit();*/

        try {
            Long id = (Long) session.save(customer);
            transaction.commit();
            return id;
        } catch (Exception ex) {
            transaction.rollback();
            System.out.println(ex);
            ex.printStackTrace();
            return -1L;
        }
//        return id;
    }

    public boolean updateCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(customer);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            session.close();
            return false;
        }
    }

    public Customer getCustomer(long id ){
        try {
            return session.get(Customer.class, id);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public boolean deleteCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(customer);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
            return false;
        }
    }

    // HQL - Hibernate Query Language
    public List<Customer> getAllCustomer(){
        String sqlQuery = "FROM Customer";
        Query query = session.createSQLQuery(sqlQuery);
        List list = query.list();
        return list;
    }

    public List<Customer> getAllJPQLCustomer(){
        String sql = "SELECT C FROM Customer AS C";
        Query query = session.createQuery(sql);
        List list= query.list();
        session.close();
        return list;
    }

    public List<Customer> getAllCustomerProjection(){
        String sql = "SELECT lk.ijse.hibernate.projection.CustomerDetailsDTO(C.name, C.address, C.age) FROM Customer AS C";
        Query query = session.createQuery(sql);
        List list = query.list();
        session.close();
        return list;
    }
}
