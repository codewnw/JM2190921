package com.jm2190921.annotatation.userdefined.classinfousingannotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface ClassInfo {

	String author();

	String[] reviewrs();

	String createdOn();

	int version() default 1;
}
