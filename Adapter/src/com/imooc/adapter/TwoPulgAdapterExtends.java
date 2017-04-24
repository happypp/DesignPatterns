package com.imooc.adapter;

/**
 * 二相转三相插座适配器(继承方式)
 * Created by pp on 2017/4/24.
 */
public class TwoPulgAdapterExtends extends GBTowPlug implements ThreePlugIf {

    @Override
    public void powerWithThree() {
        this.powerWithTowPlug();
    }

}
