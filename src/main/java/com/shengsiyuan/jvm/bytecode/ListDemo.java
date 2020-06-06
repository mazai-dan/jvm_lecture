package com.shengsiyuan.jvm.bytecode;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        integers.forEach(item -> System.out.println(Try.of((Integer a) -> {
            return item * a;
        }).apply(2)));
    }
}

class Try {
    // 将 UncheckedFunction 包装为 Function 的功能
    public static <T, R> Function<T, R> of(UncheckedFunction<T, R> mapper) {
        Objects.requireNonNull(mapper);
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                System.out.println("catch Exception");
                throw new RuntimeException(e);
                // e.printStackTrace();
            }
        };
    }

    @FunctionalInterface
    public interface UncheckedFunction<T, R> {
        R apply(T t) throws Exception;
    }
}