/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice6;

/**
 *
 * @author druid
 */
public class Item {
    private String name;
    private float value;
//    default constructor
    Item(){
    name = "Default";
    value = 0;
    }
//    2 arg constructor so values can be passed in
//    remember String is an obj and float is a primitive data type
    Item(String name, float value){
//        "this" is a reference variable to the current obj
// the var attached to this is a class variable and on the right
// of the = is the var passed in
       this.name = name;
       this.value = value;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Value: " + value);
    }
// can generate getters and setters by right
//    clicking on a line> insert code> getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
}
// note multiple classes in one file
// can extend many subclasses off of the superclass so code is not
// repeated, just call it from the superclass
class Weapon extends Item {
    int damage;
//    default constructor to set default values
    Weapon(){
        damage = 1;
    }
//    multi arg constructor to pass real values or updated values
//    note the first to args are inherited from the superclass
    Weapon(String name, float value, int damage){
//        calls the superclass for the values
//          note any calls to super must be first line inside subclass constructor
        super(name, value);
//        reference subclass var not inherited
        this.damage = damage;
    }
//    subclass method that also calls superclass method
    void display(){
//        calls superclass method
        super.display();
//        regular method action
        System.out.println("Damage: " + damage);
    }
}
//creates a subclass off of a subclass. Weapon is now a parent class
class Sword extends Weapon {
//    default constructor
    Sword(){
//    calls Weapon and adds default values to the sword for name, value, damage
// note only single level inheritance in java
        super("Iron Sword", 30, 10);
    }
//    now we have a constructor with args so you can mod the values
    Sword(String name, float value, int damage){
        super(name, value, damage);
    }
}