package Array;

public class traversal {
    public static void main(String[] args) {
        int [] array = new int [30];
        for (int i = 0; i < 30; i++) {
            array[i] = 2*i + 3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }
}
