package hwOtherProgrammes;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class P8_RightAngleTriangle {
    public static void main(String[] args) {

        int num = 6;

        for(int i = 0; i<=num; i++){
            for(int j = 1; j < i; j++)
                System.out.print("@");
            System.out.println("");
        }
    }
}
