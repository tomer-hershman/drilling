package SandayTasks.Records;

public class RecordsHelperClass {
    public static void printStudentInfo(Student student) {
        student.printStudentInfo();
        if (student.isInHighSchool()) {
            System.out.println(student.name() + " is in high school.");
        } else {
            System.out.println(student.name() + " is not in high school.");
        }
    }
    public static void printMe(){
        Student tomer = new Student(RecordConstants.MY_NAME, RecordConstants.MY_GRADE, RecordConstants.MY_CLASS);
        RecordsHelperClass.printStudentInfo(tomer);
    }

}
