package cn.merryyou.chapter04;

/**
 * Created on 2017/11/10.
 *
 * @author zlf
 * @since 1.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }
}
