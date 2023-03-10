package org.example.builder;

public class Window {

    private boolean isOpen;

    public Window() {
        isOpen = false;
    }

    public Window(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "Window{" +
                "isOpen=" + isOpen +
                '}';
    }
}
