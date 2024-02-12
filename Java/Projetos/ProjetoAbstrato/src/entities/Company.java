package entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;
    public Company() {}
    public Company(String name, Double anuallncome, Integer numberOfEmployees) {
        super(name, anuallncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        Double aux = 0.0;
        if(numberOfEmployees < 10){
            aux = 0.16 * getAnuallncome();
                }else {
            aux = 0.14 * getAnuallncome();
        }
        return aux ;
    }
}
