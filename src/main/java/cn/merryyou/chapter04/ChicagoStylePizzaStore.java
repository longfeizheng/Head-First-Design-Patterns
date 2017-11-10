package cn.merryyou.chapter04;

/**
 * Created on 2017/11/9 0009.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();
    }
}
