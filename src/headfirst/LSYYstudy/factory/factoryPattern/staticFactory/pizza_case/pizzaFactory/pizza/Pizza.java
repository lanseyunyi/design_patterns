package headfirst.LSYYstudy.factory.factoryPattern.staticFactory.pizza_case.pizzaFactory.pizza;

/**
 * @Author: zhangzhirong
 * @Description:
 * @Date:Created in 17:13 2019/2/12/012
 * @Modify By:
 **/
public interface Pizza {
    // 这边可以考虑使用——模版方法模式（3，4是相同的，可以作为提取，因此可以使用抽象类的方式来更好的优化此过程）
    // 1.准备Pizza
    void prepare();
    // 2.烘烤Pizza
    void bake();
    // 3.切Pizza
    void cut();
    // 4.装盒Pizza
    void box();
}
