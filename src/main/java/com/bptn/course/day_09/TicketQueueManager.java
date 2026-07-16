package com.bptn.course.day_09;

import java.util.LinkedList;
import java.util.Deque;

public class TicketQueueManager {
    public static void main(String[] args) {
        // 1. Create a LinkedList to act as a Queue
    	Deque<String> ticketQueue = new LinkedList<>();

        // 2. New Tickets Arrive (Add to tail using Queue method)
    	ticketQueue.add("101");
    	ticketQueue.add("102");
    	ticketQueue.add("103");
    	System.out.println("Current Ticket Queue: " + ticketQueue);

        // 3. Agent Checks Queue (Peek)
    	ticketQueue.peek(); // returns "101" but does not remove it

        // 4. Process Ticket (Poll) - removes from head
    	ticketQueue.poll(); // removes "101"
    	System.out.println("Current Ticket Queue: " + ticketQueue);
        
        // 5. Urgent New Ticket (Offer First)
    	ticketQueue.offerFirst("99"); // adds "100" to the queue
    	System.out.println("Current Ticket Queue: " + ticketQueue);

        // 6. Process Next
    	ticketQueue.poll();
        
        // Final Check
    	System.out.println("Current Ticket Queue: " + ticketQueue);

    }
}

