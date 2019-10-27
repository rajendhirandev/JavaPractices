package abstraction_interface;

/**
 * @author Rajendhiran Easu
 * @date 26, September-2019
 */
abstract public class BaseMyNotifier implements INotify {

    abstract void myNotifier();

    @Override
    public void toNotify() {
        System.out.println("Base Notifier");
        myNotifier();
    }

    public void otherNotification() {
        System.out.println("Other Notification Comes here...");
    }

    static void fromBaseNotifier() {

    }

}

