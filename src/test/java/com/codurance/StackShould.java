package com.codurance;

import org.junit.Ignore;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StackShould {

    private static final Object SOME_OBJECT = "blah";
    private static final Object ANOTHER_OBJECT = "excetera";

    @Test(expected = EmptyStackException.class)
    public void throw_an_exception_if_popped_when_empty() {
        Stack stack = new Stack();
        stack.pop();
    }

    @Test
    public void push_element_to_top_of_stack() {
        Stack stack = new Stack();
        stack.push(SOME_OBJECT);
        assertThat(stack.getPushed(), is(SOME_OBJECT));
        stack.push(ANOTHER_OBJECT);
        assertThat(stack.getPushed(), is(ANOTHER_OBJECT));
    }

    @Test
    public void pop_the_last_element_pushed() {
        Stack stack = new Stack();
        stack.push(SOME_OBJECT);
        stack.pop();
        assertThat(stack.getPopped(), is(SOME_OBJECT));
    }

}