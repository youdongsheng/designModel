package org.example.behavior;

/**
 * 飞的慢
 */
public class SlowFlyBehavior implements FlyBehavior{
    public void fly() {
        System.out.println("慢慢飞");
    }
}
