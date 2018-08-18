package contextdemo;

import io.micronaut.aop.MethodInterceptor;
import io.micronaut.aop.MethodInvocationContext;

import javax.inject.Singleton;

@Singleton
public class PrintlnTraceInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(MethodInvocationContext context) {
        System.out.println("Invoking method " + context.getExecutableMethod().getMethodName() + " on class " + context.getDeclaringType());
        return context.proceed();
    }
}
