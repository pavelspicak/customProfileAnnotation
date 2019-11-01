package com.spicak.customProfileAnnotation.dev;

import org.springframework.context.annotation.Profile;

/**
 * @author pavelspicak, 01/11/2019.
 */
//@Retention(RetentionPolicy.RUNTIME)
@Profile("dev")
public @interface DevProfile
{
}
