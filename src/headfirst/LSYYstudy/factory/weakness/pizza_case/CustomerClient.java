package headfirst.LSYYstudy.factory.weakness.pizza_case;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:29 2019/2/12/012
 * @Modify By:
 **/
public class CustomerClient {
    public static void main(String[] args) {
        PizzaStoreImp pizzaStore=new PizzaStoreImp();
        pizzaStore.orderPizzaImp("cheese");
        System.out.println();
        PizzaStoreExt pizzaStoreExt=new PizzaStoreExt();
        pizzaStoreExt.orderPizzaExt("cheese");
    }
}
