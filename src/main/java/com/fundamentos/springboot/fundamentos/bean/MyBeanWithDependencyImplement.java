package com.fundamentos.springboot.fundamentos.bean;

//Inyectar dos dependencias
public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero2=5;
        int numero=1;
        System.out.println(myOperation.sum(numero));
        System.out.println(myOperation.rest(numero2));
        System.out.println("Implementacion de un bean con dependencia");
    }
}
