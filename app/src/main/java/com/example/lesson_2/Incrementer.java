package com.example.lesson_2;

import java.util.Objects;

//Класс для увеличения значения

public class Incrementer {

    private int value;

    public Incrementer(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increment (){
        this.value++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incrementer that = (Incrementer) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
