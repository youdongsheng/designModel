package org.example;

import org.example.behavior.FastFlyBehavior;
import org.example.behavior.GuaQuackBehavior;
import org.example.behavior.NotFlyBehavior;
import org.example.behavior.NotQuackBehavior;
import org.example.duck.Duck;
import org.example.duck.RedHeadDuck;
import org.example.duck.StoneDuck;

public class ClientMain {

    public static void main(String[] args) {

        Duck duck = new RedHeadDuck(new FastFlyBehavior(), new GuaQuackBehavior());
        duck.display();
        duck.fly();
        duck.quack();

        duck = new StoneDuck(new NotFlyBehavior(),new NotQuackBehavior());
        duck.display();
        duck.fly();
        duck.quack();

    }
}
