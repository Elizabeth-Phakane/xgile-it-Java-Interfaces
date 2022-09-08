public class SmartPhone implements RegularPhone, ExtraFeature {

    boolean networkConnection = true;
    double dataBundles = 10;
    int dataPerMin = 1;
    int callMinutes = 3;

    /**
     * This method mimics how a smartphone goes through the process of making a video call, and depletion of data in the process
     */
    @Override
    public void videoCall() {

        double usedData = 0;

        while (dataBundles > 0) {
            if (dataBundles > 0 && networkConnection) {
                System.out.println("Ready to connect video call...");
                usedData = callMinutes * dataPerMin;
            } else {
                System.out.println("Could not connect,Please check mobile Data/network connectivity!");
                break;

            }
            dataBundles = dataBundles - usedData;
        }


    }

    /**
     * This method mimics how a smartphone browses the web by checking for a specific condition before allowance is given
     */

    @Override
    public void internet() {

        int x = 0;
        do {
            System.out.println("Opens up browser");
            if (dataBundles > 0 && networkConnection) {
                System.out.println("Shows browser with searched content output");
            } else {
                System.out.println("Check internet connection,Reload Page.");
                break;
            }
            x++;
        } while (x <= 0);

    }

    /**
     * Here this method displays the word "ringing" for a ringing phone
     */
    @Override
    public void call() {
        System.out.println("Ringing");
    }

    /**
     * Here this method displays "message sent" for a sent message
     */

    @Override
    public void message() {
        System.out.println("Message sent");

    }
}
