package cn.merryyou.chapter08;

/**
 * Created on 2017/11/28.
 *
 * @author zlf
 * @since 1.0
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
