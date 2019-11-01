package com.example.xiti2.single;

/**
 * Created by 天 on 2019/10/24.
 */

public class Ehan {
    private static Ehan ehan=new Ehan(){};
    private Ehan(){}
    public static Ehan setEhan(){
        return new Ehan();
    }

}
