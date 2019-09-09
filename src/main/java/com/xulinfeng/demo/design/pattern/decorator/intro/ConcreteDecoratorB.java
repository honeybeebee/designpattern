package com.xulinfeng.demo.design.pattern.decorator.intro;

/**
 * 具体装饰角色
 *
 * @author xlfxu
 */
public class ConcreteDecoratorB extends Decorator {


    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        System.out.println("decorator B do");
    }
}
