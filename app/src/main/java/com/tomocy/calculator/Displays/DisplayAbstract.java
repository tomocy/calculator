package com.tomocy.calculator.Displays;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class DisplayAbstract {

    protected final Deque<String> stack = new ArrayDeque<String>();

}
