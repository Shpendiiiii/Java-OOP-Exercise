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
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getProgram(){
        return this.program;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return "Student's name: " + name + ", age: " + age + ", program: " + program + ", year: " + year;
    }

}

public class Main {
    public static void main(String[] args) {
        Student studentInst = new Student("Shpat Aliu", 44, "CS", 2);
        System.out.println(studentInst.toString());
        System.out.println(studentInst.getAge());
    }
}