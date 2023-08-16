import java.time.LocalDate;

public class  School extends EducationCenter implements Study {
    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public String getEducationType() {
        return "School";
    }

    @Override
    public void getStudentsEducationCenter() {

    }

    @Override
    public void getStudentsStudyingYear() {

    }
}
