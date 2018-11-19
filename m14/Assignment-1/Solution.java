import java.util.Scanner;
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
     * complexity O(M*N)
     * M number of words in file
     * N word length.
     * {main method}
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        String[] words = loadWords();
        //Your code goes here...
        TST<Integer> tst = new TST<Integer>();
        Scanner scan = new Scanner(System.in);
        String prefix = scan.nextLine();
        int j = 0;
        for (String each : words) {
            SuffixArray suffix = new SuffixArray(each);
            for (int i = 0; i < each.length(); i++) {

            tst.put(suffix.select(i), j++);

        }
    }
         for (String each : tst.keysWithPrefix(prefix)) {
            System.out.println(each);
        }
    }
    /**.
     * Loads words.
     *
     * @return     { description_of_the_return_value }
     */
    public static String[] loadWords() {
        In in = new In("/Files/dictionary-algs4.txt");
        String[] words = in.readAllStrings();
        return words;
    }
}




