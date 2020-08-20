package reflection;

public class Test02 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 引起类的加载
        Son son = new Son();
//        Father father = new Father();
//        Class.forName("reflection.Son");

//        System.out.println(Son.b);

        // 不会引起子类加载
//        System.out.println(Son.a);

        // 不会引起类加载
//        Son[] sons = new Son[5];
//        System.out.println(Son.M);
    }
}

class Father {
    static {
        System.out.println("父类被加载");
    }

    static int a = 1;

    public Father() {
        System.out.println("父类构造函数执行");
    }
}

class Son extends Father {
    static {
        System.out.println("子类被加载");
    }

    static int b = 2;
    static final int M = 3;

    public Son() {
        System.out.println("子类构造函数执行");
    }
}
