package com.git.boot.importbean.anno;

import com.git.boot.importbean.autoconfig.MetaAutoConfigureRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MetaAutoConfigureRegistrar.class})
public @interface MetaComponentScan {

    @AliasFor("basePackages") String[] value() default {};

    @AliasFor("value") String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};
}
