package headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case;

import headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.StaticPizzaFactory;
import headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.pizza.Pizza;

/**
 * @Author: zhangzhirong
 * @Description:静态工厂（简单工厂的不同表现形式）（不属于设计模式）
 * @Date:Created in 17:41 2019/2/12/012
 * @Modify By:
 **/
public class PizzaStore {

    public PizzaStore(){

    }
    public void orderPizzaImp(String type){

        Pizza pizza= StaticPizzaFactory.createPizza(type);
        pizzaStart(pizza);
    }

    private void pizzaStart(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
