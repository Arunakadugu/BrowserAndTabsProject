package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        Tabs myTabs = new Tabs();
        String answer = " yes";
        int count = 1;
        ArrayList<Browser> Browsers = new ArrayList<>();
        ArrayList<Tabs> moreTabs = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println(" enter Browser Name:");
            myBrowser.setBrowserName(keyboard.nextLine());

            if (!answer.equalsIgnoreCase("Internet Explorer")) {
                System.out.println("Enter browser name:");
                answer = keyboard.nextLine();
                myBrowser.getBrowserName();
            }
            do {
                myTabs = new Tabs();
                System.out.println("Enter Tab Title:");
                myTabs.setTabTitle(keyboard.nextLine());
                System.out.println("Enter URL");
                myTabs.setUrl(keyboard.nextLine());
                myBrowser.addTabs(myTabs);
                System.out.println("do you want to enter  Tab Title(yes/no)");
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    myTabs.getTabTitle();
                } else if (!answer.equalsIgnoreCase("yes")) {
                    myTabs.getTabTitle();
                } else {
                    System.out.println("quit");
                }
            } while (answer.equalsIgnoreCase("yes"));
        }while(answer.equalsIgnoreCase("yes"));
//        for(Browser eachBrowser : Browsers) {
//            System.out.println("browser name:" + myBrowser.getBrowserName() );

            for (Tabs eachTabs :myBrowser.getMoreTabs()) {
                System.out.println("Tab Title:" + eachTabs.getTabTitle());
                System.out.println("URL:" + eachTabs.getUrl());
                count += 1;

            }
//        }

        System.out.println("Browser Name:" +myBrowser.getBrowserName() + "\n " + " Tab Title:"+ "\n " +myTabs.getTabTitle()
                + " \n" + "URL" +" " +myTabs.getUrl());
    }

}
