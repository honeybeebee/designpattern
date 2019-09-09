package com.xulinfeng.demo.design.pattern.decorator.example;

/**
 * 变成鸟
 *
 * @author xlfxu
 */
public class Bird extends Change {
    public Bird(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("鸟儿飞呀飞。。");
    }
}
