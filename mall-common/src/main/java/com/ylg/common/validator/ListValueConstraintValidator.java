package com.ylg.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {

    private Set<Integer> set = new HashSet<>();


    @Override
    public void initialize(ListValue constraintAnnotation) {

        int[] vals = constraintAnnotation.values();

        System.out.println(Arrays.asList(vals));

        for (int val : vals) {
            set.add(val);
        }
    }
    /**
     * @Param value 需要校验的值
     * @Param context
     * @return
    */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return set.contains(value);
    }
}
