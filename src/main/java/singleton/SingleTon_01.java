package singleton;

/**
 * 饿汉式 - 在类加载时实例化
 * 类加载到内存后，就实例化一个单例，JVM 保证线程安全
 * 简单实用，推荐实用
 * 唯一缺点：不管使用与否，类装载时就完成实例化
 * @author licjd
 * @date 2020/08/15
 */
public class SingleTon_01 {

    private static final SingleTon_01 ST = new SingleTon_01();

    // private
    private SingleTon_01() {

    }

    // 提供该单例的对象
    public static SingleTon_01 getInstance() {
        return ST;
    }

    // 证明是单例
    public static void main(String[] args) {
        SingleTon_01 instance = SingleTon_01.getInstance();
        SingleTon_01 instance1 = SingleTon_01.getInstance();
        System.out.println(instance == instance1);
    }

}
