package cn.merryyou.chapter04;

/**
 * Created on 2017/11/9 0009.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
