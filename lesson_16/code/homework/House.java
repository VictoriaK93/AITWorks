package homework;

public class House {
    private String typ;
    private String name;

    public House(String typ, String name) {
        this.typ = typ;
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getBreed() {
        return name;
    }

    public void setBreed(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "typ='" + typ + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void display() {


    }
    public void isSleep() {
        System.out.println(typ + name + " sleeps all day. ");
    }

    public void isEating() {
        System.out.println(typ + name + " always wants to eat.");
    }

    public void makeSound() {
        System.out.println(typ + name + " makes sounds in sleep.");
    }

    public void isPlay() { System.out.println(typ + name + " loves to play with children."); }

    public void isWalk() {
        System.out.println(typ + name + " likes to walk at night.");
    }
}

