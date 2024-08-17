package app;

public class Main {

    public static final double CONV_K = 0.62137;

    public static void main(String[] args) {
        System.out.println("App for distance converting.");
        System.out.println("Version 1.1.");

        double miles = 120;
        double kms = convMilesToKms(miles);

        System.out.println(miles + " miles are " + kms + " kms.");
    }

    private static double convMilesToKms(double miles) {
        return miles / CONV_K;
    }
}
