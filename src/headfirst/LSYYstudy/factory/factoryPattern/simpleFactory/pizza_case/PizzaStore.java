package headfirst.LSYYstudy.factory.factoryPattern.simpleFactory.pizza_case;

import headfirst.LSYYstudy.factory.factoryPattern.simpleFactory.pizza_case.pizzaFactory.SimplePizzaFactory;
import headfirst.LSYYstudy.factory.factoryPattern.simpleFactory.pizza_case.pizzaFactory.pizza.Pizza;

/**
 * @Author: zhangzhirong
 * @Description:简单工厂（不属于设计模式）
 * @Date:Created in 17:41 2019/2/12/012
 * @Modify By:
 **/
public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(){
        simplePizzaFactory=new SimplePizzaFactory();
    }
    public void orderPizzaImp(String type){

        Pizza pizza=simplePizzaFactory.createPizza(type);
        pizzaStart(pizza);
    }

    private void pizzaStart(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
