package abstracty;

import java.util.Arrays;

/**
 * @Autor Erlan
 * project projectOop
 * 11.04.2023
 * GOOD LUCK FOR YOUR CODING!!!
 */
public abstract class Information {
    private String name;
    private Long id;
    private String activity;
    private String[] department;

    public Information() {
    }

    public Information(String name, Long id, String activity, String[] department) {
        this.name = name;
        this.id = id;
        this.activity = activity;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String[] getDepartment() {
        return department;
    }

    public void setDepartment(String[] department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Information\n" +
                "name " + name + "\n" +
                "id " + id + "\n" +
                "activity " + activity + "\n" +
                "department " + Arrays.toString(department);
    }
}
