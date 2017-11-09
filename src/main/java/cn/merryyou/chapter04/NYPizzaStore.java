package cn.merryyou.chapter04;

/**
 * Created on 2017/11/9 0009.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(type.endsWith("cheese")){
            return new NYStyleCheesePizza();
        }else if(type.endsWith("vaggie")){
            return new NYStyleCheesePizza();
        }
        return new NYStyleCheesePizza();
    }
}
