package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----正在执行的方法-----:" + method);
        if (args == null) {
            System.out.println("该方法没有参数");
        } else {
            System.out.println("该方法的参数为：");
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        return null;
    }
}
