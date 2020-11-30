package javaBase.threadTest.runnableTest;

/**
 * @description:这不是多线程的方式
 * @projectName:myPracties
 * @see:javaBase.threadTest.runnableTest
 * @author:translafor
 * @createTime:2020/11/25 19:06
 * @version:1.0
 */
public class TurtleRabbitRun implements Runnable{

    public static String winner;//静态共享

    private int step;
    @Override
    public void run() {
        while(!checkHasWinner(step)){
            System.out.println(Thread.currentThread().getName()+"--》跑了"+step+"步");
            gogogo();
        }
    }

    private void gogogo() {
        step++;
    }

    public boolean checkHasWinner(int steps){
        if(null!=winner){
            return true;
        }
        if(steps>=100){
            winner=Thread.currentThread().getName();
            System.out.println("winner is"+winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TurtleRabbitRun turtleRabbitRun = new TurtleRabbitRun();
        TurtleRabbitRun turtleRabbitRun1 = new TurtleRabbitRun();

        new Thread(turtleRabbitRun,"龟").start();
        new Thread(turtleRabbitRun1,"兔").start();
    }
}
