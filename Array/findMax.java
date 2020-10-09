package Array;

public class findMax {
    public static void main(String[] args) {
        int [] array = {1,4,7,8,9,5,345,643,74,435,7654,34,234};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
