package reflect;

import java.lang.reflect.Field;

/*
reflect all fields in student class
 */
public class ReflectFields {

    public static void main(String[] args) throws ClassNotFoundException {
        Class studentClass = Class.forName("reflect.Student");

        Field[] fields = studentClass.getFields(); // student has 4 fields
        System.out.println(fields.length);  // it print 1, because getFields() get all public fields in class
        System.out.println(fields[0].getName());

        Field[] fields1 = studentClass.getDeclaredFields(); // get all declaredFields()
        System.out.println(fields1.length);

        // use loop to get all fields name
        for (Field f: fields1) {
            System.out.println(f.getName());
            System.out.println(f.getType().getName());
            System.out.println(f.getModifiers()); // get modifiers
        }



    }
}
