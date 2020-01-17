package com.tmd.xreal.aop.formsPreventDuplicateSubmissions;

import java.lang.annotation.*;

/**
 * @author zxw
 * @date 2020-01-07 11:33
 */

@Target({ElementType.METHOD})
/**注解的生命周期一直程序运行时都存在VM运行期间保留注解，可以通过反射机制读取注解信息*/
@Retention(RetentionPolicy.RUNTIME)
/**注解包含在Javadoc中*/
@Documented
public @interface FormsPreventDuplicateSubmissionsAnnotation {
}
