public class TestSeqInit {
    public static void main(String[] args) {
        System.out.println("1: START");

        try {
            System.out.println("2: BEFORE loadLibrary");
            System.loadLibrary("gojni");
            System.out.println("3: AFTER loadLibrary");

            System.out.println("4: BEFORE Class.forName(false)");
            Class<?> c = Class.forName(
                    "go.Seq",
                    false,
                    TestSeqInit.class.getClassLoader()
            );
            System.out.println("5: AFTER Class.forName(false)");

            System.out.println("6: BEFORE getDeclaredMethod(init)");
            java.lang.reflect.Method m =
                    c.getDeclaredMethod("init");
            m.setAccessible(true);
            System.out.println("7: AFTER getDeclaredMethod(init)");

            System.out.println("8: BEFORE init.invoke");
            m.invoke(null);
            System.out.println("9: AFTER init.invoke");

        } catch (Throwable e) {
            System.out.println("JAVA ERROR:");
            e.printStackTrace();
        }

        System.out.println("10: FINISHED");
    }
}
