/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class Person {
//    member vars
    private String firstName;
    private String lastName;
    private String loginName;
    private String password;
//    default constructor
    Person(){
        firstName = "Default";
        lastName = "Default";
        loginName = "Default";
        password = "Default";
    }
//    2 arg constructor to pass vars to child
    Person(String firstName, String lastName, String loginName, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginName = loginName;
        this.password = password;
    }
    
    
// setters and getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return firstName + " " + lastName +
                "\nUsername: " + loginName;
    }      
}
