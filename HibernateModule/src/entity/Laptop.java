package entity;

/*
    @author THINUX
    @created 24-Mar-23 - 10:26 
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "laptop")
public class Laptop {
    @Id
    @Column(name = "laptop_id")
    private long lId;

    @Column(name = "laptop_description")
    private String desc;

    @OneToOne
    private Student student;

    public Laptop() {
    }

    public Laptop(long lId, String desc, Student student) {
        this.lId = lId;
        this.desc = desc;
        this.student = student;
    }

    public long getlId() {
        return lId;
    }

    public void setlId(long lId) {
        this.lId = lId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lId='" + lId + '\'' +
                ", desc='" + desc + '\'' +
                ", student=" + student +
                '}';
    }
}
