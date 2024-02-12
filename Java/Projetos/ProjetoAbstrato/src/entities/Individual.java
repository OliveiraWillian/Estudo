package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {}

    public Individual(String name, Double anuallncome, Double healthExpenditures) {
        super(name, anuallncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        Double aux = 0.0;
        if (super.getAnuallncome() < 20000.00){
            aux = (0.15 * getAnuallncome());
            if (healthExpenditures != 0) {
                aux = aux - (healthExpenditures * 0.50);
            }


            }else {
            aux = (0.25 * getAnuallncome());
            if (healthExpenditures != 0){
                aux = aux - (healthExpenditures * 0.50);
            }
        }



        return aux;
    }

}

