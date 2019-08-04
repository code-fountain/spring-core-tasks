package com.codefountain.spring.core.postprocessor;

import javax.annotation.PostConstruct;

public class Action {

    private String actionId;
    private String actionType;

    public Action(String actionId, String actionType) {
        this.actionId = actionId;
        this.actionType = actionType;
    }

    public String getActionId() {
        return actionId;
    }

    public String getActionType() {
        return actionType;
    }

    @PostConstruct
    public void init(){
        System.out.println("Action Id "+actionId+", Action type"+actionType);
    }
}
