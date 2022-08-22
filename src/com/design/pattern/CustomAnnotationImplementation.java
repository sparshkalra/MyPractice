package com.design.pattern;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class CustomAnnotationImplementation 
{

	@JsonElement
    private String firstName;

    @JsonElement
    private String lastName;

    @JsonElement(key = "personAge")
    private String age;

    private String address;

    @Init
    private void initNames() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase() 
          + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase() 
          + this.lastName.substring(1);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.Type)
@interface JsonSerializable {
}

@interface JsonSerializable 
{
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonElement {
    public String key() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Init {
}