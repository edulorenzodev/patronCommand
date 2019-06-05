package javaapplication2;

/**
 *
 * @author edu
 */
public class PressSwitch {

    /**
     * The test class or client
     */
    public static void main(String[] args) {
        // Check number of arguments
        if (args.length != 1) {
            System.err.println("Argument \\\"ON\\\" or \\\"OFF\\\" is required.");
            System.exit(-1);            
        }
        
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        
        Switch mySwitch = new Switch(switchUp, switchDown);
        
        switch (args[1]) {
            case "ON":
                mySwitch.flipUp();
                break;
            case "OFF":
                mySwitch.flipDown();
                break;
            default:
                System.err.println("Argument \\\"ON\\\" or \\\"OFF\\\" is required.");
                System.exit(-1);
        }
        
    }
    
}
