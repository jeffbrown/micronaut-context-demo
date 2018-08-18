package contextdemo;

import io.micronaut.context.ApplicationContext;

public class Application {

    public static void main(String[] args) {
        final ApplicationContext context = ApplicationContext.run();
        final SomeHelper helper = context.getBean(SomeHelper.class);
        helper.doSomething();
    }
}
