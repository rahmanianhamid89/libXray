public class TestLoad {
    public static void main(String[] args) {
        System.out.println("1: START");

        try {
            System.out.println("2: BEFORE loadLibrary");
            System.loadLibrary("gojni");
            System.out.println("3: AFTER loadLibrary");

            System.out.println("4: BEFORE Seq Class.forName");
            Class.forName("go.Seq");
            System.out.println("5: AFTER Seq Class.forName");

        } catch (Throwable e) {
            System.out.println("JAVA ERROR:");
            e.printStackTrace();
        }

        System.out.println("6: FINISHED");
    }
}
