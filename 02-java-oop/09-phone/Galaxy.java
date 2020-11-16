public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Ring Ring Ring from Samsung";
    }
    @Override
    public String unlock() {
        return "Samsung unlocked!";
    }
    @Override
    public void displayInfo() {
        System.out.println("Phone Model is " + this.getVersion()); 
        System.out.println("Battery Percentage is " + getBatt());
        System.out.println("My carrier is " + getCarrier());
        System.out.println("Ringtone is " + getRingTone());            
    }
}