package designPatterns.proxy.staticproxy;

public class Student implements Person{
    @Override
    public void soutName() {
        System.out.println("这是学生");
    }
}
