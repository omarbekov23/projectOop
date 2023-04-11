import model.Company;
import model.Course;
import model.Groups;
import model.Students;

/**
 * @Autor Erlan
 * project ${PROJECT_NAME}
 * $DATE
 * GOOD LUCK FOR YOUR CODING!!!
 */
public class Main {
    public static void main(String[] args) {
        Company company = new Company("oomat stroy",123l,"Образование",new String[]{"Гос"},"Kochkor-Ata",new String[]{"Azamat","Erlan"});
        company.service();
        System.out.println(company);
        System.out.println("===================================");

        Course course = new Course("IT.KG",122l,"coder in java",new String[]{"Java","Javascript"},new String[]{"Backend","Frontend"});
        course.service();
        System.out.println(course);
        System.out.println("===================================");

        Groups groups = new Groups("Java",133l,"developers",new String[]{"Java","Javascript"},50);
        groups.service();
        System.out.println(groups);
        System.out.println("===================================");

        Students students = new Students("Java",12222l,"devolopers",new String[]{"Java","Javascript"},"Backend 2");
        students.service();
        System.out.println(students);
        System.out.println("===================================");

    }
}