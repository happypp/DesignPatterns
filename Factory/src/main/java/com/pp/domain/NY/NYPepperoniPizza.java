package com.pp.domain.NY;

import com.pp.domain.Pizza;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Created by pengpeng on 2018/12/2
 */
@Slf4j
public class NYPepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        log.info("辣香肠比萨饼 准备中～");
    }
    @Override
    public void bake() {
        log.info("辣香肠比萨饼 烘烤中～");
    }
    @Override
    public void cut() {
        log.info("辣香肠比萨饼 切块中～");
    }
    @Override
    public void box() {
        log.info("辣香肠比萨饼 装盒中～");
    }
}
