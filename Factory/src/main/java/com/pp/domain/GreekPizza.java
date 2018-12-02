package com.pp.domain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Created by pengpeng on 2018/12/2
 */
@Slf4j
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        log.info("希腊风味披萨 准备中～");
    }
    @Override
    public void bake() {
        log.info("希腊风味披萨 烘烤中～");
    }
    @Override
    public void cut() {
        log.info("希腊风味披萨 切块中～");
    }
    @Override
    public void box() {
        log.info("希腊风味披萨 装盒中～");
    }
}
