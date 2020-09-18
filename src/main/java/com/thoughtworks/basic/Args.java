package com.thoughtworks.basic;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Args {
    private  String argsText;
    public Args(String argsText) {
        this.argsText = argsText;
    }
    public List<String> scan(){
        List<String> keyValues = Arrays.asList(argsText.split("-"));
        keyValues = keyValues.stream()
//                .map(String::trim)
                .map(keyValue->keyValue.trim())
                .collect(Collectors.toList());
        return keyValues.subList(1,keyValues.size());
    }

    public List<KeyValuePair> scan2() {
        List<String> keyValues = Arrays.asList(argsText.split("-"));
        keyValues = keyValues.stream()
                .map(String::trim)
                .collect(Collectors.toList());
        keyValues = keyValues.subList(1,keyValues.size());
        List<KeyValuePair> keyValuePairs = new ArrayList<>();
        keyValues.forEach(keyValue -> {String[] splitKeyValue = keyValue.split(" ");
            String key = splitKeyValue[0];
            String value = splitKeyValue[1];
            keyValuePairs.add(new KeyValuePair(key,value));});
        return keyValuePairs;
    }
}
