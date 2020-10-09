package Array;

public class paramOfMethod {
    public static void main(String[] args) {
        int [] array = {1, 2, 34, 567, 8910};
        arrayAsParam(array);
        System.out.println("==========");
        int []res = arrayAsReturn(10, 20, 40);
        arrayAsParam(res);
    }
    public static void arrayAsParam(int []array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] arrayAsReturn(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int []array = {sum, avg};
        return array;
    }
}
