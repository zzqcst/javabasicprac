package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyExample implements MethodInterceptor {
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前");
        Object result = methodProxy.invokeSuper(proxy, args);
        System.out.println("调用真实对象后");
        return result;
    }

    public Object getProxy(Class cls) {
        Enhancer en = new Enhancer();
        en.setSuperclass(cls);
        en.setCallback(this);
        return en.create();
    }

}
