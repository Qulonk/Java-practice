package Array;

public class reverse {
    public static void main(String[] args) {
        int [] array = {1,4,7,8,9,5,345,74,435,7654,34,234};
        int a, b, temp;
        a = array[0];
        b = array[array.length - 1];
        for (int i = 0; i < array.length/2; i++) {
            temp = a;
            array[i] = b;
            array[array.length - 1 - i] = temp;
            a = array[i + 1];
            b = array[array.length - 2 - i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
