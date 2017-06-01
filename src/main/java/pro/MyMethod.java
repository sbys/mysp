package pro;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by 12917 on 2017/6/1.
 */
public class MyMethod implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("hehehe");
        methodInvocation.proceed();
        System.out.println("hahah");
        return null;
    }
}
