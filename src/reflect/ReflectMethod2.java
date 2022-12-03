package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethod2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Class userServiceClass = Class.forName("reflect.UserService");

        // new instance
        Object obj = userServiceClass.newInstance();
        // get method
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        // call method and get return value
        Object returnValue = loginMethod.invoke(obj, "admin", "123");
        System.out.println(returnValue);

    }
}
