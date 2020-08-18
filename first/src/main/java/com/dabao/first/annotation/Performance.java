package com.dabao.first.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Performance {

    /**
     * 操作名称
     */
    String name() default "";
}