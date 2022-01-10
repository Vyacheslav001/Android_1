package com.example.lesson_2;

//57:00
//Паттерн Singleton (одиночка).  Этот паттерн гарантирует, что у класса есть только один объект
// (один экземпляр класса) и к этому объекту предоставляется глобальная точка доступа.
// Из описания должно быть понятно, что этот паттерн должен применяться в двух случаях:
//1. Когда в вашей программе должно быть создано не более одного объекта какого-либо класса.
// Например, в компьютерной игре у вас есть класс «Персонаж», и у этого класса должен быть
// только один объект описывающий самого персонажа.
//2. Когда требуется предоставить глобальную точку доступа к объекту класса.
// Другими словами, нужно сделать так, чтобы объект вызывался из любого места программы.
//https://javarush.ru/groups/posts/589-patternih-i-singleton--dlja-vsekh-kto-vpervihe-s-nimi-stolknulsja

public class Incr {

    private static Incr instance;

    private int value;

    public int getValue() {
        return value;
    }

    public void increment(){
        value++;
    }

    public static Incr getInstance() {
        if (instance == null){
            instance = new Incr();
        }
        return instance;
    }

    private Incr(){
    }
}
