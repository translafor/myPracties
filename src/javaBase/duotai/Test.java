package javaBase.duotai;

public class Test {
    public static void main(String[] args) {
        Father father = new Son();
        Son son = (Son)father;


        Father father02 = new Father();
        Son son02 = (Son)father02;
}
}
