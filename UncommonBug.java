public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 5) {
            System.out.println(i);
            if (i == 3) {
                continue; //This will cause the program to skip printing 4 
            }
            System.out.println("Value of i is: " + i);
        }
    }
}