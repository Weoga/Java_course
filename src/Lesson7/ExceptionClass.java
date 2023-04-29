package Lesson7;

import java.util.Objects;

public class ExceptionClass {
    public void someException(Object i) throws My_exception {
        if (Objects.equals(i, "Pluto") || !(Objects.equals(i.getClass().getName(), "java.lang.String"))) throw new My_exception("NOT A PLANEEEET");
        else{
            System.out.println("Cool planet you got there");
        }
    }
}
