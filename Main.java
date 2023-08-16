import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        EducationCenter university = new School("AUCA", "Bishkek", LocalDate.of(1990, 8, 21));
        EducationCenter school = new School("Arykbai Osmonov", "Osh", LocalDate.of(1978, 3, 10));
        EducationCenter college = new School("Ala-Too", "Naryn", LocalDate.of(1923, 6, 11));

        Student[] students = {
                new Student("Amanda", "Abdullaeva", "Female", LocalDate.of(2021, 7, 18), university),
                new Student("Farida", "Begimbai kyzy", "Female", LocalDate.of(2022, 7, 18), school),
                new Student("Ainazik", "Mamaeva", "Female", LocalDate.of(2021, 7, 18), college),
                new Student("Aigerim", "Kandybekova", "Female", LocalDate.of(2022, 7, 18), university),
                new Student("Bota", "Kasymova", "Female", LocalDate.of(2005, 7, 18), school),
                new Student("Sadraddin", "Ahmetov", "Female", LocalDate.of(2021, 7, 18), college),
                new Student("Asman", "Jandarbekov", "Female", LocalDate.of(1999, 7, 18), university),
                new Student("Nurtilek", "Okenov", "Female", LocalDate.of(2009, 7, 18), school),
                new Student("Nuriza", "Saidinbekova", "Female", LocalDate.of(2021, 7, 18), college),
                new Student("Zalkabek", "Zalkarbekov", "Female", LocalDate.of(2022, 7, 18), university)
        };
        method(students);
    }
    public static void method(Student[] students) {
        for (Student student : students) {
            System.out.println("-----------------------------------------");
            System.out.println("Student name:\n"+ student.getName());
            System.out.println("Student surname:\n"+ student.getSurname());
            System.out.println("Student gender:\n"+ student.getGender());
            System.out.println("Student date of start:\n"+ student.getDateOfStart());
            System.out.println("Student Education Center:\n" + student.getEducationCenter().getEducationType());
            System.out.println("Kancha jyl okudu:"+student.getYearsStudied());
            System.out.println("-----------------------------------------");
        }
    }
}
