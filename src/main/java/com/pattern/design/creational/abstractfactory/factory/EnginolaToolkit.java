package com.pattern.design.creational.abstractfactory.factory;

import com.pattern.design.creational.abstractfactory.component.CPU;
import com.pattern.design.creational.abstractfactory.component.EnginolaCPU;
import com.pattern.design.creational.abstractfactory.component.EnginolaMMU;
import com.pattern.design.creational.abstractfactory.component.MMU;

public class EnginolaToolkit extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
}
