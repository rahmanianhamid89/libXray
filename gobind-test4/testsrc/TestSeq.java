public class TestSeq {
    public static void main(String[] args) {
        System.out.println("1: START");

        try {
            System.out.println("2: BEFORE Class.forName");
            Class.forName("go.Seq");
            System.out.println("3: AFTER Class.forName");

            System.out.println("4: BEFORE Seq.touch");
            go.Seq.touch();
            System.out.println("5: AFTER Seq.touch");

        } catch (Throwable e) {
            System.out.println("JAVA ERROR:");
            e.printStackTrace();
        }

        System.out.println("6: FINISHED");
    }
}
