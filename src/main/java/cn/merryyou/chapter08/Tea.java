package cn.merryyou.chapter08;

/**
 * Created on 2017/11/28.
 *
 * @author zlf
 * @since 1.0
 */
public class Tea extends CaffeineBeverage {


    @Override
    void brew() {
        System.out.println("Settping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
