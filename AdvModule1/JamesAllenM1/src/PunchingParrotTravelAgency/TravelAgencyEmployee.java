/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;
/**
 *
 * @author druid
 */
public class TravelAgencyEmployee extends Person{
//    needs to inherit name from person class
    private int empId;
    private String hireDate;
    private double salary;
    public boolean isManager;
//    default constructor
    TravelAgencyEmployee(){
        empId = 0;
//        default date format as a string though
        hireDate = "20230906";
//        weekly salary
        salary = 1500;
        isManager = false;
    }
//    overloaded constructor
    TravelAgencyEmployee(String firstName, String lastName, String loginName, String password, int empId, String hireDate, double salary, boolean isManager){
//        calls Person class for these vals
        super(firstName, lastName, loginName, password);
//        reference subclass vars not inherited
        this.empId = empId;
        this.hireDate = hireDate;
        this.salary = salary;
        this.isManager = isManager;
    }
    
    
//    using the fancy new insert code tool 

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }  

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
//        note call to super must be the first thing AFTER the return not before on a toString() fx
        return super.toString() + " Employee information: " + 
               "\nEmployee ID: " + empId +
               "\nHire date: " + hireDate +
               "\nWeekly salary: $" + String.format("%.2f", salary) + 
               "\nEmployee is a manager? " + isManager + "\n";
    }    
}
