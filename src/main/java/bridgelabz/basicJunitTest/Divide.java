package bridgelabz.basicJunitTest;

public class Divide {
    public int a;
    public int b;

    public Divide(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int divide(int a, int b) {
        if(b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}
