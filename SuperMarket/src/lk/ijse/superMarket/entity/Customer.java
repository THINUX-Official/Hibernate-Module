package lk.ijse.superMarket.entity;

/*
    @author THINUX
    @created 21-Mar-23 - 00:58 
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "customer")
public class Customer {
    @Id
    @Column (name = "customer_id")
    long id;

    @Column (name = "customer_name")
    String name;




}
