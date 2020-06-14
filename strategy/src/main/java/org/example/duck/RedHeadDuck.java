package org.example.duck;

import org.example.behavior.FlyBehavior;
import org.example.behavior.QuackBehavior;

/**
 * 红头鸭
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        super();
    }

    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior,quackBehavior);
    }

    public void display() {
        System.out.println("我是一只红头鸭");
    }


}
