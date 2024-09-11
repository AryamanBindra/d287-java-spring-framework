package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class MinInvValidator implements ConstraintValidator<ValidMinInv, Part> {
    @Override
    public void initialize(ValidMinInv constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMininv();
    }
}