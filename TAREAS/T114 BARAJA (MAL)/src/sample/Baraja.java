package sample;

public class Baraja {
    private Carta[] mazo;
    private static String[] nombres={"AS","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","SOTA","CABALLO","REY"};
    //static int longitud=mazo.length;

    public static void main(String[] args){

    }

    public Baraja(int n){
        this.mazo=new Carta[n];


    }

    private void crearPalo(){
        assert mazo!=null: "Error: La array Carta no puede ser nula";
        assert mazo.length==40: "Error. La baraja debe tener 40 cartas";
        //assert palo!=null: "Error: El palo de la carta no puede ser nulo.";

        for (int i=0; i<mazo.length; i++){
            if (i<10)
                mazo[i].palo=Palo.OROS;
            if (i<20)
                mazo[i].palo=Palo.COPAS;
            if (i<30)
                mazo[i].palo=Palo.ESPADAS;
            if (i<40)
                mazo[i].palo=Palo.BASTOS;

        }

    }

    private void asignarNombre(){
        assert nombres !=null : "Error: El array nombres no puede ser nulo";
        assert  nombres.length==10: "Error: Deben de existir 10 nombres, uno para cada carta";
        assert mazo!=null: "Error: La array Carta no puede ser nula";
        assert mazo.length==40: "Error. La baraja debe tener 40 cartas";

        for (int i=0; i<mazo.length; i++){
            if (i==0||i==10||i==20||i==30)
                mazo[i].nombre=nombres[0];
            if (i==1||i==11||i==21||i==31)
                mazo[i].nombre=nombres[1];
            if (i==2||i==12||i==22||i==32)
                mazo[i].nombre=nombres[2];
            if (i==3||i==13||i==23||i==33)
                mazo[i].nombre=nombres[3];
            if (i==4||i==14||i==24||i==34)
                mazo[i].nombre=nombres[4];
            if (i==5||i==15||i==25||i==35)
                mazo[i].nombre=nombres[5];
            if (i==6||i==16||i==26||i==36)
                mazo[i].nombre=nombres[6];
            if (i==7||i==17||i==27||i==37)
                mazo[i].nombre=nombres[7];
            if (i==8||i==18||i==28||i==38)
                mazo[i].nombre=nombres[8];
            if (i==9||i==19||i==20||i==39)
                mazo[i].nombre=nombres[9];
        }
    }

    private void asignarNumero(){
        assert mazo!=null: "Error: La array Carta no puede ser nula";
        assert mazo.length==40: "Error. La baraja debe tener 40 cartas";

        for (int i=0; i<mazo.length; i++){
            if (i==0||i==10||i==20||i==30)
                mazo[i].numero=1;
            if (i==1||i==11||i==21||i==31)
                mazo[i].numero=2;
            if (i==2||i==12||i==22||i==32)
                mazo[i].numero=3;
            if (i==3||i==13||i==23||i==33)
                mazo[i].numero=4;
            if (i==4||i==14||i==24||i==34)
                mazo[i].numero=5;
            if (i==5||i==15||i==25||i==35)
                mazo[i].numero=6;
            if (i==6||i==16||i==26||i==36)
                mazo[i].numero=7;
            if (i==7||i==17||i==27||i==37)
                mazo[i].numero=10;
            if (i==8||i==18||i==28||i==38)
                mazo[i].numero=11;
            if (i==9||i==19||i==20||i==39)
                mazo[i].numero=12;
        }
    }

    public String toString(){
        return "Baraja de "+mazo.length+" cartas. Con nombres "+nombres;
    }
}
