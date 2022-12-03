package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectConstructor {

    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder s = new StringBuilder();

        Class vipClass = Class.forName("reflect.Vip");

        s.append(Modifier.toString(vipClass.getModifiers()));
        s.append(" class ");
        s.append(vipClass.getSimpleName());
        s.append("{\n");

        // reflect constructor
        Constructor[] constructors = vipClass.getConstructors();
        for(Constructor constructor: constructors){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName());
            s.append("(");

            Class[] parameterTypes = constructor.getParameterTypes();
            for(Class parameter: parameterTypes){
                s.append(parameter.getSimpleName());
                s.append(",");
            }
            if(parameterTypes.length > 0){
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);

    }

}
