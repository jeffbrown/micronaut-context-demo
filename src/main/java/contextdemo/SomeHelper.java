package contextdemo;

import javax.inject.Singleton;

@Singleton
public class SomeHelper {
    @PrintlnTrace
    public void doSomething() {
        System.out.println("Hello From SomeHelper");
    }
}
