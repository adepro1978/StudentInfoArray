package StudentInfoArray;

import java.util.Scanner;

public class StudentInfoRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int operation;

        do {
            System.out.println("STUDENT REGISTRATION FORM PROGRAM WITH THE FOLLOWING OPTION");
            Tools.listOperations();
            System.out.println("Enter you prefer option : ");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    //Create new student
                    do {
                        System.out.print(" Press 1 to add new student or press 2 to go back to main Option : ");
                        operation = scanner.nextInt();
                        if (operation == 1) {
                            Student student = Tools.collectStudentInfo();
                            Tools.createNewStudent(student);
                        }
                        System.out.println(" ");

                    } while (operation != 2);
                    break;
                case 2:
                    //view all student
                    do {
                        Tools.viewAllStudentList();
                        System.out.println(" ");
                        System.out.print("Press 2 to go back to the main Option : ");
                        operation = scanner.nextInt();

                        System.out.println(" ");


                    } while (operation != 2);
                    break;

                case 3:
                    //view a student BY ID
                    do {
                        System.out.print(" press 1 to view a student or press 2 to go to main Option : ");
                        operation = scanner.nextInt();

                        if (operation == 1) {
                            System.out.print(" Enter student id to view : ");
                            int viewId = scanner.nextInt();
                            Tools.viewAStudentById(viewId);

                        } else {
                            System.out.println("Student with this ID does not exist please input a valid ID. ");
                        }

                        System.out.println(" ");

                    } while (operation != 2);
                    break;

                case 4:
                    //delete a student BY ID
                    do {
                        System.out.print(" press 1 to remove a student or press 2 to go to main option : ");
                        operation = scanner.nextInt();
                        if (operation == 1) {
                            System.out.println(" Enter student id to remove : ");
                            int id = scanner.nextInt();
                            Tools.deleteAStudentFromListById(id);
                        }

                    } while (operation != 2);
                    break;

                case 5:
                    // delete all student
                    Tools.deleteAllStudentLIst();
                    break;

                case 6:
                    //quit the program
                    Tools.goodByeMessage();
                    System.out.println(" ");
                    System.exit(1);
                    break;
            }

        } while (operation != 6);
    }
}
