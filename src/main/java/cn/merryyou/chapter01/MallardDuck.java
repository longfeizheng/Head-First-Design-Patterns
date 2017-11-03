package cn.merryyou.chapter01;

/**
 * Created on 2017/11/2 0002.
 *
 * @author zlf
 * @since 1.0
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
