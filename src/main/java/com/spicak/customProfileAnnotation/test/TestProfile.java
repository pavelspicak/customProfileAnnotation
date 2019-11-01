package com.spicak.customProfileAnnotation.test;

import org.springframework.context.annotation.Profile;

/**
 * @author pavelspicak, 01/11/2019.
 */
//@Retention(RetentionPolicy.RUNTIME)
@Profile("test")
public @interface TestProfile
{
}
