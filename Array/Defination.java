package Array;

public class Defination {
    public static void main(String[] args) {
        //第一类：动态初始化
        //类型名称[] 数组名称 = new 类型名称[数组长度]
        int[] arrayInt = new int[100];
        double[] arrayDouble = new double[20];
        String[] arrayStr = new String[20];

        //第二类：静态初始化
        //标准格式：类型名称[] 数组名称 = new 类型名称[数组长度]{元素一， 元素二，...}
        //省略格式：类型名称[] 数组名称 = {元素一， 元素二，...}
        int [] staticArrayInt = new int[]{1,2,3,4,5};
        String []staticArrayStr = new String[]{"qwerty", "hello", "java"};
        System.out.println("Completed!");

        //打印输出
        System.out.println(staticArrayInt[1]);
        System.out.println(staticArrayStr[0]);
    }
}
