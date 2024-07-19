class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int des) {
        int n = distance.length;
        int p1 = 0 , p2 = 0;
        for(int i = 0 ; i < n ; i++) {

            if(start <= i && i < des || start > i && i >= des){
                p1 += distance[i];
            }
            else {
                p2 += distance[i];
            }
        }
        if(p2 > p1) return p1;
        return p2;
    }
}