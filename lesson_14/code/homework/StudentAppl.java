package homework;

public class StudentAppl {

        public static void main(String[] args) {
            Student alla = new Student(133, "Alla", "Klein", 2001, "History");
            Student bradly= new Student(456, "Bradly", "Kuper", 1995, "Biology");

            alla.display();
            bradly.display();

            // Simulate the learning process
            alla.study();
            bradly.takeVacation();
            alla.passExam();

        }
    }



