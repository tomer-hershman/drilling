package SandayTasks.Records;

public record Student(String name, int grade, char clas) {
    public void printStudentInfo() {
        System.out.print(name);
        System.out.print(" is in grade " + grade);
        System.out.println(", in class " + clas);
    }

}
