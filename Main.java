import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulasi Student
        System.out.print("Masukkan nama mahasiswa: ");
        String studentName = scanner.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        String studentAddress = scanner.nextLine();

        Student student = new Student(studentName, studentAddress);

        student.addCourseGrade("OOP", 85);
        student.addCourseGrade("Struktur Data", 90);
        System.out.println(student);
        student.printGrades();
        System.out.println("Rata-rata: " + student.getAverageGrade());

        // Simulasi Teacher
        System.out.print("\nMasukkan nama dosen: ");
        String teacherName = scanner.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String teacherAddress = scanner.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAddress);

        teacher.addCourse("OOP");
        teacher.addCourse("Pemrograman Web");
        teacher.removeCourse("AI");
        System.out.println(teacher);
    }
}
