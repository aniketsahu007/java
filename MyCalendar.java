class MyCalendar {
    Map<Integer, Integer> map;
    public MyCalendar() {
        map = new TreeMap<Integer, Integer>();
    }
    
    public boolean book(int startTime, int endTime) {
        map.put(startTime, map.getOrDefault(startTime, 0) + 1);
        map.put(endTime, map.getOrDefault(endTime, 0) - 1);

        int booking = 0;

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            booking = booking + entry.getValue();

            
            if (booking > 1){
                map.put(startTime, map.getOrDefault(startTime, 0) - 1);   
                map.put(endTime, map.getOrDefault(endTime, 0) + 1);
                if (map.get(startTime)==0){
                    map.remove(startTime);
                }
                if (map.get(endTime)==0){
                    map.remove(endTime);
                }
                return false;
            }

        }
        return true;
    }
}

 
