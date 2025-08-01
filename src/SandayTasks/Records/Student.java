package SandayTasks.Records;

public record Student(String name, int grade, int clas) {
    public Student(String name, int clas){
       this(name, 9, clas);
    }
    public void printStudentInfo() {
        System.out.print(name);
        System.out.print(" is in grade " + grade);
        System.out.println(", in class " + clas);
    }

    public boolean isInHighSchool() {
        return grade > 9 && grade <= 12;
    }

}
