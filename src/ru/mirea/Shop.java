package ru.mirea;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {

    public void buy(){
        System.out.println("Введите ФИО");
        String t = new Scanner(System.in).nextLine();


        if(check()) System.out.println("Покупка совершена!");
        else{
            throw new NumberFormatException("А вот нельзя так");
        }


    }
    private boolean check(){

        String regex="[1-9]\\d{11}\\z";//что искать
        System.out.println("Ввведите ИНН (12 цифр):");
        String t = new Scanner(System.in).nextLine();
        Pattern pattern=Pattern.compile(regex);//что искать
        Matcher matcher= pattern.matcher(t); // Где искать
        if(matcher.find()) return true;

        return false;

    }

}
