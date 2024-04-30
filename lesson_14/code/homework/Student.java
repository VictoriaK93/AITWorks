package homework;

public class Student {

        private int id;
        private String name;
        private String surname;
        private int yearOfBirth;
        private String specialization;

        public Student(int id, String name, String surname, int yearOfBirth, String specialization) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.yearOfBirth = yearOfBirth;
            this.specialization = specialization;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public String getSpecialization() {
            return specialization;
        }

        public void setSpecialization(String specialization) {
            this.specialization = specialization;
        }

        public void display() {
            System.out.println("Student Info:");
            System.out.println("  ID: " + id);
            System.out.println("  Name: " + name + " " + surname);
            System.out.println("  Year of Birth: " + yearOfBirth);
            System.out.println("  Specialization: " + specialization);
        }

        public void study() {
            System.out.println(name + " is diligently studying.");
        }

        public void takeVacation() {
            System.out.println(name + " is taking a well-deserved vacation.");
        }

        public void passExam() {
            System.out.println(name + " successfully passed the exam!");
        }

        // Additional methods can be implemented here (e.g., enrollInCourse)
    }

