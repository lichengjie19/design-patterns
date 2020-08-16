package singleton;

/**
 * 静态内部类
 * JVM 保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * @author licjd
 * @date 2020/08/16
 */
public class SingleTon_05 {

    private static class SingleTonInner {
        private final static SingleTon_05 ST = new SingleTon_05();
    }

    private SingleTon_05() {

    }

    public static SingleTon_05 getInstance() {
        return SingleTonInner.ST;
    }

}
