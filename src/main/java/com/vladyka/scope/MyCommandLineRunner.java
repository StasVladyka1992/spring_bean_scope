package com.vladyka.scope;

import com.vladyka.scope.bean.SingletonBean;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyCommandLineRunner implements CommandLineRunner {
    private final ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        //scope singleton
//        SingletonBean singleton1 = applicationContext.getBean(SingletonBean.class);
//        SingletonBean singleton2 = applicationContext.getBean(SingletonBean.class);
//        System.out.println("singleton1 == singleton2 -> " + Boolean.toString(singleton1 == singleton2));

        //scope prototype
//        PrototypeBean prototype1 = applicationContext.getBean(PrototypeBean.class);
//        PrototypeBean prototype2 = applicationContext.getBean(PrototypeBean.class);
//        System.out.println("prototype1 == prototype2 -> " + Boolean.toString(prototype1 == prototype2));

        //inject prototype в singleton, использование proxyMode или @Lookup
//        SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
//        SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
//        System.out.println("prototype1: "+ singletonBean1.getPrototypeBean());
//        System.out.println("prototype2: "+ singletonBean1.getPrototypeBean());

//        SpringApplication.exit(applicationContext, () -> 1);

        SingletonBean singletonBean = new SingletonBean();
        singletonBean.getPrototypeBean();



    }
}
