package Method;

public class methodOverload {
    public static void main(String[] args) {
        byte a = 1, b = 2;
        short c = 3, d = 3;
        int e = 345, f = 345;
        System.out.println(isSame(a,b));
        System.out.println(isSame(c,d));
        System.out.println(isSame(e,f));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("Byte method executed!");
        if(a == b)
            return true;
        else
            return false;
    }
    public static boolean isSame(int a, int b){
        System.out.println("Int method executed!");
        if(a == b)
            return true;
        else
            return false;
    }
    public static boolean isSame(short a, short b){
        System.out.println("Short method executed!");
        if(a == b)
            return true;
        else
            return false;
    }
}
