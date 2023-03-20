package lk.ijse.superMarket;

/*
    @author THINUX
    @created 20-Mar-23 - 09:34 
*/

import lk.ijse.superMarket.entity.Item;
import lk.ijse.superMarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        System.out.println("Hi");
        Item i1 = new Item();

        i1.setCode(1);
        i1.setDesc("Keyboard");
        i1.setPrice(2500);
        i1.setQty(10);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        //save
        session.save(i1);

        //update
//        session.update(i1);

        //get
//        Item ii = session.get(Item.class, 1l);
//        System.out.println(ii);

        //delete (all the delete methods given below)
//        session.delete(i1);

//        Item ii = session.get(Item.class, 1l);
//        session.delete(ii);

//        Item ii = new Item();
//        ii.setCode(1l);
//        session.delete(ii);

        transaction.commit();

        session.close();
    }
}
