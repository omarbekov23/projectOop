package model;

import abstracty.Information;

/**
 * @Autor Erlan
 * project projectOop
 * 11.04.2023
 * GOOD LUCK FOR YOUR CODING!!!
 */
public class Groups extends Information {
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
    public String toString() {
        return "Groups: " +
                "studentNumber: " + studentNumber +"\n"+
                super.toString();
    }
}
