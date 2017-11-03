package cn.merryyou.chapter02;

/**
 * Created on 2017/11/3 0003.
 *
 * @author zlf
 * @since 1.0
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
}
