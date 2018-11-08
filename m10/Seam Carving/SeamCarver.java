import java.awt.Color;
/**.
 * Class for seam carver.
 */
public class SeamCarver {
    /**.
     * { variable picture}
     */
    private Picture picture;
    // create a seam carver object based on the given picture
    /**.
     * Constructs the object.
     *
     * @param      picture1  The picture 1
     */
    public SeamCarver(final Picture picture1) {
        if (picture1 == null) {
            throw new IllegalArgumentException("picture is null");
        } else {
            this.picture = picture1;
        }
    }
    // current picture
    /**.
     * {returns the picture}
     *
     * @return     { description_of_the_return_value }
     */
    public Picture picture() {
        return this.picture;
    }
    // width of current picture
    /**.
     * {returns the width}
     *
     * @return     { description_of_the_return_value }
     */
    public int width() {
        return picture.width();
    }
    // height of current picture
    /**
     * { returns the height }
     *
     * @return     { description_of_the_return_value }
     */
    public int height() {
        return picture.height();
    }
    // energy of pixel at column x and row y
    /**
     * { returns the energy }
     *
     * @param      x     { parameter_description }
     * @param      y     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public double energy(int x, int y) {
        if (x == 0 || y == 0 || picture.width() - 1 == x || picture.height() - 1 == y) {
            return 1000;
        } else {
            Color top = picture.get(x, y + 1);
            Color bottom = picture.get(x, y - 1); 
            Color right = picture.get(x - 1, y);
            Color left = picture.get(x + 1, y);
            int rh = Math.abs(right.getRed() - left.getRed());
            int bh = Math.abs(right.getBlue() - left.getBlue());
            int gh = Math.abs(right.getGreen() - left.getGreen());
            int horizontal = rh * rh + bh * bh + gh * gh;
            int rv = Math.abs(top.getRed() - bottom.getRed());
            int bv = Math.abs(top.getBlue() - bottom.getBlue());
            int gv = Math.abs(top.getGreen() - bottom.getGreen());
            int vertical = rv * rv + bv * bv + gv * gv;
            double energy = Math.sqrt(horizontal + vertical);
            return energy;
        }       
    }
    // sequence of indices for horizontal seam
    public int[] findHorizontalSeam() {
        return new int[0];
    }

    // sequence of indices for vertical seam
    public int[] findVerticalSeam() {
        return new int[0];
    }

    // remove horizontal seam from current picture
    public void removeHorizontalSeam(int[] seam) {

    }

    // remove vertical seam from current picture
    public void removeVerticalSeam(int[] seam) {

    }
}