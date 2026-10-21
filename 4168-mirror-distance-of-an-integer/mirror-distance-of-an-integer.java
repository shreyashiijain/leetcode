
import static java.lang.Math.abs;
class Solution {
    public int mirrorDistance(int n) {
        int no = n;
        int pal = 0;
        while(no>0){
            int digit = no%10;
            pal = pal*10+digit;
            no = no/10;
        }
        return abs(pal-n);
    }
}