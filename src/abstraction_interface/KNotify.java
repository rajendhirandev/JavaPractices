package abstraction_interface;

/**
 * @author Rajendhiran Easu
 * @date 05, October-2019
 */
public interface KNotify extends INotify, JNotify {

    @Override
    default void toNotify() {

    }

    @Override
    default void defaultNotifier() {

    }
}
