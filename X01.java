// 12S24040 - Rony Reynaldy Pangaribuan
// 12S24023 - Jaya Bestina Simbolon

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double bukumurah, hargaBuku, total;

        total = 0;
        bukumurah = 9999;
        hargaBuku = Double.parseDouble(input.nextLine());
        while (hargaBuku != 0) {
            if (hargaBuku == 0) {
            } else {
                if (hargaBuku < bukumurah) {
                    bukumurah = hargaBuku;
                } else {
                    hargaBuku = hargaBuku;
                }
                total = total + hargaBuku;
            }
            hargaBuku = Double.parseDouble(input.nextLine());
        }
        if (total >= 100) {
            total = total - bukumurah;
        } else {
            total = total;
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
