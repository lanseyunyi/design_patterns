package headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.pizzaImp;

import headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.Pizza;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:12 2019/2/12/012
 * @Modify By:
 **/
public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("PepperoniPizza准备Pizza");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza烘烤Pizza");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza切Pizza");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza装盒Pizza");
    }
}
