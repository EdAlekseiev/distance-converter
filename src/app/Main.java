package app;

public class Main {

    public static final double CONV_K = 0.62137;

    public static void main(String[] args) {
        System.out.println("App for distance converting.");
        System.out.println("Version 1.2.");

        double miles = 120;
        double kms = convMilesToKms(miles);

        System.out.println(miles + " miles are " + kms + " kms.");

        double kilometers = 120;
        double mls = convKmsToMiles(120);

        System.out.println(kilometers + " kilometers are " + mls + " mls.");
    }

    private static double convMilesToKms(double miles) {
        return miles / CONV_K;
    }

    private static double convKmsToMiles(double kms) {
        return kms * CONV_K;
    }
}
