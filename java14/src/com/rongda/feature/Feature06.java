package com.rongda.feature;

import java.util.ArrayList;

/**
 * @class: Feature06.class
     * @description: 垃圾收集器的更新
 * ① 弃用ParallelScavenge和SerialOld GC组合
 * ② 删除CMS垃圾回收器
 * ③ ZGC 可以在macOS和Windows上使用
 * <p>
 * -XX:+UseParallelGC -XX:-UseParallelOldGC
 * -XX:-UseParallelOldGC
 * -XX:+UseConcMarkSweepGC
 * -XX:+UnlockExperimentalVMOptions -XX:+UseZGC
 * @author: acao
 * @create: 2020-11-23 19:48
 **/
public class Feature06 {

    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        while(true){
            byte[] arr = new byte[100];
            list.add(arr);
        }
    }

}
