package BitManipulation;

public class RightMostSetBit {

    int n = 8;
    int rmsbm = n & -n;
    System.out.println(Integer.toBinaryString(rmsbm));
}
