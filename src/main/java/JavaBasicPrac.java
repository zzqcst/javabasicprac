import cglib.CglibProxyExample;
import cglib.ReflectServiceImpl;
import dynamicproxy.HelloWorld;
import dynamicproxy.HelloWorldImpl;
import dynamicproxy.JDKProxyExample;

public class JavaBasicPrac {
    public static void main(String[] args) {
        CglibProxyExample example = new CglibProxyExample();
        ReflectServiceImpl proxy = (ReflectServiceImpl) example.getProxy(ReflectServiceImpl.class);
        proxy.sayHello("李白");
    }
}