package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
This self-defined annotation could be used on field and method(value property could be left out)
could be reflected
 */
@Target({ElementType.FIELD, ElementType.METHOD})
// could be reflected
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
}
