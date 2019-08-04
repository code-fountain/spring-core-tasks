package com.codefountain.spring.core.aop.basic;

/**
 * Calcultor Interface
 */
public interface BasicCalculator {

    /**
     * Adds two numbers
     *
     * @param number1
     * @param number2
     * @return
     */
    double addition(double number1, double number2);

    /**
     * Substracts two numbers
     * @param number1
     * @param number2
     * @return
     */
    double substraction(double number1, double number2);

    /**
     * Multiply two numbers
     * @param number1
     * @param number2
     * @return
     */
    double multiplication(double number1, double number2);

    /**
     * Divide two numbers
     * @param number1
     * @param number2
     * @return
     */
    double division(double number1, double number2);
}
