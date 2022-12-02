package com.tutrit.demo;

public class EnablePreviewFeatureDemo {
    public static void main(String[] args) {
        System.out.println(formatterPatternSwitch(11));
    }

    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            default        -> o.toString();
        };
    }
}
