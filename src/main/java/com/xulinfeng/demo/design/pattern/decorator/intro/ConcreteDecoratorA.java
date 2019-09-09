package com.xulinfeng.demo.design.pattern.decorator.intro;

/**
 * 具体装饰角色
 *
 * @author xlfxu
 */
public class ConcreteDecoratorA extends Decorator {


    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        System.out.println("decorator A do");
    }
}
