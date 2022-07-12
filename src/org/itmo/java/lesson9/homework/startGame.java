package org.itmo.java.lesson9.homework;

import java.io.IOException;

public interface startGame {
    Integer createGame() throws IOException;
    void createUser(int count, int size) throws IOException;
    Integer returnPointsByName() throws IOException;
}
