package Array;

public class one {
    public static void main(String[] args) {
        int [] arrayone = new int [10];
        arrayone[0] = 123;
        arrayone[1] = 1234;
        arrayone[2] = 12345;
        arrayone[3] = 123456;
        System.out.println("第一个数组的地址是" + arrayone);
        System.out.println(arrayone[0]);
        System.out.println(arrayone[1]);
        System.out.println(arrayone[2]);
        System.out.println(arrayone[3]);

        System.out.println("==========================");

        int [] arraytwo = new int [10];
        arraytwo[0] = 23;
        arraytwo[1] = 234;
        arraytwo[2] = 2345;
        arraytwo[3] = 23456;
        System.out.println("第二个数组的地址是" + arraytwo);
        System.out.println(arraytwo[0]);
        System.out.println(arraytwo[1]);
        System.out.println(arraytwo[2]);
        System.out.println(arraytwo[3]);
    }
}
