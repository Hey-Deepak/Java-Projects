public class MultidimensionalArray {
    public static void main(String[] args) {
        String[][] myName = { { "Deepak", "Choudhary", "Babu", "Suraj", "Narad" },
                              { "DC", "Dipu", "Dfuck", "Deep Fuck", "The Fuck" } };
        for (int i = 0; i < myName.length; i++) {
            for (int j = 0; j < myName.length; j++) {
                System.out.println(myName[i][j]);
            }
        }
    }
}