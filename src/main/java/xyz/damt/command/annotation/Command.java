package xyz.damt.command.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Command {

    String value();

    String usage() default "";

    boolean async() default false;

    String description() default "";

    String[] aliases() default {""};

}
