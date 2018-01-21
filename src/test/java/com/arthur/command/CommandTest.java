package com.arthur.command;

import org.junit.Test;

/**
 * Created by Arthur on 2018/1/21.
 */
public class CommandTest {

    @Test
    public void testCommand() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        LightOnCommand lightOn = new LightOnCommand();
        lightOn.setLight(new Light());
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
