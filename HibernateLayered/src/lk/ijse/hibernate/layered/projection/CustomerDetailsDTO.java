package lk.ijse.hibernate.layered.projection;

/*
    @author THINUX
    @created 11-Mar-23 - 16:07 
*/

public class CustomerDetailsDTO {
    private String name;
    private String address;
    protected int age;

    public CustomerDetailsDTO() {
    }

    public CustomerDetailsDTO(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
