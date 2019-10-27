package hiding;

/**
 * @author Rajendhiran Easu
 * @date 04, October-2019
 * <p>
 * Hiding possible using static, private and final
 */

public class MyHiding {

    public static void main(String[] args) {
        Seek.test();

        // Seek seek = new Seek();
        //Legends legends =seek.getData();
        // legends.MyTitle();

    }
}

class Kids {
    void MyTitle() {
        System.out.println("I'm Kid");
    }
}

class Legends extends Kids {
    @Override
    void MyTitle() {
        System.out.println(" ** Once upon a time **");
        super.MyTitle();
        System.out.println(" ** Now I'm a **");
        System.out.printf("Legend");
    }
}

class Hide {

    static void test() {
        System.out.println("Hidden");
    }

    Kids getData() {
        System.out.println("Hide Kids");
        return new Kids();
    }
}

class Seek extends Hide {

    static void test() {
        System.out.println("Seeker");
    }

    @Override
    Legends getData() {
        System.out.println("Seek Legends");
        Kids kids = super.getData();
        kids.MyTitle();
        return new Legends();
    }

}

abstract class Guru {
    // Point 1 - Error final method can't be abstract.
    //abstract final void test1();

    // Point 2  -- Refer below Sisya Inherited class
    final void test() {

    }

    abstract void tester();
    // Point 3 Error private method can't be abstract need to be have defining
    //abstract private void tester();

    // Point 4 - The private method can't be overrided on the sub-class;
    private void testing() {
        System.out.println("Guru Testing");
    }
}

class Sisya extends Guru {

    @Override
    void tester() {
        test();
    }

    // Point 2 Refer base class
    // Overriding is not possible on final methods.
    /*void test() {

    }*/
}
