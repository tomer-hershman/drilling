package SandayTasks.Records;

public record Student(String name, int grade, int classNumber) {
    public Student(String name, int clas){
       this(name, 9, clas);
    }

    public String studentInfo() {
        return "Student Name: " + name + ", Grade: " + grade + ", Class Number: " + classNumber;
    }

    public boolean isInHighSchool() {
        return grade > 9 && grade <= 12;
    }

}
