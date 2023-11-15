package ru.anton.seminar02;

import ru.anton.seminar02.client.*;
import ru.anton.seminar02.server.*;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}
