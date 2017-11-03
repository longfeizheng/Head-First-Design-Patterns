package cn.merryyou.chapter02;

/**
 * Created on 2017/11/3 0003.
 *
 * @author zlf
 * @since 1.0
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
