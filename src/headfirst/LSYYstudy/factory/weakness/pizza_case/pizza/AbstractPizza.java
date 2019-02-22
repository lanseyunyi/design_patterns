package headfirst.LSYYstudy.factory.weakness.pizza_case.pizza;

/**
 * @Author: zhangzhirong
 * @Description:使用策略模式来将其部分行为进行提取
 * @Date:Created in 17:21 2019/2/12/012
 * @Modify By:
 **/
public abstract class AbstractPizza implements Pizza {
    // 1.准备Pizza
    public abstract void prepare();
    // 2.烘烤Pizza
    public abstract void bake();
    // 3.切Pizza
    public void cut(){
        System.out.println("所有类型Pizza切Pizza");
    }
    // 4.装盒Pizza
    public void box(){
        System.out.println("所有类型Pizza装盒Pizza");
    }
}
