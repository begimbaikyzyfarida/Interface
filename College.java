import java.time.LocalDate;

public class College extends EducationCenter implements Study{
    public College(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }
    @Override
    public String getEducationType() {
        return "College";
    }

    @Override
    public void getStudentsEducationCenter() {

    }

    @Override
    public void getStudentsStudyingYear() {

    }
}
