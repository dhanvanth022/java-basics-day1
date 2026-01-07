public class VariablesDemo {
    public static void main(String[] args) {

        int age = 20;
        double marks = 85.5;
        boolean passed = true;
        char grade = 'A';
        String name = "Dhanvanth";

        double ageDouble = age;          // implicit casting
        int marksInt = (int) marks;      // explicit casting

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + passed);
        System.out.println("Grade: " + grade);
        System.out.println("Marks (int): " + marksInt);
    }
}
