package cn.merryyou.chapter08;

/**
 * Created on 2017/11/28.
 * 模板方法模式
 *
 * @author zlf
 * @since 1.0
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
