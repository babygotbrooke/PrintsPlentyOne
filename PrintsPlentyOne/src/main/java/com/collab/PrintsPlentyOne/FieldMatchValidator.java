package com.collab.PrintsPlentyOne;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.beanutils.BeanUtils;
import org.bouncycastle.asn1.x509.NameConstraintValidator;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch,Object>{
    private String firstFieldName;
    private String secondFieldName;

    @Override
    public void initialize (final FieldMatch constraintAnnotation) {
        firstFieldName = constraintAnnotation.first();
        secondFieldName = constraintAnnotation.second();
    }

    @Override
    public boolean isValid(final Object value, final NameConstraintValidatorContext context){
        try{
            final Object firstObj = BeanUtils.getProperty(value, firstFieldName);
            final Object secondObj = BeanUtils.getProperty(value, secondFieldName);
            return firstObj == null && secondObj == null || firstObj != null && firstObj.equals(secondObj);
        }catch (final Exception ignore){}
        return true;
    }
}
