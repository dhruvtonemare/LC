# 146. LRU Cache
# https://leetcode.com/problems/lru-cache/

class LRUCache {
    private final int capacity;
    private final HashMap <Integer, Integer>cache ;
     private final    Deque<Integer> storage ;

    public LRUCache(int capacity) {
        // HahMap to  get the  key
        this.cache=new HashMap<>(); 
        this.capacity=capacity;
        this.storage=new LinkedList<>();
       
     
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        storage.remove((Integer)key);
        storage.addLast(key);
        return cache.get(key);



    }
    
    public void put(int key, int value) {




        // put value in both hashmap and the queue


        // check if it exists already or not 
        if(cache.containsKey(key)){
            cache.put(key,value);
            storage.remove((Integer)key);
        storage.addLast(key);
        }
        else{


        //check first  if the quue size is full 
       if(capacity == cache.size()){
        int remove= storage.removeFirst();
        cache.remove(remove);
        }
        cache.put(key,value);
        storage.addLast(key);
      }
        

        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */