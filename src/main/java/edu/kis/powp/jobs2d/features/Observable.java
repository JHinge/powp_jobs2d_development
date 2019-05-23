package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.observer.Subscriber;

public class Observable implements Subscriber {

    private DriverManager driverManager;
    private Application app = DriverFeature.getApp();

    public Observable(DriverManager driverManager){
        this.driverManager = driverManager;
    }

    @Override
    public void update() {
        DriverFeature.getApp().updateInfo(driverManager.getCurrentDriver().toString());
    }
}
