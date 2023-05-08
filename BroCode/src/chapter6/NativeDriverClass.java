package chapter6;

import java.util.Arrays;

public class NativeDriverClass {
    public static void main(String[] args) {
        SemicolonNatives[] natives = {
                new SemicolonNatives("David", 16),
                new SemicolonNatives("Joshua", 16)
        };
        System.out.println("Native::: " + Arrays.toString(natives));
    }
}
