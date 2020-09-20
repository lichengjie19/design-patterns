package stragety;

/**
 * 封装角色/上下文角色
 * 起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
 *
 * 重点！！！
 * 借用了代理模式的思路，差别就是策略模式的封装角色和被封装的策略类不是同一个接口，如果是同一个接口就成了代理模式。
 *
 * @author licjd
 * @date 2020/09/20
 */
public class Context {

    // 抽象策略
    private Strategy strategy;

    // 构造函数设置具体策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 封装后的策略方法
    public void doAnything() {
        this.strategy.deSomething();
    }
}
