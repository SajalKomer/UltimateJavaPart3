package com.codewithmosh.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdasDemo {
  public static void show() {
//    UnaryOperator<Integer> square = n -> n * n;
//    UnaryOperator<Integer> increment = n -> n + 1;
//
//    var result = increment.andThen(square).apply(1);
//    System.out.println(result);

    List<String> list = List.of("a", "b", "c");
    Consumer<String> print = item -> System.out.println(item);
    Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
    list.forEach(print.andThen(printUpperCase));
  }
}
