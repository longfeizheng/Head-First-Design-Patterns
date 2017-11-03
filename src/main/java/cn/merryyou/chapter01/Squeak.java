package cn.merryyou.chapter01;

/**
 * Created on 2017/11/2 0002.
 *
 * @author zlf
 * @since 1.0
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
