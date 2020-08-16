package singleton;

/**
 * lazy loading
 * 懒汉式加载
 * 虽然达到了按需初始化的目的，但也带来了线程不安全的问题（多线程访问的时候会有问题）
 * @author licjd
 * @date 2020/08/15
 */
public class SingleTon_02 {

    private static SingleTon_02 ST;

    private SingleTon_02() {

    }

    public static SingleTon_02 getInstance() {
        if (ST == null) {
            // 此处多线程的情况下可能多次创建
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ST = new SingleTon_02();
        }
        return ST;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // jdk 1.8: lambda
            new Thread(() -> {
                System.out.println(SingleTon_02.getInstance().hashCode());
            }).start();
        }
    }
    
}
