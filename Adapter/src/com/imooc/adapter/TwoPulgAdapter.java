package com.imooc.adapter;

/**
 * 二相转三相插座适配器(组合方式)
 * Created by pp on 2017/4/24.
 */
public class TwoPulgAdapter implements ThreePlugIf {

    private GBTowPlug gbTowPlug;

    public TwoPulgAdapter(GBTowPlug gbTowPlug) {
        this.gbTowPlug = gbTowPlug;
    }

    @Override
    public void powerWithThree() {
        gbTowPlug.powerWithTowPlug();
    }
}
