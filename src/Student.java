public class Student {

    // Creating static variable
    static int id = 101;

    // Creating static block
    static {
        System.out.println("\nHi, I am static block");
    }

    // Creating static method
    static void displayName() {
        System.out.println("Name : Diwakar Kumar");
    }
}

class Main {
    public static void main(String[] args) {

        // Printing static variable value without creating object of class.
        System.out.println("\nId : "+Student.id);

        // Calling function displayName() without creating object of class.
        Student.displayName();
    }
}