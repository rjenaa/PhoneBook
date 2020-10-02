package listandmapsdemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList();
        people.add(new Person("Corey"));
        people.add(new Person("Ray"));

        Iterator<Person> listIterator = people.iterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        Map<Integer, String> wuMembers = new HashMap<Integer, String>();
        wuMembers.put(1,("Ray"));
        wuMembers.put(2,("Rey"));

        Iterator<Map.Entry<Integer, String>> mapIterator = wuMembers.entrySet().iterator();
        while(mapIterator.hasNext()){
            System.out.println(mapIterator.next().getKey().equals());
        }


    }
}
