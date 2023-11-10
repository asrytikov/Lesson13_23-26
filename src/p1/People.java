package p1;

import java.util.Objects;

public class People{

    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

/*  @Override
    public int compareTo(People p) {
        //return name.compareTo(p.getName());
        return name.length() - p.getName().length();
    }*/

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
