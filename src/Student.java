public class Student extends Person {

    String faculty = "";

    public Student(String name, String lastName, String faculty) {
        super(name, lastName);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void showInfo(Person person) {
        //super.showInfo();
        System.out.println("Student: " + person.getName() + " " + person.getLastName() + " kierunek: " );
    }
}
