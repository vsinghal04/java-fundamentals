// Superclass
class SuperClass {
    private int privateNumber = 42;  // Private member
}

// Derived class
class DerivedClass extends SuperClass {
    public void displayPrivateMember() {
        // Trying to access privateNumber directly will cause a compilation error
        // Uncommenting the line below will cause a compile-time error
        // System.out.println("Private number: " + privateNumber);
        
        System.out.println("Cannot access privateNumber directly from the subclass.");
    }
}

// Main class
public class exp5q1{
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
        derived.displayPrivateMember();
    }
}