package DataStructuresJava;

public class bitManipulationProblems {
    public static void main(String[] args) {

        //Get the 3rd bit of a number n = 0101
        int n = 5;
        int pos = 3;
        int mask = 1 << pos;
        if ((mask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }

        //Set 2nd bit of a number n = 0101
        mask = 1 << 1;
        int newBit = n | mask;
        System.out.println(newBit);

        //Clear the 3rd bit of n
        mask = 1 << 2;
        int comp = ~mask;
        int cleanBit = n & comp;
        System.out.println(cleanBit);

        //Update the 2nd bit of n to 1
        mask = 1 << 1;
        int updateBit = n | mask;
        System.out.println(updateBit);
        //To 0 for n = 0111
        n = 7;
        mask = 1 << 1;
        comp = ~mask;
        int UpdateBit = n & comp;
        System.out.println(UpdateBit);

    }
}
