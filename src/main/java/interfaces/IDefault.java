package interfaces;

public interface IDefault {
    //1.8新特性，扩展方法
    default String hello(){
        return "hello";
    }
}
