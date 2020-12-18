package Actividades;

public class CocheSegundaParte_Miguel_Cañellas extends Coche_Miguel_Cañellas {

        //Atributes

        private enum Marchas {
            R, N, F, M1, M2, M3, M4, M5, M6;
        }

        private Marchas marcha = Marchas.N;

        //Constructor

    public CocheSegundaParte_Miguel_Cañellas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);}


        //Getters/Setters


    public Marchas getMarcha() {
        return marcha;
    }

    //Altres metodes

    //Aquest metode ens permetrá pujar o baixa la marxa depenent del tipus de canvi de marxa que el coche tengui.

    public void canviarMarcha(char canviar) throws Exception {

        if ( canviar == '+' || canviar == '-') {

            if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)) {

                canviarAutomatic(canviar);

            } else if (tipuscanvi.equals(TipusCanvi.CanviManual)) {

                canviarManual(canviar);

            }

        } else {

            throw new Exception("Porfavor, ponga o un + o un -.");

        }
    }

    //  Metode canviar marxa automatica.

    private void canviarAutomatic (char canviar) {

        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {

            switch (canviar) {

                case '+' -> {

                    if (marcha.equals(Marchas.F)) {

                        System.out.println("No se pueden subir más marchas.");

                    } else if (marcha.equals(Marchas.R)) {

                        this.marcha = Marchas.N;

                    } else {

                        this.marcha = Marchas.F;

                    }

                }

                case '-' -> {

                    if (marcha.equals(Marchas.R)){
                        System.out.println("No se pueden bajar más marchas.");

                    }else if (marcha.equals(Marchas.F)){

                        this.marcha=Marchas.N;

                    }else {

                        this.marcha=Marchas.R;
                    }

                }

            }
        } else {

            System.out.println("Debes arrancar el coche antes.");

        }

        //  Metode canviar marxa manual.

    }

    private void canviarManual (char canviar) throws Exception {

        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {

            switch (canviar) {

                case '+' -> {

                    if (this.marcha.equals(Marchas.R)) {

                        this.marcha = Marchas.N;

                    } else if (this.marcha.equals(Marchas.N)) {

                        this.marcha = Marchas.M1;

                    } else if (marcha.equals(Marchas.M1)){

                        this.marcha=Marchas.M2;

                    }else if (marcha.equals(Marchas.M2)){

                        this.marcha=Marchas.M3;

                    }else if (marcha.equals(Marchas.M3)){

                        this.marcha=Marchas.M4;

                    }else if (marcha.equals(Marchas.M4)){

                        this.marcha=Marchas.M5;

                    }else if(marcha.equals(Marchas.M5)){

                        this.marcha=Marchas.M6;

                    }else if (marcha.equals(Marchas.M6)){

                        System.out.println("No se pueden subir más marchas.");

                    }

                }

                case '-' -> {

                    if (marcha.equals(Marchas.M6)){

                        this.marcha=Marchas.M5;

                    }else if (marcha.equals(Marchas.M5)){

                        this.marcha=Marchas.M4;

                    }else if (marcha.equals(Marchas.M4)){

                        this.marcha=Marchas.M3;

                    }else if (marcha.equals(Marchas.M3)){

                        this.marcha=Marchas.M2;

                    }else if (marcha.equals(Marchas.M2)){

                        this.marcha=Marchas.M1;

                    }else if (marcha.equals(Marchas.M1)){

                        this.marcha=Marchas.N;

                    }else if (marcha.equals(Marchas.N)){

                        this.marcha=Marchas.R;

                    }else if (this.marcha.equals(Marchas.R)){

                        System.out.println("No se pueden bajar más marchas.");
                    }
                }
            }

        } else {

            System.out.println("Debes arrancar el coche antes.");
        }

    }

}







