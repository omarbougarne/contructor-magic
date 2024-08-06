package constructor;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Unknown", 0);
        System.out.println(cat.name + ", " + cat.age);
    }
}

class Cat {
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
/*
 // Define the Cat class
public class Cat {
    // Private instance variables
    private String name;
    private int age;

    // Default constructor
    public Cat() {
        // Initialize name to "Unknown"
        this.name = "Unknown";
        // Initialize age to 0
        this.age = 0;
    }

    // Main method to test the Cat class
    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat myCat = new Cat();
        // Print the values of the instance variables
        System.out.println("Cat's Name: " + myCat.name);
        System.out.println("Cat's Age: " + myCat.age);
    }
}
*/
