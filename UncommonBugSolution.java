public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++; //Increment i after printing and before the condition
            if (i == 3) {
                continue; //The continue statement will skip printing "Value of i is: 3"
            }
            System.out.println("Value of i is: " + i);
        }
    }
}
