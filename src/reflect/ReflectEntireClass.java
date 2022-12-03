package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectEntireClass {
    /*
    This method is used to reflect the entire class
     */
    public static void main(String[] args) throws ClassNotFoundException {

        StringBuilder stringBuilder = new StringBuilder();

        Class studentClass = Class.forName("reflect.Student"); // could change java.lang.String

        stringBuilder.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getName() + " { \n");

        // loop through
        Field[] fields = studentClass.getDeclaredFields();

        for(Field f: fields){
            stringBuilder.append("\t"); //indentation
            stringBuilder.append(Modifier.toString(f.getModifiers()));
            stringBuilder.append(" ");
            stringBuilder.append(f.getType().getSimpleName());
            stringBuilder.append(" ");
            stringBuilder.append(f.getName());
            stringBuilder.append(";\n");
        }

        stringBuilder.append("}");
        System.out.println(stringBuilder);
    }
}
