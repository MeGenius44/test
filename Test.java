public class Test {
    public static void main(String... args) {
        for (int i = 1; i < 11; i++) {
            if (i == 10) {
                IO.print(i);
                break;
            }

            IO.print(i + ", ");
        }

        IO.println();

        String someone = "Me!";

        IO.println(someone);
    }
}