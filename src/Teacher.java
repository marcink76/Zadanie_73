public class Teacher extends Person {
    String academicDegree = "";

    public Teacher(String name, String lastName, String academicDegree) {
        super(name, lastName);
        this.academicDegree = academicDegree;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(getAcademicDegree());

    }
}
