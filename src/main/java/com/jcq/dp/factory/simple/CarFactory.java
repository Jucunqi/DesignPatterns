package com.jcq.dp.factory.simple;

/**
 * 简单工厂/静态工厂
 * 优点：写法简单，高效
 * 全点：违反开闭原则 - 修改的时候需要修改老代码
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class CarFactory {

    /**
     * 方法一，通过名称，获取对象
     * @param name 名称
     * @return Car
     */
    public static Car getCar(String name) {

        if ("wuling".equals(name)) {
            return new WulingCar();
        }  else {
            return new TeslaCar();
        }
    }

    /**
     * 方法二 通过不同方法创建不同对象，避免if else
     * @return Car
     */
    public static Car getWuling() {
        return new WulingCar();
    }

    public static Car getTesla() {
        return new TeslaCar();
    }
}
