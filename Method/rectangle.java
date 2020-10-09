package Method;



public class rectangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            rectangle();
            System.out.println();
        }
    }
    public static void rectangle(){
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
