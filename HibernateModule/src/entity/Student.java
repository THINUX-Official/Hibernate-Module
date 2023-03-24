package entity;

/*
    @author THINUX
    @created 24-Mar-23 - 10:26 
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {
    @Id
    @Column(name = "student_id")
    private long sId;

    @Column(name = "student_name")
    private String name;

    public Student() {
    }

    public Student(long sId, String name) {
        this.sId = sId;
        this.name = name;
    }

    public long getsId() {
        return sId;
    }

    public void setsId(long sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
