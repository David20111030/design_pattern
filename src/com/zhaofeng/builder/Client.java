package com.zhaofeng.builder;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/12
 * Time: 17:42
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    private static Builder acerBuilder = new AcerBuilder(), dellBuilder = new DellBuilder();

    public static void main(String[] args) {

        System.out.print("宏基");
        Director director = new Director(acerBuilder);
        director.construct();
        Product product = acerBuilder.getFinalResult();
        product.show();

        System.out.println();

        System.out.print("戴尔");
        director = new Director(dellBuilder);
        director.construct();
        product = dellBuilder.getFinalResult();
        product.show();
    }
}
