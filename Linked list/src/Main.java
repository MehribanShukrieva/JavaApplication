import java.util.LinkedList;

class Main {
    public static void main(String[] args){

        // create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // add elements to LinkedList
        languages.add("Swift");
        languages.add("Python");
        System.out.println("LinkedList: " + languages);

        // add element at the specified position
        languages.add(0, "Java");
        System.out.println("Updated LinkedList: " + languages);


        LinkedList<String> days = new LinkedList<>();
        days.add("Monday");

        // Add all elements of mammals in animals
        days.addAll(languages);
        System.out.println("Days: " + days);
    }
}