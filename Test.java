public class Test {
    public static void main(String... args) {
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                IO.print(i);
                break;
            }

            IO.print(i + ", ");
        }
    }
}