package headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory;

import headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.pizza.Pizza;
import headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.pizza.pizzaExt.CheesePizza;
import headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.pizza.pizzaExt.GreekPizza;
import headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.pizza.pizzaExt.PepperoniPizza;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:40 2019/2/12/012
 * @Modify By:
 **/
public class StaticPizzaFactory {

    public StaticPizzaFactory(){}

    public static Pizza createPizza(String type){
        Pizza pizza=null;
        // 判定Pizza类型，制作合理Pizza
        if(type.equals("cheese"))
            pizza=new CheesePizza();
        else if(type.equals("greek"))
            pizza=new GreekPizza();
        else if(type.equals("pepperoni"))
            pizza=new PepperoniPizza();
        else
            pizza=new CheesePizza();
        return pizza;
    }
}
