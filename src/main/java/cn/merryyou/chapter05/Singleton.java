package cn.merryyou.chapter05;

/**
 * Created on 2017/11/14 0014.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class Singleton {
    //静态变量记录唯一实例
    private static Singleton uniqueInstance;

    //私有化构造方式
    private Singleton() {
    }

    ;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
