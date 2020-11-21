package javaBase.innerclass;

/**
 * 匿名内部类
 */
public class Test03 {
    public static void main(String[] args) {

        new T3(){

        }.t3s();

//        new IN3(){
//            @Override
//            public void hello() {
//                System.out.println("sss");
//            }

//            @Override
//            public void ht() {
//
//            }
//        }.hello();

       IN3 in3 =  ()->{

               System.out.println("sss");
        };
       in3.hello();
    }
}


class T3{
    public void t3s(){
        System.out.println("SS");
    }
}

interface IN3{
    void hello();
//    void ht();
}