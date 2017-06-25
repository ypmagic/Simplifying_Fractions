/**
 * Created by young on 6/25/17.
 */
public class SimplifyFractions {

    private int top;
    private int bottom;

    public SimplifyFractions(int a, int b) {
        this.top = a;
        this.bottom = b;
    }

    private int simplify() {
        if (this.top % 2 == 0 && this.bottom % 2 == 0) {
            this.top /= 2;
            this.bottom /= 2;
        } else if (this.top % 3 == 0 && this.bottom % 3 == 0) {
            this.top /= 3;
            this.bottom /= 3;
        } else {
            return 0;
        }
        simplify();
        return 0; // just to compile
    }

}
