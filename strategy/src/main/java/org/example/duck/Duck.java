package org.example.duck;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.behavior.FlyBehavior;
import org.example.behavior.QuackBehavior;

import java.io.Serializable;

/**
 * 鸭子基类
 */
@Getter
@Setter
public abstract class Duck {

    /**
     * 飞行行为
     */
    protected FlyBehavior flyBehavior;

    /**
     * 鸭子叫行为
     */
    protected QuackBehavior quackBehavior;


    public Duck(){}

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    /**
     * 颜色
     */
    abstract public void display();

    public void swim(){
        System.out.printf("我会游泳");
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

}
