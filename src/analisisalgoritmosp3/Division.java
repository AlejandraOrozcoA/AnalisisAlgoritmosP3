
package analisisalgoritmosp3;

public class Division {

    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    
    public Division() {
    }

    public int getCount1() {
        return count1;
    }

    public int getCount2() {
        return count2;
    }

    public int getCount3() {
        return count3;
    }

    public int Division1( int n, int div){
        count1 = 0;
        count1++;
        int q = 0;
        count1++;
        while (n>= div) {
            count1++;
            n = n-div;
            count1++;
            q = q+1;
        }
        count1++;
        count1++;
        int res = n;
        count1++;
        return q;
    }
    
    public int Division2(int n, int div){
        count2 = 0;
        count2++;
        int dd = div;
        count2++;
        int q = 0;
        count2++;
        int r = n;
        count2++;
        while (dd <= n) {
            count2++;
            dd=2*dd;
        }
        count2++;
        count2++;
        while (dd>div) {
            count2++;
            dd=dd/2;
            count2++;
            q=2*q;
            count2++;
            if (dd<=r) {
                count2++;
                r=r-dd;
                count2++;
                q=q+1;
            }
        }
        count2++;
        count2++;
        return q;
    }
    
    public float Division3(int n, int div){
        count3++;
        if (div>n) {
            return 0;
        } else {
            count3++;
            return 1+ this.Division3(n-div, div);
        }
    }
    
    
}
