/**
 * Created by young on 6/25/17.
 */
public class SimplifyFractions {

    private int top;
    private int bottom;

    public SimplifyFractions(int a, int b) {
        this.top = a;
        this.bottom = b;
        simplify();
    }

    private int simplify() {
        boolean two = this.top % 2 == 0 && this.bottom % 2 == 0;
        boolean three = this.top % 3 == 0 && this.bottom % 3 == 0;
        if (two) {
            this.top /= 2;
            this.bottom /= 2;
        } else if (three) {
            this.top /= 3;
            this.bottom /= 3;
        }
        // recursive
        if (two || three) {
            simplify();
        }
        return 0;
    }

    public static void main(String[] args) {
        SimplifyFractions a = new SimplifyFractions(1536, 78360);
        System.out.println(a.top + " " + a.bottom);
    }

}
