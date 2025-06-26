package PractiseQue;

//define a student class with fields like name and age , and use toString to print student details.

class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;

    }

    public String toString(){
        return "name is:"+name+" and age is :"+age;
    }

}
public class Que70 {
    public static void main(String[] args) {
        Student s1 = new Student("krushna",19);
        System.out.println(s1);
    }
}
