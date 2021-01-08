package com.vladyka.scope.borisov;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SingletonBorisov {
    private String stringField = "singleton";
    private int intValue = 10;
    private PrototypeBorisov prototypeBorisov;

    public abstract PrototypeBorisov getPrototype();
}
