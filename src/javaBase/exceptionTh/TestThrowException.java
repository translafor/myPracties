package javaBase.exceptionTh;

public class TestThrowException {
    public static void main(String[] args) {
        new TestThrowException().comopute(1,0);
    }

    public void comopute(int a,int b){
        if(b==0){
            throw new ArithmeticException("自己主动抛出的异常，一般在方法中使用");
        }
    }
}
