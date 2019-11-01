package com.example.xiti2.single;

/**
 * Created by 天 on 2019/10/24.
 */

public class LanHan {
    private static LanHan lanHan;
    private LanHan(){}
    private synchronized static LanHan setLanHan(){
        if (lanHan==null){
            synchronized (LanHan.class) {
                if (lanHan==null) {
                    lanHan = new LanHan();
                }
            }
        }
        return lanHan;
    }
}
