class Student{
    String name;
    int age;

    void display(){
        System.out.println(("Name : " + name + " Age: " + age));
    }
}

public class Class_Objects {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Avanish";
        s1. age = 22;

        s2.name = "Kumar";
        s2.age = 23;

        s1.display();
        s2.display();
    }
}