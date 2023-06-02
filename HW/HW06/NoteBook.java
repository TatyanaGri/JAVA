package HW.HW06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

public class NoteBook {
    private String brand
    private String model
    private String display
    private Integer id
    private Integer hdd
    private String os
    private String color
    private boolean isBooked = false;
  
    public NoteBook(String brand, String model, String display, int id, int hdd, String os, String color, double price){
        this.brand = brand;
        this.model = model;
        this.display = display;
        this.id = id;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        System.out.println("Ноутбук марки "+"'"+ this.brand+"'"+" Модель "+this.model+" id " +Integer.toString(this.id));
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String getDisplay(){
        return this.display;
    }

    public Integer getid(){
        return this.id;
    }

    public Integer getHdd(){
        return this.hdd;
    }

    public String getOs(){
        return this.os;
    }

    public String getColor(){
        return this.color;
    }

    public void Book() {
        if (isBooked == false){
            this.isBooked = true;
        }
        else System.out.println("Зарезервирован");
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append(this.brand);
        sb.append(" ");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS "+this.os);
        sb.append(System.lineSeparator());
        sb.append("HDD "+this.hdd);
        sb.append(System.lineSeparator());
        if(this.isBooked==false) sb.append("Не зарезервирован");
        else sb.append("Зарезервирован");
        return(sb.toString());
    }
}