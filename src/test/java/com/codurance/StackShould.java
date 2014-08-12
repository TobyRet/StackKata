package com.codurance;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StackShould {

    private static final Object SOME_OBJECT = "blah";
    private static final Object ANOTHER_OBJECT = "excetera";

    Stack stack;

    @Before
    public void setUp() {
       stack = new Stack();
    }

    @Test(expected = EmptyStackException.class)
    public void throw_an_exception_if_popped_when_empty() {
        stack.pop();
    }

    @Test
    public void push_element_to_top_of_stack() {
        stack.push(SOME_OBJECT);
        assertThat(stack.getPushed(), is(SOME_OBJECT));
        stack.push(ANOTHER_OBJECT);
        assertThat(stack.getPushed(), is(ANOTHER_OBJECT));
    }

    @Test
    public void pop_the_last_element_pushed() {
        stack.push(SOME_OBJECT);
        stack.pop();
        assertThat(stack.getPopped(), is(SOME_OBJECT));
    }

}