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
public class Course extends Information implements Informations {
    private String [] numberOfGroups;
    public Course() {
    }

    public Course(String []numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public Course(String name, Long id, String activity, String[] department, String []numberOfGroups) {
        super(name, id, activity, department);
        this.numberOfGroups = numberOfGroups;
    }

    public Course(String s, long l, String java, String[] strings) {
    }

    public String []getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(String[] numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @Override
    public void service() {
        System.out.println("Teaching students");
    }

    @Override
    public String toString() {
        return "Course\n" +
                "numberOfGroups " + Arrays.toString(numberOfGroups)+"\n"+
                 super.toString();
    }
}