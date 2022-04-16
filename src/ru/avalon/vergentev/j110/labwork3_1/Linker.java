package ru.avalon.vergentev.j110.labwork3_1;

public class Linker {
    public Linker next;
    public String data;


    //CONSTRUCTORS
    public Linker(String data) {
        this.data = data;
    }

    //METHODS
    @Override
    public String toString() {
        return data;
    }

    //GETTER AND SETTERS
}
