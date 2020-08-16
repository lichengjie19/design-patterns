package singleton;

/**
 * lazy loading
 * 懒汉式加载
 * 使用 synchronized 去确保线程安全，但是效率会降低很多
 * @author licjd
 * @date 2020/08/15
 */
public class SingleTon_03 {

    private static SingleTon_03 ST;

    private SingleTon_03() {

    }

    public static synchronized SingleTon_03 getInstance() {
        if (ST == null) {
            ST = new SingleTon_03();
        }
        return ST;
    }

//    public static SingleTonThree getInstance() {
//        if (ST == null) {
//            // 企图通过减少上面的同步代码块的方式提高效率，但会出现线程不安全的
//            synchronized (SingleTonThree.class) {
//                ST = new SingleTonThree();
//            }
//        }
//        return ST;
//    }
    
}
