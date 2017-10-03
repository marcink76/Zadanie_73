public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("", "");
        Student student = new Student("", "");
        Student student2 = new Student("", "");


        teacher.setName("Mikołaj");
        teacher.setLastName("Kopernik");
        teacher.setAcademicDegree("Doktor");

        student.setName("Wojciech");
        student.setLastName("Nowak");
        student.setFaculty("Biotechnologia");

        student2.setName("Marian");
        student2.setLastName("Niepoważny");
        student2.setFaculty("Nanotechnologia");

        teacher.showInfo(teacher);
        student.showInfo(student);
        student2.showInfo(student2);


    }
}
