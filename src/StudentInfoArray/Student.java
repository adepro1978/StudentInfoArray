package StudentInfoArray;

import java.time.LocalDate;

public class Student {

    private String studentName;

    private LocalDate dateOfBirth;

    private String address;

    private int id;

    private Gender gender;


    public Student(String studentName, int id, LocalDate dateOfBirth, Gender gender, String address) {
        this.studentName = studentName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;


    }

    public String getStudentName() {
        return studentName;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public String getAddress() {
        return address;
    }


    public Gender getGender() {
        return gender;
    }


    public int getId() {
        return id;
    }


}
