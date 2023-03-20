package lk.ijse.superMarket.entity;

/*
    @author THINUX
    @created 20-Mar-23 - 09:50 
*/

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column (name = "item_code")
    private long code;

    @Column(name = "item_description")
    private String desc;

    @Column(name = "item_price")
    private double price;

    @Column(name = "item_quantity")
    private int qty;

    @Transient
    int count;

    @CreationTimestamp
    Date date;

    public Item() {
    }

    public Item(long code, String desc, double price, int qty) {
        this.code = code;
        this.desc = desc;
        this.price = price;
        this.qty = qty;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
