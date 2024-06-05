import java.util.Date;

public class Main {
    int numberOfStudent = 0;

    public static void main(String[] args) {


        Student s =new Student("Vova", "Kovalenok", "Kovalenok@pl.pl", "Minsk, Matus 4", "12-12-12-12", new Date(2001, 9, 19));
        Student s2 =new Student("Dio", "Ronny", "s30862@edu.pl", "Warsaw, Blacharska 1", "13-13-13-13", new Date(2002, 5, 2));
        StudyPrograme it = new StudyPrograme("IT", "AAA", 7, 5);

        s.enrollStudent(it);
        s2.enrollStudent(it);
        s.addGrade(5, "PGO");
        s.addGrade(4, "PPB");
        s2.promoteToTheNextSemester();


        Student.promoteAllStudents();

        Student.displayInfoAboutAllStudents();


    }
}