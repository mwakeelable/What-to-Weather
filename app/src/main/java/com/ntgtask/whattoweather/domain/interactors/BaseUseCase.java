package com.ntgtask.whattoweather.domain.interactors;

import com.ntgtask.whattoweather.domain.executors.BusProvider;
import com.squareup.otto.Bus;

public abstract class BaseUseCase {
    private final Bus uiBus;
    private Object useCaseSubscriber;

    public BaseUseCase() {
        uiBus = BusProvider.getUIBusInstance();
    }

    protected abstract Object setSubscriber();
    protected abstract void onExecute();

    public void execute() {
        useCaseSubscriber = setSubscriber();
        onExecute();
    }

    protected void post(Object event) {
        uiBus.post(event);
    }

    protected void registerUseCaseSubscriber() {
        try {
            BusProvider.getRestBusInstance().register(useCaseSubscriber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void unregisterUseCaseSubscriber() {
        try {
            BusProvider.getRestBusInstance().unregister(useCaseSubscriber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
