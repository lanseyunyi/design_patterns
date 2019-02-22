package headfirst.LSYYstudy.factory.weakness.pizza_case;

import headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.Pizza;
import headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.pizzaImp.CheesePizza;
import headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.pizzaImp.GreekPizza;
import headfirst.LSYYstudy.factory.weakness.pizza_case.pizza.pizzaImp.PepperoniPizza;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:11 2019/2/12/012
 * @Modify By:
 **/
public class PizzaStoreImp {

    public void orderPizzaImp(String type){
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
        pizzaStart(pizza);
    }

    private void pizzaStart(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
