package org.example.behavior;

/**
 * 不会飞
 */
public class NotFlyBehavior implements FlyBehavior{
    public void fly() {
        System.out.println("我不会飞");
    }
}
