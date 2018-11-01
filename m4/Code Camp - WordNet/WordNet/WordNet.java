import java.util.Arrays;
/**
 * Class for word net.
 */
public class WordNet {
    /**
     * Constructs the object.
     *
     * @param      synsets    The synsets
     * @param      hypernyms  The hypernyms
     */
    public WordNet(String synsets, String hypernyms) {
        parseMySynsetFile(synsets);
    }
    /**
     * parseMySynsetFile.
     *
     * @param      filename  The filename
     */
    void parseMySynsetFile(String filename) {
        int id = 0;
        int numOfVertices = 0;
        //In in = new In();
        try {
            In inObj = new In(filename);
            while (!inObj.isEmpty()) {
                numOfVertices++;
                //System.out.println("came inside while loop");
                String[] fileArray = inObj.readString().split(",");
                //numOfVertices = fileArray.length;
                id = Integer.parseInt(fileArray[0]);
                String[] nounsArray = fileArray[1].split(" ");
                System.out.println(Arrays.toString(fileArray));
            }
            Digraph digraphObj = new Digraph(numOfVertices);
            System.out.println(digraphObj);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    // // returns all WordNet nouns
    // public Iterable<String> nouns()

    // // is the word a WordNet noun?
    // public boolean isNoun(String word)

    // // distance between nounA and nounB (defined below)
    // public int distance(String nounA, String nounB)

    // // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
    // // in a shortest ancestral path (defined below)
    // public String sap(String nounA, String nounB)

    // // do unit testing of this class
    // public static void main(String[] args)
}
