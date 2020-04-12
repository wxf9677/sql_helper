package com.diving.wsql.temp.annotations;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlQuery {
    String uk();
    String tableName();
    boolean distinct() default false;
}
