package classwork_33.wrapper2.cat;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    // этот метод сравнивает текущий обьект и Cat o


    private int id ;
    private String name;
    private String bread;
    private int age;
    private double weight;

    public Cat(int id, String name, String bread, int age, double weight) {

        this.id = id;
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.weight = weight;
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

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null || getClass() != o.getClass())) return false;
        return id == cat.id;
    }

    @Override
    public int hashCode() {return id;}
    // этот метод позволяет проводить сравнение обьектов этого класса
    // он сравнивает текущий

    @Override
    public int compareTo(Cat o) {
        int res = this.age - o.age; // сравнение обьектов по полю age
        return res;
    }
}
