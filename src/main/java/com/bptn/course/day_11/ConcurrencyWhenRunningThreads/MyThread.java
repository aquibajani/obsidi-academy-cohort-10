package com.bptn.course.day_11.ConcurrencyWhenRunningThreads;
import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {

    // Declare an instance variable of type List<Integer>
    List<Integer> list;

    // Create a parameterized constructor.
    MyThread(List<Integer> list) {
		this.list = list;
	}
    
    // Override the run() method here.
    @Override
    public void run() {
    	ListUtils.insertNextId(list);
    }
    
}