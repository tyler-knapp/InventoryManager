package com.philo.demo.filereader;

import com.philo.demo.Items.Hat;
import com.philo.demo.Items.Items;
import com.philo.demo.Items.Jeans;
import com.philo.demo.Items.Shirt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {

public Map<String, Items> read(String filename) {
    Map<String, Items> inventory = new TreeMap<String, Items>();

    File file = new File(filename);
    Items newItems = null;

    try (Scanner in = new Scanner(file)) {

        while (in.hasNext()) {
            String item = in.nextLine();
            String[] parts = item.split("\\|");

            String code = parts[0];
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            String type = parts[3];

            if(type.equalsIgnoreCase("J")){
                newItems = new Jeans(code, name, price);
            }
            if(type.equalsIgnoreCase("H")){
                newItems = new Hat(code, name, price);
            }
            if(type.equalsIgnoreCase("S")){
                newItems = new Shirt(code, name, price);
            }
            inventory.put(parts[0], newItems);
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return inventory;
    }

}

