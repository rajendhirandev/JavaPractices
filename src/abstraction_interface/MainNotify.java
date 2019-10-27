package abstraction_interface;

/**
 * @author Rajendhiran Easu
 * @date 26, September-2019
 */
public class MainNotify {

   /* static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Init Block");
    }

    {
        System.out.println("Initi 2 Block");
    }*/

    public static void main(String[] args) {
        MainNotify mainNotify = new MainNotify();
        //new MainNotify();
        //new MainNotify();

        mainNotify.setNotifier((INotify) () -> {
            System.out.println("My Lambda Main Notify");
        });

       /* mainNotify.setNotifier(new BaseMyNotifier() {
            @Override
            void myNotifier() {
                System.out.println("My Main Notify");
            }
        });*/

        //mainNotify.setNotifier((JNotify) new Guru());
    }

    private void setNotifier(INotify notifier) {
        System.out.println("\n---------------------------");
        notifier.toNotify();
        //notifier.defaultNotifier();
    }

    private void setNotifier(JNotify notifier) {
        System.out.println("\n---------------------------");
        notifier.toNotify();
        notifier.defaultNotifier();
    }
}

/*class Guru implements INotify, JNotify {

    @Override
    public void toNotify() {
        System.out.println("Guru Notification");
    }

    @Override
    public void defaultNotifier() {
        JNotify.super.defaultNotifier();
    }

    void guru() {
        System.out.println("Guru");
    }
}*/
