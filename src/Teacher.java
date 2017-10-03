public class Teacher extends Person {
    String academicDegree = "";

    public Teacher(String name, String lastName) {
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
    public void showInfo(Person person) {
        //super.showInfo(Person);
        System.out.println("Nauczyciel: " + person.getName() + " " + person.getLastName() + " Tytuł naukowy: " + (
                (Teacher) person).getAcademicDegree());

    }
}
