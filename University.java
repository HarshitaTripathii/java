public class University {
    // Static variable: shared by all students and departments
    static String universityName = "ABC University";
    static int totalStudents = 0;

    // Static method: can access static variables
    static void printUniversityInfo() {
        System.out.println("Welcome to " + universityName);
        System.out.println("Total students: " + totalStudents);
    }

    // Static nested class
    static class Department {
        String deptName;
        int deptStudents;

        Department(String name, int students) {
            this.deptName = name;
            this.deptStudents = students;
            // Update total students (static variable)
            totalStudents += students;
        }

        void printDeptInfo() {
            // Accessing static variable from outer class
            System.out.println("Department: " + deptName);
            System.out.println("Students in department: " + deptStudents);
            System.out.println("University: " + universityName);
        }
    }

    public static void main(String[] args) {
        // Access static method directly
        University.printUniversityInfo();

        // Create objects of static nested class
        University.Department cs = new University.Department("Computer Science", 120);
        University.Department ee = new University.Department("Electrical Engineering", 80);

        // Call methods of nested class
        cs.printDeptInfo();
        ee.printDeptInfo();

        // Show updated total students
        University.printUniversityInfo();
    }
}
