package annotation;



public class Annotation {

    private int no;

    @MyAnnotation(name="robin", color = "red", value= "hehe")
    public Annotation(){}

    @MyAnnotation(name="robin", color= "red", value = "hhehe")
    public static void m1(){}
}
