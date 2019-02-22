package headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.pizzaExt;

import headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.AbstractPizza;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:12 2019/2/12/012
 * @Modify By:
 **/
public class CheesePizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("CheesePizza准备Pizza");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza烘烤Pizza");
    }
}
