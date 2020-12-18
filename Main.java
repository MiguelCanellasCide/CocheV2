package Actividades;

public class Main {

    public static void main(String[] args) {
        CocheSegundaParte_Miguel_Cañellas c1= new CocheSegundaParte_Miguel_Cañellas("Ferrari","G1",TipusCanvi.CanviManual);
        try {
            System.out.println(c1.getRevolucions());
            System.out.println(c1.comprovaMotor());
            c1.arrancarMotor();
            System.out.println(c1.comprovaMotor());
            System.out.println(c1.getRevolucions());
            c1.aturarMotor();
            System.out.println(c1.comprovaMotor());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

