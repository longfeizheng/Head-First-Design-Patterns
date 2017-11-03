package cn.merryyou.chapter01;

/**
 * Created on 2017/11/2 0002.
 *
 * @author zlf
 * @since 1.0
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
