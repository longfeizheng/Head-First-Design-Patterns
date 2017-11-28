package cn.merryyou.chapter08;

/**
 * Created on 2017/11/28.
 *
 * @author zlf
 * @since 1.0
 */
public class Test {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();
        ;

        System.out.println("------------------------------------");
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
