package javaBase.threadTest.runnableTest;

/**
 * @description:
 * @projectName:myPracties
 * @see:javaBase.threadTest.runnableTest
 * @author:translafor
 * @createTime:2020/11/25 19:21
 * @version:1.0
 */
public class TurtleRabbitRun2 implements Runnable{
    public static String winner;//静态共享

    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            if(checkHasWinner(i)){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"--》跑了"+i+"步");
        }
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
        TurtleRabbitRun2 turtleRabbitRun = new TurtleRabbitRun2();

        new Thread(turtleRabbitRun,"龟").start();    //两个线程的方法交替执行--方法内是独立的
        new Thread(turtleRabbitRun,"兔").start();
    }
}