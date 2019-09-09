package com.xulinfeng.demo.design.pattern.decorator.intro;

/**
 * 具体构件角色
 *
 * @author xlfxu
 */
public class ConcreteComponent implements Component {

    @Override
    public void doOperation() {
        System.out.println("default do ");
    }
}
