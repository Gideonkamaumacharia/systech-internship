package javaSECertPrep.Gratis.Loops;

public class ForLoop {
    static void main() {
        String [][] cbs = new String[2][];
        cbs[0] = new String[2]; //column sizes for outer loop -> a
        cbs[1] = new String[5]; //column sizes for inner loop -> b

        //Now the array looks like;
        /**Row 0 → [ ?, ? ]          (length 2)
         Row 1 → [ ?, ?, ?, ?, ? ] (length 5)
         **/

        int i = 97;

        //stops at a = 2;
        for (int a = 0; a < cbs.length; a++){
            for( int b = 0; b < cbs.length; b++){//stops at b = 5
                cbs[a][b] = "" + i;
                i++;
            }
        }
        for (String[] ca : cbs){
            for(String c : ca){
                System.out.println(c + "");
            }
            System.out.println();
        }
    }
        /**
         * Outer loop (a → rows)
         * for (int a = 0; a < cbs.length; a++)
         *
         *
         * cbs.length == 2
         *
         * a = 0, then a = 1
         *
         * So we are filling row 0, then row 1.
         *
         * Inner loop (b → columns)
         * for (int b = 0; b < cbs.length; b++)
         *
         *
         * ⚠️ Here is the logical error
         *
         * You are using:
         *
         * b < cbs.length   // which is 2
         *
         *
         * But column sizes are:
         *
         * cbs[0].length = 2
         *
         * cbs[1].length = 5
         *
         * So the inner loop always runs exactly 2 times, no matter which row you are in.
         *
         * What actually gets filled
         * When a = 0
         *
         * Row 0 has length 2, so:
         *
         * b = 0 ✔
         * b = 1 ✔
         *
         *
         * Works fine.
         *
         * Row 0 becomes:
         *
         * [ "97", "98" ]
         *
         * When a = 1
         *
         * Row 1 has length 5, but inner loop still runs only 2 times:
         *
         * b = 0 ✔
         * b = 1 ✔
         *
         *
         * Row 1 becomes:
         *
         * [ "99", "100", null, null, null ]
         *
         *
         * 👉 No exception here — but array is only partially filled.
         *
         * 3️⃣ Printing the array (enhanced for-loop)
         *
         * Now let’s look at the part you specifically asked about 👇
         *
         * for (String[] ca : cbs) {
         *     for (String c : ca) {
         *         System.out.println(c + "");
         *     }
         *     System.out.println();
         * }
         *
         * 4️⃣ First enhanced for-loop (rows)
         * for (String[] ca : cbs)
         *
         *
         * Plain English:
         *
         * “For each row in the 2D array cbs, store it in ca.”
         *
         * So:
         *
         * First iteration → ca = cbs[0]
         *
         * Second iteration → ca = cbs[1]
         *
         * 5️⃣ Second enhanced for-loop (elements in each row)
         * for (String c : ca)
         *
         *
         * Plain English:
         *
         * “For each String inside the current row ca, store it in c.”
         *
         * When printing row 0
         *
         * ca = cbs[0] → length 2
         *
         * "97"
         * "98"
         *
         *
         * Printed one per line.
         *
         * When printing row 1
         *
         * ca = cbs[1] → length 5
         *
         * "99"
         * "100"
         * null
         * null
         * null
         *
         *
         * Because:
         *
         * You only filled the first 2 elements
         *
         * The remaining elements default to null
         *
         * Java prints:
         *
         * null
         *
         *
         * (no exception here).
         *
         * This line
         * System.out.println();
         *
         *
         * Prints a blank line after each row — just formatting.
         *
         * 6️⃣ Final output (conceptually)
         * 97
         * 98
         *
         * 99
         * 100
         * null
         * null
         * null
         *
         * 7️⃣ The REAL correct version (exam-quality)
         *
         * To correctly fill all columns, the inner loop must be:
         *
         * for (int b = 0; b < cbs[a].length; b++)
         *
         *
         * That means:
         *
         * “Loop until the current row’s length, not total rows.”
         *
         * 8️⃣ Key exam takeaway 🔑
         *
         * array.length → number of rows
         *
         * array[row].length → number of columns in that row
         *
         * Enhanced for loops never throw index errors
         *
         * null printing ≠ exception
         *
         * If you want, next we can:
         *
         * Rewrite this using ASCII characters instead of numbers
         *
         * Convert it to single-loop logic
         *
         * Or practice a trick OCA question based on this exact concept
         * **/

}
