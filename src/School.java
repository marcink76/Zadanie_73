public class School {
    public static void main(String[] args) {
        Person teacher = new Teacher("Wojciech", "Mądrowski", "Dokor");
        Person student = new Student("Maciej", "Nieuczalski", "Nanotechnologia");
        Person student2 = new Student("Tomasz", "Kujoski", "Biotechnologia");

        teacher.showInfo();
        student.showInfo();
        student2.showInfo();
    }
}
