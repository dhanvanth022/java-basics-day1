public class StudentInfo {
    public static void main(String[] args) {

        String s1 = "Ravi";
        int a1 = 20;
        double m1 = 78.5;

        String s2 = "Anita";
        int a2 = 21;
        double m2 = 85.0;

        String s3 = "Kiran";
        int a3 = 19;
        double m3 = 90.5;

        double average = (m1 + m2 + m3) / 3;

        System.out.println("Student Details:");
        System.out.println(s1 + " | Age: " + a1 + " | Marks: " + m1);
        System.out.println(s2 + " | Age: " + a2 + " | Marks: " + m2);
        System.out.println(s3 + " | Age: " + a3 + " | Marks: " + m3);
        System.out.println("Average Marks: " + average);
    }
}
