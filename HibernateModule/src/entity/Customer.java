package entity;

/*
    @author THINUX
    @created 18-Mar-23 - 08:40 
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "customer")
public class Customer {
    @Id
    @Column (name = "customer_id")
    private long id;

    @Column (name = "customer_name")
    private String name;

    @Column(name = "customer_salary")
    private double salary;

    @Column(name = "customer_address")
    private String address;

    public Customer() {
    }

    public Customer(long id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
