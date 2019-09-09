package com.xulinfeng.demo.design.pattern.decorator.example;

/**
 * 变成鱼
 *
 * @author xlfxu
 */
public class Fish extends Change {

    public Fish(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("鱼儿游啊游。。");
    }
}
