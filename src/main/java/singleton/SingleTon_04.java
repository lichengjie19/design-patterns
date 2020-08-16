package singleton;

/**
 * @author licjd
 * @date 2020/08/15
 */
public class SingleTon_04 {

    private volatile static SingleTon_04 ST;

    private SingleTon_04() {

    }

    public static SingleTon_04 getInstance() {
        if (ST == null) {
            synchronized (SingleTon_04.class) {
                if (ST == null) {
                    ST = new SingleTon_04();
                }
            }
        }
        return ST;
    }
    
}
