package javaBase.threadTest;

/**
 * @description:
 * @projectName:myPracties
 * @see:javaBase.threadTest
 * @author:translafor
 * @createTime:2020/11/23 19:27
 * @version:1.0
 */
public class TestRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("S");
    }

    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        new Thread(testRunnable).start();
    }
}
