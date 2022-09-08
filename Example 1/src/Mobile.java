public class Mobile implements Functionality {

    boolean isPhoneOn = true;
    String connectivity = "High";

    double airtime = 7.50;

    /**
     * This method shows how a regular phone sends a message by checking for specific requirements first
     */
    public void message() {

        if((isPhoneOn && connectivity.equals("High")) && airtime>0){
            System.out.println("Message sent");
        }

    }

    /**
     * This method shows how a regular phone recieves a call by checking for specific requirements first
     */
    public void calling() {
        if((isPhoneOn && connectivity.equals("High")) && airtime>0){
            for(int k =0; k<noRings;k++){
                System.out.println("Ringing...");
            }
        }

        else{
            System.out.println("You have reached the voicemail,Sorry!");
        }
    }





}
