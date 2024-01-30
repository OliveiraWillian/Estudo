package util;

public class CurrencyConverter {

    private static double impostoIOF(double impost){
        double iof = impost * 6 /100 + impost;
        return iof;
    }
    public static double ConvesaoDolares (double cotacaoDolar, double buyDolar) {
        double conversao = cotacaoDolar * buyDolar;
        double iofMaisDolar = impostoIOF(conversao);
        return iofMaisDolar;


    }

}
