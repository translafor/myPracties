package designPatterns.proxy.staticproxy;

/**
 * @description:
 * @projectName:myPracties
 * @see:designPatterns.proxy.staticproxy
 * @author:translafor
 * @createTime:2020/11/23 19:38
 * @version:1.0
 */
public class TestStaticProxy {

    //  https://www.cnblogs.com/cC-Zhou/p/9525638.html

    public static void main(String[] args) {
        Student student = new Student();

        new Proxy(student).soutName();
    }

}
