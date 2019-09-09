package com.xulinfeng.demo.design.pattern.decorator.intro;

/**
 * 装饰角色
 *
 * @author xlfxu
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void doOperation() {
        //委派给构件
        component.doOperation();
    }
}
