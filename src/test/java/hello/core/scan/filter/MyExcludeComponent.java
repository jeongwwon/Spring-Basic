package hello.core.scan.filter;

import java.lang.annotation.*;

//TYPE == class 레벨
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
    //컴포넌트 스캔에 추가

}
