public class SingleTon {
    private static SingleTon instance = new SingleTon();

    String sname;

    private SingleTon() {
        sname = "Billing Software";
    }
    
    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
