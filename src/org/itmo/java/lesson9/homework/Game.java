package org.itmo.java.lesson9.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Game implements startGame {
    Map<String, Integer> users = new HashMap<>();

    @Override
    public Integer createGame() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество игроков: ");
        return Integer.parseInt(reader.readLine());
    }

    @Override
    public void createUser(int count, int size) throws IOException {

        for (int i = 0; i < count; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите имя игрока: ");
            String inputName = reader.readLine();
            User user = new User(inputName);
            users.put(inputName, randomGenerate(size));
        }
        System.out.println(users);
    }

    @Override
    public Integer returnPointsByName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя игрока для отображаения очков: ");
        String inputName = reader.readLine();
        Integer userPoints = users.get(inputName);
        System.out.println("У " + inputName + " - " + userPoints + " очков.");
        return userPoints;
    }

    protected int randomGenerate(int size) {
        Random random = new Random();
        int randomInt = random.nextInt(size);
        return randomInt;
    }
}
