package homework;

public class Dog extends Pet1 {

        private String breed;
        private double height;
        private double weight;

        public Dog(String name, String breed, double height, double weight) {
            this.breed = breed;
            this.height = height;
            this.weight = weight;
        }

        public void voice() {
            System.out.println("Woof-woof!");
        }

        public String getBreed() {
            return breed;
        }

        public double getHeight() {
            return height;
        }

        public double getWeight() {  // Corrected typo
            return weight;
        }
    }


