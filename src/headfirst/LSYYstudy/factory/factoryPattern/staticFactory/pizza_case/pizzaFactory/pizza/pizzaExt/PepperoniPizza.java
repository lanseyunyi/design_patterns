package headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.pizza.pizzaExt;

import headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.pizza.AbstractPizza;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:12 2019/2/12/012
 * @Modify By:
 **/
public class PepperoniPizza extends AbstractPizza {
    @Override
    public void prepare() {
        System.out.println("PepperoniPizza准备Pizza");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza烘烤Pizza");
    }
}
