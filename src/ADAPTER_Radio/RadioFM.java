//package ADAPTER_Radio;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class RadioFM implements AnalogSignal {
//    private double[] _analogData;
//    Random rand = new Random();
//
//    public double[] getRand() {
//        double[] tab = rand.doubles(16, 0.0, 2.0).toArray();
//        return tab;
//    }
//
//    public double[] zeroAndOne() {
////        for (int i = 0; i <getRand().length ; i++) {
//        //TODO
//    }
//
//}
//
//    @Override
//    public double[] getAnalog() {
//        return getRand();
//    }
//
//    @Override
//    public void setAnalog(double[] analogData) {
//        _analogData = analogData;
//    }
//
//    @Override
//    public void printAnalog() {
//        System.out.printf("%s", Arrays.toString(getRand()));
//    }
//}
