package abstraction_interface;

/**
 * @author Rajendhiran Easu
 * @date 26, September-2019
 */
public interface JNotify {
    void toNotify();

    default void defaultNotifier() {
        System.out.println("JDefault Notifier");
    }
}
