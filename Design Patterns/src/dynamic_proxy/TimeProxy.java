package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeProxy implements InvocationHandler {

    private Object tank;

    public TimeProxy(Object tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        method.invoke(tank, args);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) / 1000);
        return null;
    }
}
