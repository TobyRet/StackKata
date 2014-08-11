package com.codurance;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {

    public ArrayList array = new ArrayList();
    public Object popped;

    public void pop() {
        if(array.size() == 0) {
            throw new EmptyStackException();
        } else {
            popped = array.remove(array.size()-1);
        }
    }

    public void push(Object object) {
        array.add(object);
    }

    public Object getPushed() {
        return array.get(array.size()-1);
    }

    public Object getPopped() {
        return popped;
    }
}