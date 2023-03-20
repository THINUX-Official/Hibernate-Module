package lk.ijse.superMarket.entity;

/*
    @author THINUX
    @created 21-Mar-23 - 00:58 
*/

import lk.ijse.superMarket.embended.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "customer")
public class Customer {
    @Id
    @Column (name = "customer_id")
    private long id;

    @Column (name = "customer_name")
    private Name name;

    @Column (name = "customer_address")
    private String address;

    @Column(name = "customer_salary")
    private double salary;

    public Customer() {
    }

    public Customer(long id, Name name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
