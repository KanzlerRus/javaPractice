package net.kanzler.oop.callback;

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