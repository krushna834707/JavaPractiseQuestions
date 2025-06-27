package PractiseQue;

class Bird{
    public void fly(){
        System.out.println("I am flying");
    }
    private void cry(){
        System.out.println("They can cry");
    }
    void sing(){
        System.out.println("they can sing");
    }
    protected void dance(){
        System.out.println("they can dance");
    }

}
class peacock extends Bird{
     public void fly2(){
         fly();
         sing();
         dance();
     }
}
public class Practise1 {
    public static void main(String[] args) {
        peacock p = new peacock();
        p.fly();
        p.sing();
        //p.cry();// because it is private
        p.dance();


    }
}
