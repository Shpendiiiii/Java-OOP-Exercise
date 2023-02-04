class Student{
    private String name;
    private int age;
    private String program;
    private int year;

    public Student(String name, int age, String program, int year) {
        this.name = name;
        this.age = age;
        this.program = program;
        this.year = year;
    }

    public String toString(){
        return "Student's name: " + name + ", age: " + age + ", program: " + program + ", year: " + year;
    }

}

public class Main {
    public static void main(String[] args) {
        Student shpend = new Student("Shpat Aliu", 44, "CS", 2);
        System.out.println(shpend.toString());
    }
}