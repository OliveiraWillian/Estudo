package ultio;

public class CurrencyConverter {
public double dolar;
public double buyDolar;

public static double IOF = 0.06;
public static double converteDolar(double dolar, double buyDolar){
    double soma = dolar * buyDolar;
    double taxIof = soma * IOF;
    return soma + taxIof;
}
}
