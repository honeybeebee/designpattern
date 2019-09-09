package com.xulinfeng.demo.design.pattern.decorator.example;

/**
 * 七十二变
 *
 * @author xlfxu
 */
public class Change implements TheGreatestSage {

    private TheGreatestSage theGreatestSage;

    public Change(TheGreatestSage theGreatestSage) {
        this.theGreatestSage = theGreatestSage;
    }

    @Override
    public void move() {
        theGreatestSage.move();
    }


}
