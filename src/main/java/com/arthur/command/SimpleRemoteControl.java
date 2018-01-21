package com.arthur.command;

/**
 * Created by Arthur on 2018/1/21.
 */
public class SimpleRemoteControl {

    private Command slot;

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
