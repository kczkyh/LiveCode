package com.qhit.Utils.Encryption;

import java.util.Random;
import java.util.UUID;

/**
 * Created by 24290 on 2019/5/9.
 */
public class UUID16 {

    public static String getOrderIdByUUId() {
        int first = new Random(10).nextInt(8) + 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return first+"";
    }

    public static void main(String[] args) {
        String orderIdByUUId = getOrderIdByUUId();
        System.out.println(orderIdByUUId);
    }

}
