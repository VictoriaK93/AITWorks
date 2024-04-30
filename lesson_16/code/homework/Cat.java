package homework;

public class Cat {

    private String breed;
    private double height;
    private double weight;
    private String nickname;

    public Cat(String breed, double height, double weight, String nickname) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
        this.nickname = nickname;
    }


    public void voice() {
        System.out.println("Meow!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


}





