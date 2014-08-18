package com.codurance;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {

    private ArrayList array = new ArrayList();
    private Object popped = new Object();

    public void pop() {
        if (array.size() == 0) {
            throw new EmptyStackException();
        } else {
            popped = array.get(array.size() - 1);
            array.remove(popped);
        }
    }

    public void push(Object object) {
        array.add(object);
    }

    public Object getPushed() {
        return array.get(array.size() - 1);
    }

    public Object getPopped() {
        return popped;
    }

    public ArrayList getArray(){
        return array;
    }
}