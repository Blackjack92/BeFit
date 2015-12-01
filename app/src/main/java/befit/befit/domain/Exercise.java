package befit.befit.domain;

import java.util.Observable;

/**
 * Created by Kevin on 29.11.2015.
 */
public class Exercise extends Observable {

    private String name;

    public String getValue() {
        return name;
    }

    public void setValue(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }

}
