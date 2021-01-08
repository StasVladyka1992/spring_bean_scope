package com.vladyka.scope.bean;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@NoArgsConstructor
@SessionScope
public class SessionBean {
    private String stringField = "request";
    private int intValue = 10;

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return ""+this.hashCode();
    }
}
