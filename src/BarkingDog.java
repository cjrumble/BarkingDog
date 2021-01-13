public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeup = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            wakeup = false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            wakeup = true;
        }
    return wakeup;}
}