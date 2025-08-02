package SandayTasks.Records;

public record Student(String name, int grade, int classNumber) {
    public Student(String name, int clas){
       this(name, RecordConstants.MY_GRADE, clas);
    }

    public String studentInfo() {
        return "Student Name: " + name + ", Grade: " + grade + ", Class Number: " + classNumber;
    }

    public boolean isInHighSchool() {
        return grade >= RecordConstants.MIN_HIGH_SCHOOL_GRADE && grade <= RecordConstants.MAX_HIGH_SCHOOL_GRADE;
    }

}
