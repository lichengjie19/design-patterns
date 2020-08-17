package templateMehtod;

/**
 * @author licjd
 * @date 2020/08/17
 */
public class Sub extends Father{
    @Override
    void a() {
        System.out.println("Sub.a()");
    }

    @Override
    void b() {
        System.out.println("Sub.b()");
    }

    public static void main(String[] args) {
        Father father = new Sub();
        father.m();
    }
}
