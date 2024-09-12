package com.example.demo.validators;

import javax.validation.Payload;

/**
 *
 *
 *
 *
 */
public @interface ValidMaxInv {
    String message() default "Inventory is above maximum inventory.";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
