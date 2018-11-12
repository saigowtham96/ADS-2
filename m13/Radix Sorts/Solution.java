import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     *
     * { main method}
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputs = Integer.parseInt(scan.nextLine());
        String[] array = new String[inputs];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextLine();

        }
        LSD obj = new LSD();
        obj.sort(array, array[0].length());
        System.out.println(Arrays.toString(array));
    } 
}