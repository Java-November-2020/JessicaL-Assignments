public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return "Zing Zing Zing from iPhone";
    }
    @Override
    public String unlock() {
        return "iPhone unlocked!";
    }
    @Override
    public void displayInfo() {
        System.out.println("Phone Model is " + this.getVersion()); 
        System.out.println("Battery Percentage is " + getBatt());
        System.out.println("My carrier is " + getCarrier());
        System.out.println("Ringtone is " + getRingTone()); 
    }    
}
