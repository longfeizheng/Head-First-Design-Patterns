package cn.merryyou.chapter04;

/**
 * Created on 2017/11/10.
 *
 * @author zlf
 * @since 1.0
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
    public Cheese createCheese();
}
