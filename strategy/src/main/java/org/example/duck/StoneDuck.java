package org.example.duck;

import org.example.behavior.FlyBehavior;
import org.example.behavior.QuackBehavior;

/**
 * 石头鸭
 */
public class StoneDuck extends Duck{

    public StoneDuck(){
        super();
    }

    public StoneDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior,quackBehavior);
    }
    public void display() {
        System.out.println("我是一只石头鸭子");
    }
}
