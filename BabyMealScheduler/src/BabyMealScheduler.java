public class BabyMealScheduler {

    public static void main(String[] args) {
        // Initial quantities of porridge and milk in liters
        double porridgeQuantity = 2.0;
        double milkQuantity = 2.0;
        
        // Amount of porridge consumed per feeding in liters
        double porridgePerFeeding = 0.5 / 2; // half a cup is 0.25 liters
        
        // Amount of milk consumed per feeding in liters
        double milkPerFeeding = 0.5 / 2; // half a cup is 0.25 liters
        
        // Time intervals between feedings in minutes
        int porridgeInterval = 45; // 45 minutes after porridge
        int milkInterval = 30; // 30 minutes after milk
        
        // Variables to track time
        int totalTime = 0;
        
        // Feed the baby until all porridge and milk are finished
        while (porridgeQuantity > 0 || milkQuantity > 0) {
            if (porridgeQuantity > 0) {
                // Feed porridge if available
                porridgeQuantity -= porridgePerFeeding;
                totalTime += porridgeInterval;
            }
            if (milkQuantity > 0) {
                // Feed milk if available
                milkQuantity -= milkPerFeeding;
                totalTime += milkInterval;
            }
        }
        
        // Output the total time taken to finish all the food
        System.out.println("Total time to finish both porridge and milk: " + totalTime + " minutes");
    }
}
