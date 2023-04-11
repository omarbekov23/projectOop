package model;

import abstracty.Information;
import interfacei.Informations;

/**
 * @Autor Erlan
 * project projectOop
 * 11.04.2023
 * GOOD LUCK FOR YOUR CODING!!!
 */
public class Groups extends Information implements Informations {
    private int studentNumber;
    public Groups(){

    }

    public Groups(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Groups(String name, Long id, String activity, String[] department, int studentNumber) {
        super(name, id, activity, department);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public void service() {
        System.out.println("Деление по направлениям");
    }

    @Override
    public String toString() {
        return "Groups\n" +
                "studentNumber " + studentNumber +"\n"+
                super.toString();
    }
}
