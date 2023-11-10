package p1;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Comparator<People> peopleComparator = new PeopleNameComparator().thenComparing(new PeopleAgeComparator());
        TreeSet<People> peoples = new TreeSet<>(peopleComparator);
        peoples.add(new People("Alex", 32));
        peoples.add(new People("Ivan", 31));
        peoples.add(new People("Ivan", 31));

        System.out.println(peoples);
    }

}

class PeopleNameComparator implements Comparator<People>{

    @Override
    public int compare(People people, People people2) {
        return people.getName().compareTo(people2.getName());
    }
}

class PeopleAgeComparator implements Comparator<People>{

    @Override
    public int compare(People people, People people2) {
        if (people.getAge()>people2.getAge())
            return 1;
        else if (people.getAge()<people2.getAge())
            return -1;
        else
        return 0;
    }
}

