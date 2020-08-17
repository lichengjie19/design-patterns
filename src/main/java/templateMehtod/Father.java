package templateMehtod;

/**
 * 模板 - TemplateMethod
 * @author licjd
 * @date 2020/08/17
 */
public abstract class Father {

    void m () {
        a();
        b();
    }

    abstract void a();
    abstract void b();

}
