package com.pattern.design.creational.abstractfactory.factory;

import com.pattern.design.creational.abstractfactory.component.CPU;
import com.pattern.design.creational.abstractfactory.component.EmberCPU;
import com.pattern.design.creational.abstractfactory.component.EmberMMU;
import com.pattern.design.creational.abstractfactory.component.MMU;

public class EmberToolkit extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
