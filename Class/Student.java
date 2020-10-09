package Class;

public class Student {
    public static void main(String[] args) {
        //1.导包
        //使用的类“defination”和此文件位于同一个包内，
        // 所以省略导包语句不写

        //2.创建
        defination stu = new defination();
        //意思是根据defination类创建了一个名为stu的对象

        //3.使用成员变量
        stu.age = 19;
        stu.name = "John Wu";
        System.out.println(stu.name);
        System.out.println(stu.age);

        //4.使用成员方法
        stu.eat();
        stu.study();
        stu.sleep();
    }
}
