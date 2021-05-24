package net.kanzler.oop.callback;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Button button = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Override click");
            }
        });

        button.click();

        Button button1 = new Button(new ButtonClickHandler());
        button1.click();

        Button tvButton = new Button(new EventHandler() {

            private boolean on = false;

            @Override
            public void execute() {
                if(on) {
                    System.out.println("TV off");
                    on = false;
                } else {
                    System.out.println("TV on");
                    on = true;
                }
            }
        });

        tvButton.click();
        tvButton.click();
        tvButton.click();
        tvButton.click();
    }
}

interface EventHandler {
    void execute();
}

class ButtonClickHandler implements EventHandler {

    @Override
    public void execute() {
        System.out.println("Click button");
    }
}

class Button {
    EventHandler eventHandler;

    Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public  void click() {
        eventHandler.execute();
    }
}