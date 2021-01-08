package com.vladyka.scope.cotroller;

import com.vladyka.scope.bean.ApplicationBean;
import com.vladyka.scope.bean.RequestBean;
import com.vladyka.scope.bean.SessionBean;
import com.vladyka.scope.borisov.SingletonBorisov;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@NoArgsConstructor
@Getter
@Setter
public class MyController {
    @Autowired
    private RequestBean requestBean;

    @Autowired
    private SessionBean sessionBean;

    @Autowired
    private ApplicationBean applicationBean;

    @Autowired
    private SingletonBorisov singletonBorisov;

    @GetMapping("/requestBeans")
    public String getRequestBeans() {
        return this.singletonBorisov.getPrototype().toString();
    }
}
