package reflect;

import java.lang.reflect.Field;
/*
Use reflect to assign value to some field(public)
How to get private field?

 */

public class ReflectFields2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {

        // get student class by Class.forName()
        Class studentClass = Class.forName("reflect.Student");
        Object obj = studentClass.newInstance();  // get obj(new)

        // get public field by using getDeclaredField("name");
        Field noField = studentClass.getDeclaredField("no");  // get field

        noField.set(obj, 1111); // field has method set

        // how to get value? field.get(object)
        System.out.println(noField.get(obj));

        // get private field
        Field nameField = studentClass.getDeclaredField("name"); // IllegalAccessException
        // set Accessible to true, and it will break the encapsulation
        nameField.setAccessible(true);

        nameField.set(obj, "robin");
        System.out.println(nameField.get(obj));

    }
}
