package org.learning.single_responsibility.employee;

public class Employee {
    private int id;
    private String name;

    public void save() {
        new Repository().save(this);
    }

    public int calculateTax() {
        return new Tax().calculateTax(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
