package com.revise.concurrentCollections;

/**
 * source <a href="https://www.youtube.com/watch?v=uQLAToNIlNE">...</a>
 *
 * FAIL FAST vs FAIL SAFE :
 * ArrayList if FAIL-FAST : if one thread is iterating and other tries to modify (do structural change)
 * then ConcurrentModificationException is thrown
 *
 * CopyOnWriteArrayList is FAIL-SAFE :
 * if one thread is iterating and other tries to modify (do structural change)
 * then new clone of the list will be created and later JVM synchronize the clone and actual copy
 *
 */
public class LearnCopyOnWriteArrayList {
}
