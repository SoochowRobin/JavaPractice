package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectMethod {

    public static void main(String[] args) throws ClassNotFoundException {

        Class userServeiceClass = Class.forName("reflect.UserService");

        //use getDeclaredMethods() method to get Method[] array
        Method[] methods = userServeiceClass.getDeclaredMethods();
        System.out.println(methods.length);

        // loop the method and use getName() method to get method name
        for (Method method: methods) {
            // get modifier
            System.out.println(Modifier.toString(method.getModifiers()));
            // get return type
            System.out.println(method.getReturnType().getName());
            // get method name
            System.out.println(method.getName());

            // get parameters
            Class[] parametersTypes = method.getParameterTypes();
            for (Class parameter: parametersTypes) {
                System.out.println(parameter.getSimpleName());
            }
        }


    }

}
