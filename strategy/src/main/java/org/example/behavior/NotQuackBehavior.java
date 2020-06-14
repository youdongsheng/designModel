package org.example.behavior;

/**
 * 不会叫
 */
public class NotQuackBehavior implements QuackBehavior{

    public void quack() {
        System.out.println("不会叫");
    }
}
