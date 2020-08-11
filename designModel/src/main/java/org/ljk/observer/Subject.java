package org.ljk.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:26
 */
public class Subject {
    //容器
    private List<Observer> container = new ArrayList<>();

    //add
    public void addOberver(Observer observer) {
        container.add(observer);
    }

    //remove
    public void removeObserver(Observer observer) {
        container.remove(observer);
    }

    public void notifyObserver(Object o) {
        for (Observer observer : container) {
            observer.update(o);
        }
    }
}
