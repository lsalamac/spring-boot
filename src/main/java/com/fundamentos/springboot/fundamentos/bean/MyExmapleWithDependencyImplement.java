package com.fundamentos.springboot.fundamentos.bean;

public class MyExmapleWithDependencyImplement implements MyExampleWithDependency{

    private MyExample myExample;

    public MyExmapleWithDependencyImplement(MyExample myExample) {
        this.myExample =myExample;
    }

    @Override
    public void printMultiplicacion() {
        int numero3=10;
        System.out.println(myExample.multi(numero3));
        System.out.println("Hice una dependencia sola");
    }
}
