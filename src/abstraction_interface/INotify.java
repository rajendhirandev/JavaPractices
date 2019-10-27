package abstraction_interface;

/**
 * @author Rajendhiran Easu
 * @date 26, September-2019
 */
public interface INotify {
    void toNotify();

    default void defaultNotifier() {
        System.out.println("IDefault Notifier");
    }

    static void tester() {

    }
}
