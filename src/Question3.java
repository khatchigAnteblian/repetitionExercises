public class Question3 {
    public static void main(String[] args) {
        for (int i=0; i<=100; i++) {
            if (i % 10 != 3 && (i < 30 || i > 39)) {
                System.out.println(i);
            }
        }
    }
}
