package com.fundamentos.springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int sum(int numeroEntero) {
        return numeroEntero+1;
    }

    @Override
    public int rest(int Numero) {
        return Numero-2;
    }
}
