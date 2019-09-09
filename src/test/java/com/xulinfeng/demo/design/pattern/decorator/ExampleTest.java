/**
 * @Title: ExampleTest.java
 * @Description: 例子测试
 * <p>
 * Copyright(C) 2018-2019    NPlus
 * Company:   无锡核心信息科技有限公司
 * @version V1.0
 * @Date: 2019-09-09 13:33
 * <p>
 * 修改历史:
 * Date                 Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2019-09-09 13:33     xlfxu        1.0            初始化版本
 */
package com.xulinfeng.demo.design.pattern.decorator;

import com.xulinfeng.demo.design.pattern.decorator.example.Bird;
import com.xulinfeng.demo.design.pattern.decorator.example.Fish;
import com.xulinfeng.demo.design.pattern.decorator.example.Monkey;
import com.xulinfeng.demo.design.pattern.decorator.example.TheGreatestSage;
import org.junit.Test;

/**
 * 例子测试
 *
 * @author xlfxu
 */
public class ExampleTest {

    @Test
    public void test1() {
        TheGreatestSage theGreatestSage = new Monkey();

        TheGreatestSage bird = new Bird(theGreatestSage);
        bird.move();
    }

    @Test
    public void test2() {
        TheGreatestSage theGreatestSage = new Monkey();

        TheGreatestSage fish = new Fish(new Bird(theGreatestSage));

        fish.move();
    }
}
