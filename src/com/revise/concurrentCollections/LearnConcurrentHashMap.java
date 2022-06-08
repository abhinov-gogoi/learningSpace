package com.revise.concurrentCollections;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Source - <a href="https://www.youtube.com/watch?v=bJT634zMbAM">...</a>
 * <a href="https://www.youtube.com/watch?v=uQLAToNIlNE">...</a>
 *
 * Concurrent collections was introduced in Java 1.5
 *
 * Traditional collection classes are NOT thread safe.
 * Only few like Vector, Hashtable are thread safe
 *
 * The problem is that they capture lock on complete collection (even for reading operation)
 * which decreases the performance.
 *
 * In traditional Collection, while iterating over a collection and simultaneously trying to modify the collection
 * we get 'ConcurrentModificationException'.
 * Thus this exception can also occur in single threaded environment, when we modify a collection during iteration - also see 'modCount'
 *
 * In such cases ConcurrentHashMap should be used
 *
 * in HashTable and synchronisedMap, a lock is acquired on the whole collection.
 * So, only a single thread can capture lock at a time.
 *
 * But, in ConcurrentHashMap lock is acquired at bucket level (segments)
 * such that different threads can capture locks on different buckets
 * And read operation no locking is made, so read is faster (reading does not need any lock)
 *
 * Concurrency Level in ConcurrentHashMap
 * By default HashMap size is 16, so there are 16 buckets and thus one lock for each bucket/segment
 * so 16 is the default concurrency level
 *
 * Why null is not allowed in ConcurrentHashMap but allowed in HashMap ?
 * A : to avoid ambiguities.
 * If map.get(key) returns null, you cannot detect whether the key itself is null ir the key explicitly maps to a null value
 */
public class LearnConcurrentHashMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new ConcurrentHashMap<>();
        /**
         * HashMap will throw ConcurrentModificationException
         */
        // Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Map value : "+ map.get(key));
            if(key.equals(2)) {
                // trying to modify the collection, while iterating
                map.put(4, "four");
            }
        }
    }


}
