public class BinarySearch {
    int[] array = {1, 3, 4, 6, 12, 15, 17, 18, 20, 26, 28, 39, 40, 41};
    int item = 18;
    int fi = 0;
    int li = array.length - 1;
    int mi = (fi + li)/ 2;

    public static void main(String[] args) {

        while (true) {
            if (mi == item) {
                System.out.println("item on " + mi);
                break;
            } else if (item < mi) {
                li = mi - 1;
            } else fi = mi + 1;

            mi = (fi + li) / 2;
        }
    }
}