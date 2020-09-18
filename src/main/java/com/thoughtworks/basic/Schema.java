package com.thoughtworks.basic;

import java.util.Set;

public class Schema {
    private Set<FlagSchema> flagsSchema;
    public Schema(Set<FlagSchema> flagsSchema){
        this.flagsSchema = flagsSchema;
    }
    public Object getTypeOf(String flag){
        return flagsSchema.stream()
                .filter(flagSchema -> flagSchema.equalsWith(flag))
                .findFirst()
                .get()
                .getType();
    }
}
