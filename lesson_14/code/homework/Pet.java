package homework;

    public class Pet {

        private int id;
        private String name;
        private int age;
        private String nickname;

        public Pet(int id, String name, int age, String nickname) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.nickname = nickname;
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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void sleep() {
            System.out.println(name + " is sleeping soundly.");
        }

        public boolean isAlive() {
            // Replace with your logic to determine if the pet is alive
            // This is a simple example
            return true;
        }

        public void makeSound() {
            System.out.println("The pet makes a sound.");
        }

        public void play() {
            System.out.println(name + " is playing funny.");
        }

        public void walk() {
            System.out.println(name + " is going for a walk.");
        }

        @Override
        public String toString() {
            return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", nickname=" + nickname + "]";
        }
    }




