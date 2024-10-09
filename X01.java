// 12S24040 - Rony Reynaldy Pangaribuan
// 12S24023 - Jaya Bestina Simbolon

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double bukuMurah, hargaBuku, total;

        total = 0;
        bukuMurah = 9999;
        do {
            hargaBuku = Double.parseDouble(input.nextLine());
            if (hargaBuku == 0) {
            } else {
                if (hargaBuku < bukuMurah) {
                    bukuMurah = hargaBuku;
                } else {
                    hargaBuku = hargaBuku;
                }
                total = total + hargaBuku;
            }
        } while (hargaBuku != 0);
        if (total > 0) {
            total = total - bukuMurah;
        } else {
            total = total;
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
