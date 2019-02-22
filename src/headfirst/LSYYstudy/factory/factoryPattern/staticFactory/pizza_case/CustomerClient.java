package headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:49 2019/2/12/012
 * @Modify By:
 **/
public class CustomerClient {
    public static void main(String[] args) {
        PizzaStore pizzaStore=new PizzaStore();
        pizzaStore.orderPizzaImp("greek");
    }
}
