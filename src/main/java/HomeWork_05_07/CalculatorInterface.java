package com.example;

public interface CalculatorInterface<T> {
    T add(T a, T b);
    T sub(T a, T b);
    T multi(T a, T b);
    T div(T a, T b) throws ArithmeticException;
