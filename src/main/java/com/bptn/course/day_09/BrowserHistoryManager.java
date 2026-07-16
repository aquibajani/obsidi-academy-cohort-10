package com.bptn.course.day_09;

import java.util.LinkedList;

public class BrowserHistoryManager {
    public static void main(String[] args) {
        // 1. Create a LinkedList for history
    	LinkedList<String> history = new LinkedList<>();

        // 2. Visit Pages (Add to end/tail)
    	history.add("https://www.google.com");
    	history.addLast("https://www.github.com");
    	history.addLast("https://www.codio.com");
    	history.addLast("https://www.obsidi.com");
    	history.addLast("https://www.linkedin.com");
	    System.out.println("Current History: " + history);	

        // 3. Go Back (Remove Last/Tail)
	    System.out.println("User went back from "+ history.removeLast());
    	System.out.println("Current History: " + history);
    	
        // 4. Visit a New Page
    	history.addLast("https://www.stackoverflow.com");

        // 5. View Current History
    	System.out.println("Current History: " + history);

    }
}

