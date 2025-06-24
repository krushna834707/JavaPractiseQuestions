package PractiseQue;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        FactorialUsingRecursion f = new FactorialUsingRecursion();
        System.out.println("Factorial using recursion:"+f.factorialByRec(5));

    }

    public int factorialByRec(int x){
            if (x==0 || x==1) {
                return 1;
            }else{
                return x * factorialByRec(x-1);
            }
    }
}
