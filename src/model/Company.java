package model;

import abstracty.Information;

/**
 * @Autor Erlan
 * project projectOop
 * 11.04.2023
 * GOOD LUCK FOR YOUR CODING!!!
 */
public class Company extends Information {
    private String address;
    private String[] numberOfStaff;

    public Company(String address, String[] numberOfStaff) {
        this.address = address;
        this.numberOfStaff = numberOfStaff;
    }

    public Company(String name, Long id, String activity, String[] department, String address, String[] numberOfStaff) {
        super(name, id, activity, department);
        this.address = address;
        this.numberOfStaff = numberOfStaff;
    }

    public Company() {
    }


}
