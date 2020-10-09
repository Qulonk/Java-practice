package Class;
/*
定义一个类来模拟学生
属性：
姓名、年龄
行为：
吃饭、睡觉、学习
成员变量：
String name;
int age;
成员方法：
public void eat()
public void sleep()
public void study()
*/
public class defination {
    //成员变量
    String name;
    int age;

    //成员方法  （不用写static关键字）
    public void eat(){
        System.out.println("Having dinner.");
    }
    public void sleep(){
        System.out.println("Go to sleep.");
    }
    public void study(){
        System.out.println("Work hard.");
    }
}
