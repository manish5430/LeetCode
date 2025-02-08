class NumberContainers {
    HashMap<Integer, TreeSet<Integer>> map1;    //  number to index set 
    HashMap<Integer, Integer> map2;            // index to number (one to one)

    public NumberContainers() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        
    }
    
    public void change(int index, int number) {
        if(map2.containsKey(index)){
            int num = map2.get(index);
            map1.get(num).remove(index);
            if(map1.get(num).size() == 0){
                map1.remove(num);
            }
        }
        
        map2.put(index, number);
        if(!map1.containsKey(number)){
            map1.put(number, new TreeSet<>());
        }
        map1.get(number).add(index);       
        
    }
    
    public int find(int number) {    // this si to find the first  index of treeSet in map1
        if(!map1.containsKey(number)){
            return -1;
        }
        return map1.get(number).first();        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */