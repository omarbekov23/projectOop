package model;

import abstracty.Information;
import interfacei.Informations;

import java.util.Arrays;

/**
 * @Autor Erlan
 * project projectOop
 * 11.04.2023
 * GOOD LUCK FOR YOUR CODING!!!
 */
public class Company extends Information implements Informations {
    private String address;
    private String[] numberOfStaff;

    public Company() {
    }

    public Company(String name, Long id, String activity, String[] department, String address, String[] numberOfStaff) {
        super(name, id, activity, department);

    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(String[] numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    @Override
    public void service() {
        System.out.println("Service: Oil supply");

    }

    @Override
    public String toString() {
        return "Company\n" +
                 super.toString();
    }
}