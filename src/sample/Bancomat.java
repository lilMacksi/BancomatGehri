package bancomat;

public class Bancomat {


    public void withdrawMoney(Integer amount) {
        int[] noteValues= {1000,200,100,50,20,10};
            for(int i=0;i<noteValues.length && amount!=0;i++)
            {
                if(amount>=noteValues[i])
                    System.out.println(noteValues[i]+"'s"+" :"+amount/noteValues[i]);
                    amount=amount%noteValues[i];
            }
        // Take money from acount
    }

    private Double getBalance() {
        return 0.0;
    }

    private void changePin(String pin) {

    }

    private void cardReadInCheck() { }

}
