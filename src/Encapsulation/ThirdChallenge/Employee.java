package Encapsulation.ThirdChallenge;

class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name,int age){
        this.name  = name;
        this.age = age;

    }
    public void setSalary(double money) {
        this.salary = money;

    }

    public double getSalary(double money){
        return money;
    }

    public void DisplayData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }


}