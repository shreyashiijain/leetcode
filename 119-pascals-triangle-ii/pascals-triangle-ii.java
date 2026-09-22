import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int r) {
        long e = 1; 
        ArrayList<Integer> a = new ArrayList<>();
        a.add((int) e);
        
        for (int i = 0; i < r; i++) {
            e = e * (r - i);
            e = e / (i + 1); 
            a.add((int) e);
        }
        return a;
    }
}