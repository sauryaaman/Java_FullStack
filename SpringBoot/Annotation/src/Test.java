import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnotation{
    int value();

}
@MyAnotation(value=56)
public class Test {

    public static void main(String[] args) {
         Class <Test> obj= Test.class;
//        System.out.println(obj);
        if (obj.isAnnotationPresent(MyAnotation.class)) {
            MyAnotation anotation=obj.getAnnotation(MyAnotation.class);
            System.out.println(anotation.value());
        }

    }
}
