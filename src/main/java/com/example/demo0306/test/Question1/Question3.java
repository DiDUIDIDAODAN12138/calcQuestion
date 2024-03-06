package com.example.demo0306.test.Question1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author liwang
 * @date 2024年03月06日 14:47
 */
public class Question3 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(5); //5斤苹果
        BigDecimal b = new BigDecimal(5); //5斤草莓
        BigDecimal c = new BigDecimal(5); //5斤芒果

        BigDecimal result = calc(a, b, c);
        System.out.println(
                "结果是:" + result + "元"
        );

    }

    public static BigDecimal calc(BigDecimal a, BigDecimal b, BigDecimal c) {
        BigDecimal strawberry = new BigDecimal(13); //草莓价格
        BigDecimal strawberryDiscount = new BigDecimal(0.8); //草莓折扣
        BigDecimal apple = new BigDecimal(8); //苹果价格
        BigDecimal mango = new BigDecimal(20); //苹果价格

        BigDecimal result1 = strawberry.multiply(a).multiply(strawberryDiscount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal result2 = apple.multiply(b);
        BigDecimal result3 = mango.multiply(c);


        return result1.add(result2).add(result3);
    }

}