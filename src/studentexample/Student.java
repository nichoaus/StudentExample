/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentexample;

/**
 *
 * @author acsni
 */
public class Student {
    
    private String name;
    private int age;
    private String address;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
