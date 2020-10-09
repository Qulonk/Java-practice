package ObjectOriented;

import java.util.Arrays;

public class POandOO {
    public static void main(String[] args) {

        //面向过程：每个细节亲历亲为
        System.out.print("[");
        int []a = {1,2,34,567,8910};
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1){
                System.out.println(a[a.length - 1] + "]");
            }
            else {
                System.out.print(a[i] + ", ");
            }
        }

        System.out.println("===============");

        //面向对象：直接使用现成的功能，不关心具体步骤
        System.out.println(Arrays.toString(a));
    }
}
