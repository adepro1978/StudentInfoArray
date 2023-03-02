package StudentInfoArray;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Tools {
    static List<Student> studentList = new ArrayList<>(100);

    //method to show operation list.
    public static void listOperations() {

        System.out.printf(
                "  1. Add new student %n" +
                        "  2. View All student list %n" +
                        "  3. view a student from the list %n" +
                        "  4. Delete a student from the list %n" +
                        "  5. Delete all student from the list %n" +
                        "  6. Exit the program %n");

        System.out.println(" ");
    }

    // method that collect student info.
    static Student collectStudentInfo() {
        // studentList.add(student);
        System.out.println(" ");
        System.out.println("        ENTER STUDENT INFORMATION");

        Scanner scanner = new Scanner(System.in);
        System.out.print(" NAME : ");
        String sName = scanner.nextLine();
        System.out.print(" ID : ");
        int sId = scanner.nextInt();
        System.out.print(" DATE OF BIRTH in format(dd-MM-yyyy) : ");
        String sDateOfBirth = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate bDate = LocalDate.parse(sDateOfBirth, formatter);

        //scanner.nextLine();
        System.out.print(" ADDRESS : ");
        String sAddress = scanner.next();
        System.out.print(" GENDER: press 1. MALE, | press 2. FEMALE : ");
        int gender = scanner.nextInt();
        Gender sGender = Gender.MALE;

        if (gender == 2) {
            sGender = Gender.FEMALE;

            System.out.println(" ");

        }


        return new Student(sName, sId, bDate, sGender, sAddress);
    }

    //1. method that create new student.
    public static void createNewStudent(Student student) {
        studentList.add(student);
    }

    //2. method to view all student in the list.
    public static void viewAllStudentList() {
        drawTable();

        for (Student student : studentList) {

            String nameOfStudent = student.getStudentName();
            String addressOfStudent = student.getAddress();
            LocalDate dbOfStudent = student.getDateOfBirth();
            Gender genderOfStudent = student.getGender();
            int idOfStudent = student.getId();

            System.out.printf(" | %-25S| %-10S| %-15S| %-15S| %-15S|%n",
                              nameOfStudent, idOfStudent, dbOfStudent,
                              addressOfStudent, genderOfStudent);

        }

    }

    //3. method to view a student by name.
    public static void viewAStudentById(int iD) {
        drawTable();

        for (Student student : studentList) {
            if (student.getId() == iD) {

                String nameOfStudent = student.getStudentName();
                String addressOfStudent = student.getAddress();
                LocalDate dbOfStudent = student.getDateOfBirth();
                Gender genderOfStudent = student.getGender();
                int idOfStudent = student.getId();

                System.out.printf(" | %-25S| %-10S| %-15S| %-15S| %-15S|%n",
                                  nameOfStudent, idOfStudent, dbOfStudent,
                                  addressOfStudent, genderOfStudent);


                System.out.println(" ");

            }
        }

    }

    //4. method to delete a student from the list by id.
    public static void deleteAStudentFromListById(int iD) {
        studentList.removeIf(student -> student.getId() == iD);
    }

    //5. method to delete all student from the list.
    public static void deleteAllStudentLIst() {
        studentList.clear();
    }

    //method to draw a table of properties
    public static void drawTable() {
        System.out.printf("            ------------------------------------------------------------------%n" +
                                  "            ||||||| D-HUB SOFTWARE INSTITUTE STUDENT REGISTRATION FORM |||||||%n" +
                                  " -------------------------------------------------------------------------------------------%n" +
                                  " | %-25s| %-10s| %-15s| %-15s| %-15s|%n",
                          "  NAMEs", "IDs", " DATE OF BIRTH", " ADDRESS", " GENDER");
        System.out.println(" -------------------------------------------------------------------------------------------");
    }


    public static void goodByeMessage() {
        int n = 5;
        //Outer Loop for number of Rows
        for(int i=0;i<n;i++)
        {
            // Inner loop for printing '*' in each column.
            for(int j=0;j<n;j++)
            {
                // For first row and last row we print '*' and for every other row we print the '*' at boundary region.
                if(i==0 || i==n-1 || j==0 || j==n-1)
                {
                    System.out.print("*  ");
                    System.out.print("*  ");
                    System.out.print("* ");
                    System.out.print("*  ");
                    System.out.print("*  ");
                }
                // Otherwise we print blank space.
                else

                    System.out.print(" bye for now  ");
            }
            System.out.println();
        }
    }
}
