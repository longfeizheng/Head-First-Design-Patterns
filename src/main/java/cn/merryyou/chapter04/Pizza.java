package cn.merryyou.chapter04;

import java.util.ArrayList;

/**
 * Created on 2017/11/9 0009.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public abstract class Pizza {

    String name;
//    String dough;
//    String sauce;

    Dough dough;
    Sauce sauce;
    Veggies[] veggiess;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    ArrayList toppings = new ArrayList();

    //    public void prepare() {
//        System.out.println("Preparing:" + name);
//        System.out.println("Tossing dough..");
//        System.out.println("Adding sauce...");
//        for (int i = 0; i < toppings.size(); i++) {
//            System.out.println("   " + toppings.get(i));
//        }
//    }
    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
