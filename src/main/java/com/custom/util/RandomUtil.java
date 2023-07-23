package com.custom.util;

import java.util.Random;

/**
 * 随机数工具类
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2023/7/23
 * @since JDK1.8
 */
public class RandomUtil {

    /**
     * 创建全局的Random对象
     */
    private static final Random RANDOM_GENERATOR = new Random();


    /**
     * 获取一个0到max的随机数
     * @param max 最大值
     * @return [0,max]的随机数
     */
    public static int generateRandomNumber(int max) {
        return generateRandomNumber(0, max);
    }

    /**
     * 获取指定范围的随机数
     * @param min 最小值
     * @param max 最大值
     * @return [min,max]的随机数
     */
    public static int generateRandomNumber(int min, int max) {
        return RANDOM_GENERATOR.nextInt(max - min + 1) + min;
    }

}
