public class Main {

    public static void main(String[] args){
        int a = 10;
        int b = 30;
        int c = 40;

        var resul = suma(a,b,c);
        System.out.println(resul);


        auto N_auto = new auto();

        N_auto.Agregar_Puertas();
        System.out.println(N_auto.puertas);




   }


    public static int suma(int a , int b, int c){
        return a + b + c;


    }

class auto {

        public int puertas = 1;

        public void Agregar_Puertas (){
            this.puertas++;

        }



}



}