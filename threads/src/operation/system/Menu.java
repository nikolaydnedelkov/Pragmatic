package operation.system;


import java.util.*;
import java.util.concurrent.*;

import com.google.common.collect.ImmutableMap;


public class Menu {

    public static boolean exit;
    private static Menu menu = null;
    private static int count = 0;

    private Menu() {

    }

    public static Menu getIntance() {
        if (menu == null) {
            menu = new Menu ();
        }
        return menu;
    }

    public void printMenu() {
        displayHeader ("Please select a program to Start: ");
        System.out.println ("Chrome");
        System.out.println ("IntelliJIDEA");
        System.out.println ("Word");
        System.out.println ("Excel");
        System.out.println ("Avast");
        System.out.println ("Steam");
        System.out.println ("SublimeText");
        System.out.println ("Outlook");
        System.out.println ("Edge");
        System.out.println ("OneNote");
    }

    //Entering choice for menu option (String)
    public static String getMenuChoice() {
        Scanner sc = new Scanner (System.in);
        String choice = null;
        System.out.print ("Enter your choice: ");
        choice = sc.nextLine ().toLowerCase ();
        return choice;
    }

    public void runMenu() {
        while (!exit) {
            printMenu ();
            String choice = getMenuChoice ();
            performAction (choice);
        }
    }


    ImmutableMap<String, Runnable> programs = ImmutableMap.<String, Runnable>builder ()
            .put ("Chrome", () -> {
                Thread.currentThread ().setName ("Chrome");
                try {
                    TimeUnit.SECONDS.sleep (1);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            })
            .put ("IntelliJIDEA", () -> Thread.currentThread ().setName ("IntelliJIDEA"))
            .put ("Word", () -> {
                Thread.currentThread ().setName ("Word");
            })
            .put ("Excel", () -> {
                Thread.currentThread ().setName ("Excel");
            })
            .put ("Avast", () -> {
                Thread.currentThread ().setName ("Avast");
            })
            .put ("Steam", () -> {
                Thread.currentThread ().setName ("Steam");
            })
            .put ("SublimeText", () -> {
                Thread.currentThread ().setName ("SublimeText");
            })
            .put ("Outlook", () -> {
                Thread.currentThread ().setName ("Outlook");
            })
            .put ("Edge", () -> {
                Thread.currentThread ().setName ("Edge");
            })
            .put ("OneNote", () -> {
                Thread.currentThread ().setName ("OneNote");
            })
            .build ();


    //Performing action, choosing subMenu
    private void performAction(String choice) {
        switch (choice) {
            case "start chrome":
                executor.submit (programs.get ("Chrome"));
                count++;
                break;
            case "start intellijidea":
                executor.submit (programs.get ("IntelliJIDEA"));
                count++;
                break;
            case "stop chrome":
                executor.submit () programs. ("Chrome").
                    count--;
                break;
            default:
                System.out.println ("Unknown error has occured.");
        }
    }

    //Method that display headers in Console
    public static void displayHeader(String message) {
        System.out.println ();
        int width = message.length () + 6;
        StringBuilder sb = new StringBuilder ();
        sb.append ("+");
        for (int i = 0; i < width; ++i) {
            sb.append ("-");
        }
        sb.append ("+");
        System.out.println (sb.toString ());
        System.out.println ("|   " + message + "   |");
        System.out.println (sb.toString ());
    }
}
