package model;

import abstracty.Information;
import interfacei.Informations;

/**
 * @Autor Erlan
 * project projectOop
 * 11.04.2023
 * GOOD LUCK FOR YOUR CODING!!!
 */
public class Students extends Information implements Informations {
    private String groupName;
    public Students(){
        System.out.println("Учиться");
    }

    public Students(String groupName) {
        this.groupName = groupName;
    }

    public Students(String name, Long id, String activity, String[] department, String groupName) {
        super(name, id, activity, department);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void service() {
        System.out.println("Программирование");
    }

    @Override
    public String toString() {
        return "Students\n" +
                "groupName " + groupName + "\n" +
                 super.toString();
    }
}
