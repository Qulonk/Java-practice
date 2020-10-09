package Class;

import Array.one;

public class definationParam {
    public static void main(String[] args) {
        defination one  = new defination();
        one.name = "John";
        one.age = 23;
        method(one);
        method(getstu());
    }
    public static void method(defination one){  // 类作为参数
        System.out.println(one.age);
        System.out.println(one.name);
        one.sleep();
        one.eat();
        one.study();
    }
    public static defination getstu(){      // 类作为返回值
        defination two = new defination();
        two.name = "Alice";
        two.age = 19;
        return two;
    }
}
