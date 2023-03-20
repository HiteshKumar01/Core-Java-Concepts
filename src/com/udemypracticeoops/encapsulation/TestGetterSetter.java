package com.udemypracticeoops.encapsulation;

class EncapsulationExample{
    private int id;

    private String name;
    private String address;
    private String phone;
    private Boolean isEmployed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }
}


public class TestGetterSetter {
        public static void main(String[] args){
//creating instance of the encapsulated class
            EncapsulationExample ob=new EncapsulationExample();

            ob.setId(101);
            System.out.println("ID: " + ob.getId());
            ob.setName("Hitesh");
            System.out.println("Name: " + ob.getName());
            ob.setAddress("Noida, Sector 63");
            System.out.println("Address: " + ob.getAddress());
            ob.setPhone("9843592543");
            System.out.println("Phone Number: " + ob.getPhone());
            ob.setEmployed(true);
            System.out.println("employed?(True/false) " + ob.getEmployed());
        }
    }

