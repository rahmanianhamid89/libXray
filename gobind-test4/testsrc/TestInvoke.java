import cgo_bridge.Cgo_bridge;

public class TestInvoke {
    public static void main(String[] args) {
        System.out.println("1: START");

        try {
            System.out.println("2: BEFORE Class.forName(Cgo_bridge)");

            Class.forName("cgo_bridge.Cgo_bridge");

            System.out.println("3: AFTER Class.forName(Cgo_bridge)");

            System.out.println("4: BEFORE invoke");

            String request = "{\"test\":\"hello\"}";

            String response = Cgo_bridge.invoke(request);

            System.out.println("5: AFTER invoke");
            System.out.println("Response = " +
                (response == null ? "<NULL>" : response));

        } catch (Throwable e) {
            System.out.println("JAVA ERROR:");
            e.printStackTrace();
        }

        System.out.println("6: FINISHED");
    }
}
