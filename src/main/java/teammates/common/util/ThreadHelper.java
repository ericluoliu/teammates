package teammates.common.util;

/**
 * Holds thread-related helper functions.
 */
public final class ThreadHelper {

    private static final Logger log = Logger.getLogger();

    private ThreadHelper() {
        // utility class
    }

    /**
     * Makes the thread sleep for the specified time.
     */
    public static void waitFor(int timeInMilliSeconds) {
        try {
            Thread.sleep(timeInMilliSeconds);
        } catch (InterruptedException e) {
            log.severe("", e);
        }
    }

}
