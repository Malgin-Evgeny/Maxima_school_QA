package org.example;
// Data Transfer Object DTO
// POJO Plain Old Java Object
public class Employee {
    public Integer id;
    public String firstName;
    public String lastName;
    public String location;

    //Setters and Getters

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", location=" + location + "]";
    }
}
