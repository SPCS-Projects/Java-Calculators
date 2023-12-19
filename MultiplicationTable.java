public class multiplication {
    public static void main(String[] args) {
        int temp;
        String str;
        System.out.println("Multiplication table of 9 (1-5):");
        for (int i = 1; i< 6; i++){
            temp = 9*i;
            str = String.format("%d * 9 = %d", i, temp);
            System.out.println(str);
        }
    }
}