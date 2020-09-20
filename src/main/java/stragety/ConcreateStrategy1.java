package stragety;

/**
 * 具体策略角色
 * 实现抽象策略中的操作，含有具体的实现。
 * @author licjd
 * @date 2020/09/20
 */
public class ConcreateStrategy1 implements Strategy{
    @Override
    public void deSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
