package singleton;

public enum Mgr08 {
    INSTANCE;

    public void m() { System.out.println("m"); }

    public static void main(String[] args) {
//        for(int i = 0; i < 100; i++) {
//            new Thread(()->{
//                System.out.println(Mgr08.INSTANCE.hashCode());
//            }).start();
//        }
        Mgr08 m = Mgr08.INSTANCE;
        m.m();
    }
}
