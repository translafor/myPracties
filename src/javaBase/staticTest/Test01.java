package javaBase.staticTest;

public class Test01 {
    public String name;
    {
        name="ssss";
        System.out.println("匿名代码块，跟着对象一起执行,用来赋初始值");
    }

    static {
        System.out.println("静态代码块，只执行一次");
    }

    public Test01(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println(test01.name);
        System.out.println("########################################");
        Test01 test011 = new Test01();
    }
}
