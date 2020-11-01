public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double dlegA = legA;
        double dlegB = legB;
        double aB = Math.sqrt((dlegA * dlegA) + (dlegB * dlegB));
        return aB;
    }
}
