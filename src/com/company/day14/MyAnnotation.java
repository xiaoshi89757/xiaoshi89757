package com.company.day14;
@SuppressWarnings("unused")
public @interface MyAnnotation {
    String value() default "hello";
}
