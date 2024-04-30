package homework;

 public class Pet1 {
    public static void main(String[]args) {
        Cat cat = new Cat("Persian",40,3.3, "Kitty");
        Dog dog = new Dog("Rex","Pitbull", 30,28 );

        System.out.println("The cat:" + cat);
        System.out.println("The dog:"+ dog);

        cat.voice();
        System.out.println("The cat meows:" + "Miau!");
        dog.voice();
        System.out.println("he dog barks:" + " Gav- gav!");


    }
 }



