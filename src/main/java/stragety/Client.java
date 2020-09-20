package stragety;

/**
 * 高层模块
 * 知道要用哪个策略，产生出它的对象，然后放到封装角色中就完成任务了。
 * @author licjd
 * @date 2020/09/20
 */
public class Client {

    public static void main(String[] args) {
        // 声明一个具体的策略
        Strategy strategy = new ConcreateStrategy1();
        // 声明上下文对象
        Context context = new Context(strategy);
        // 执行封装后的方法
        context.doAnything();
    }

}
