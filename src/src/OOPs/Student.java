package OOPs;

public class Student {

    private String name;
    private Integer age;
    private double marks;


    public Student (String name, Integer age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void displayInfo(){
        System.out.println("NAme:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
    }
}

