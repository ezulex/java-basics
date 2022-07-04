package org.itmo.java.lesson6.homework;

import org.itmo.java.lesson6.homework.FifthPack.AdminUser;
import org.itmo.java.lesson6.homework.FourthPack.GiftBox;
import org.itmo.java.lesson6.homework.abstractPack.Customer;
import org.itmo.java.lesson6.homework.extendPack.Truck;

import java.io.IOException;

import static org.itmo.java.lesson6.homework.GetString.getStringFromKeyboard;

public class Main {


    public static void main(String[] args) throws IOException {
        Customer customer = new Customer(getStringFromKeyboard("имя"),
                getStringFromKeyboard("фамилию"), getStringFromKeyboard("название банка"));
        customer.getInformation();


        Truck truck = new Truck(3500, "Scania", 'Y', 250.0f, 8, 16000);
        truck.newWheels(Integer.parseInt(getStringFromKeyboard("количество колёс")));

        GiftBox giftBox = new GiftBox();
        giftBox.setThingCount();
        giftBox.getThingCount();

        AdminUser adminUser = new AdminUser();
        adminUser.setUserName();
    }
}
