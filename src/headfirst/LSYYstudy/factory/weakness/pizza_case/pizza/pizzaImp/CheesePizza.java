package headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.pizzaImp;

import headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.Pizza;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:12 2019/2/12/012
 * @Modify By:
 **/
public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("CheesePizza准备Pizza");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza烘烤Pizza");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza切Pizza");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza装盒Pizza");
    }
}
