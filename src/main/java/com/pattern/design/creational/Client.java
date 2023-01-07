package com.pattern.design.creational;

import com.pattern.design.creational.abstractfactory.enums.Architecture;
import com.pattern.design.creational.abstractfactory.factory.AbstractFactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory emberFactory = AbstractFactory.getFactory(Architecture.EMBER);
        AbstractFactory enginolaFactory = AbstractFactory.getFactory(Architecture.ENGINOLA);

        System.out.println(emberFactory);
        System.out.println(emberFactory.createCPU());
        System.out.println(emberFactory.createMMU());

        System.out.println(enginolaFactory);
        System.out.println(enginolaFactory.createCPU());
        System.out.println(enginolaFactory.createMMU());
    }
}
