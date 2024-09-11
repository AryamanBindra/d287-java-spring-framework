package com.example.demo.validators;

import javax.validation.Payload;

/**
 *
 *
 *
 *
 */
public @interface ValidMinInv {
    String message() default "Inventory is below minimum inventory.";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
