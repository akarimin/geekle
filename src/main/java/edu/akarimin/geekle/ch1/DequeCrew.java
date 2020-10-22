package edu.akarimin.geekle.ch1;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeCrew {

    public static void main(String[] args) {                       // Scott,wolf,Odo
        Deque<String> crew = new LinkedList<>();
        crew.addFirst("Wolf");
        crew.addFirst("Odo");
        crew.addLast("Scott");

        Queue<String> crewQueue = Collections.asLifoQueue(crew);   // Scott,wolf,Odo
        System.out.println(crewQueue.poll());
        System.out.println(crewQueue.poll());
        System.out.println(crewQueue.poll());
    }
}
