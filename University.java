import java.time.LocalDate;

public class University extends EducationCenter implements Study {
    public University(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }
    @Override
    public String getEducationType() {

        return "University";
    }

    @Override
    public void getStudentsEducationCenter() {

    }

    @Override
    public void getStudentsStudyingYear() {

    }
}
