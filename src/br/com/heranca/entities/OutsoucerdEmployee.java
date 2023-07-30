package br.com.heranca.entities;

public class OutsoucerdEmployee  extends  Employee{
    private Double additionalCharge;

    public OutsoucerdEmployee(){

    }
    public OutsoucerdEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public  double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}

