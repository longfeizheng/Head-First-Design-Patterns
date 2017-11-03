package cn.merryyou.chapter01;

/**
 * Created on 2017/11/2 0002.
 *
 * @author zlf
 * @since 1.0
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.perforrmFly();

        Duck model = new ModelDuck();
        model.perforrmFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perforrmFly();
    }
}
