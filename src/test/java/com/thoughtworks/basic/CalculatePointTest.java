package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;


public class CalculatePointTest {
//    需求一测试
    @Test
    public void should_return_110_point_when_calculate_given_amount_is_110() {
        //given
        CalculatePoint calculatePoint = new CalculatePoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods cucumber = new Goods("cucumber", new BigDecimal(30));
        Goods orange = new Goods("orange", new BigDecimal(80));
        goodsList.add(cucumber);
        goodsList.add(orange);
        //when
        int totalPoint = calculatePoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 110);
    }
    //    需求二测试
    @Test
    public void should_return_100_point_when_calculate_given_include_promotions_goods_and_amount_is_100() {
        //given
        CalculatePoint calculatePoint = new CalculatePoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods WATERMELON = new Goods("WATERMELON", new BigDecimal(30));
        Goods APPLE = new Goods("APPLE", new BigDecimal(10));
        Goods Detergent = new Goods("Detergent", new BigDecimal(20));
        goodsList.add(WATERMELON);
        goodsList.add(APPLE);
        goodsList.add(Detergent);
        //when
        int totalPoint = calculatePoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 100);
    }

    //    需求三测试
    @Test
    public void should_return_1067_point_when_calculate_given_amount_is_2350() {
        //given
        CalculatePoint calculatePoint = new CalculatePoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods WATERMELON = new Goods("Refrigerator", new BigDecimal(2350));
        goodsList.add(WATERMELON);
        //when
        int totalPoint = calculatePoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 1067);
    }
    //    需求四测试
    @Test
    public void should_return_3000_point_when_calculate_given_include_promotions_goods_and_amount_is_2000() {
        //given
        CalculatePoint calculatePoint = new CalculatePoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods TELEVISION = new Goods("TELEVISION", new BigDecimal(2000));
        goodsList.add(TELEVISION);
        //when
        int totalPoint = calculatePoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 3000);
    }
    //    需求五测试
    @Test
    public void should_return_1890_point_when_calculate_given_include_promotions_goods_and_less_1000_and_amount_is_2800() {
        //given
        CalculatePoint calculatePoint = new CalculatePoint();
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        Goods TELEVISION = new Goods("TELEVISION", new BigDecimal(800));
        Goods WASHING_MACHINE = new Goods("WASHING_MACHINE", new BigDecimal(2000));
        goodsList.add(TELEVISION);
        goodsList.add(WASHING_MACHINE);
        //when
        int totalPoint = calculatePoint.calculate(goodsList);
        //then
        Assert.assertEquals(totalPoint, 1890);
    }

}
