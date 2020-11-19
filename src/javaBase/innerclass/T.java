package javaBase.innerclass;

public class T {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        Test01.Test02 test02 = test01.new Test02();

    }
}
