package com.arthur.command;

/**
 * Created by Arthur on 2018/1/21.
 */
public class LightOnCommand implements Command {

    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
