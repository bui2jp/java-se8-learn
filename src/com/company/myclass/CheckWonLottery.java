package com.company.myclass;

//28
//関数型インターフェース
// インターフェースと関数が１つ
@FunctionalInterface
public interface CheckWonLottery {
    abstract public String check(Integer inNo, Integer winNo);
}


//29
/* 主な関数型インターフェース
Function<T,R> R apply(T t)
Consumer<T> void accept(T t)
Predicate<T> boolean test(T t)
Supplier<T> T get()
UnaryOperator<T> T apply(T t)
BinaryOperator<T> T apply(T t1, T t2)
BiFunction<T,U,R> R apply(T t, U u)
* */
