package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        String[] arr = electronicsItems.split(",");
        for(String h : arr){
            if(! itemList.contains(h)){
                itemList.add(h);
            }

        }

        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        if (itemList.contains(searchItem)) {
            return itemList.indexOf(searchItem);
        }else{
            return -1;
        }
    }
    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;
        Iterator<String> itr =itemList.iterator();
        while(itr.hasNext()) {
            if (itr.next().equals(removeItem)) {
                itemList.remove(removeItem);
                flag = true;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        System.out.println(addElectronicsItemsToList("TV,Computer,Refrigerator,Computer"));

        List<String> itemList = addElectronicsItemsToList("TV,Computer,Refrigerator,Computer");
        System.out.println("itemList = " + itemList);
        System.out.println("Index : "+ searchElectronicItemInList(itemList, "TV"));

        System.out.println(removeElectronicsItemFromList(itemList, "Computer"));
        System.out.println("itemList = " + itemList);
    }


}