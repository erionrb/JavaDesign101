package com.pattern.design.creational.abstractfactory.factory;

import com.pattern.design.creational.abstractfactory.component.CPU;
import com.pattern.design.creational.abstractfactory.component.MMU;
import com.pattern.design.creational.abstractfactory.enums.Architecture;

public abstract class AbstractFactory {
    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

    public static AbstractFactory getFactory(Architecture architecture) {
        return switch (architecture) {
            case EMBER -> EMBER_TOOLKIT;
            case ENGINOLA -> ENGINOLA_TOOLKIT;
        };
    }

    public abstract CPU createCPU();

    public abstract MMU createMMU();
}
