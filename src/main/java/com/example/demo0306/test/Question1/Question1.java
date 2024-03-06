package com.example.demo0306.test.Question1;

import java.math.BigDecimal;

/**
 * @author liwang
 * @date 2024年03月06日 14:47
 */
public class Question1 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(5); //5斤苹果
        BigDecimal b = new BigDecimal(5); //5斤草莓

        BigDecimal result = calc(a, b);
        System.out.println(
                "结果是:"+result+"元"
        );

    }

    public static BigDecimal calc(BigDecimal a,BigDecimal b) {
        BigDecimal strawberry = new BigDecimal(13); //草莓价格
        BigDecimal apple = new BigDecimal(8); //苹果价格

        BigDecimal result1 = strawberry.multiply(a);
        BigDecimal result2 = apple.multiply(b);


        return result1.add(result2);
    }
}