package com.vladyka.scope;

import com.vladyka.scope.borisov.PrototypeBorisov;
import com.vladyka.scope.borisov.SingletonBorisov;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class ScopeApplication {

    @Bean
    @Scope(value = "prototype")
    public PrototypeBorisov prototypeBorisov() {
        return new PrototypeBorisov();
    }

    @Bean
    @Scope(value = "singleton")
    public SingletonBorisov createSingletonBorisov() {
        return new SingletonBorisov() {
            @Override
            public PrototypeBorisov getPrototype() {
                //вызов этого метода(а по сути создание бина) дает возможность контролировать scope бина, который мы будем инджектить
                return prototypeBorisov();
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ScopeApplication.class, args);
    }
}
