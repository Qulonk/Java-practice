package Method;

public class method {
    public static void main(String[] args) {
        //define method
        int a = 4, b = 2;
        //double b = demo1(4, 5);
        System.out.println(b);
        System.out.println(isdouble(a, b));
        System.out.println(sum(1,2, 3));

    }
    public static double demo1(int a, double r){
        System.out.println("aoc");
        r *= 10;
        return (double)a*r;
    }
    public static boolean isdouble(int a, int b){
        if(a == b * 2)
            return true;
        else
            return false;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int a, int b, int c, int d){
        return a+b+d;
    }
}
