import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        //example 1
        LinkedList<String> languages = new LinkedList<>();

        // add elements in LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        System.out.println("LinkedList: " + languages);

        // remove elements from index 1
        String str = languages.remove(3);
        System.out.println("Removed Element: " + str);
        System.out.println("Updated LinkedList: " + languages);

        // remove all the elements
        languages.clear();
        System.out.println("LinkedList after clear(): " + languages);

        //example 2
        //create an ArrayList
        ArrayList<String> animals= new ArrayList<>();
        // add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);

        // creating an object of ListIterator
        ListIterator<String> listIterate = animals.listIterator();
        listIterate.next();

        // Remove element returned by next()
        listIterate.remove();
        System.out.println("New LinkedList: " + animals);

        //example 3
        LinkedList<Integer> numbers = new LinkedList<>();
        // add elements in LinkedList
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("LinkedList: " + numbers);

        // remove all elements less than 4
        numbers.removeIf((Integer i) -> i < 4);
        System.out.println("Updated LinkedList: " + numbers);
    }
}