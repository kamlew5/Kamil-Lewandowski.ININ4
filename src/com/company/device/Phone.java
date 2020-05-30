package com.company.device;

import com.company.Saleable;
import com.company.creatures.Human;
import java.net.URL;

public class Phone extends device implements Saleable {
    static final String defAppServName = "www.example.com";
    static final String defAppServProt = "https";
    static final String deftAppSerVer = "1.2.5.2.1";


    public Phone(String model, Integer year, Double price, String mark) {
        super(model, year, price, mark);
    }

    public void InstallApp(String appName) {}
    public void InstallApp(String appName, String appVersion) {}
    public void InstallApp(String appName, String appVersion, String serverAddr) {}
    public void InstallApp(String[] appNameList) {}
    public void InstallApp(URL urlToApp) {}

    @Override
    void TurnOn() {
        System.out.println("Telefon robi bip bip");
    }
    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Telefon został sprzedany nowemu właścicielowi.");
        } else {
            System.out.println("Za mało siana.");
        }
    }
}