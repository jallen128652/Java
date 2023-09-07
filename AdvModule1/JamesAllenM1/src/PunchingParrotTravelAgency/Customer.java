/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class Customer extends Person {
    private String loginName;
    private String password;
    private String address;
    private String phoneNumber;
    
//   default constructor
    Customer(){
//        default vals
        loginName = "Default";
        password = "Default";
        address = "Default";
        phoneNumber = "Default";
    }
//    overloaded constructor
    Customer(String firstName, String lastName, String loginName, String password,
            String address, String phoneNumber){
//        pulls vals from person
        super(firstName, lastName);
//        reference subclass var not inherited 
        this.loginName = loginName;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
//        calls the superclass toString() and adds subclass prints
//        note call to super must be the first thing AFTER the return not before on a toString() fx
        return super.toString() + " Welcome, login successful!\nAccount details:" + 
               "\nUsername: " + loginName + 
               "\nAddress: " + address +
               "\nPhone number: " + phoneNumber + "\n";
    }   
}
