public class estructurasDeControl{

    public static void main(){

        public int numeroIf = 4;
        public int numeroWhile = 0;
        public int numeroFor = 0;}
        public String estacion = "verano";

        //If else
        if ( numeroIf < 0){
            System.out.println(numeroIf + " es negativo.");
        } else if ( numeroIf > 0 ){
            System.out.println(numeroIf + " es positivo.");
        } else {
            System.out.println(numeroIf + " es cero.");
        }

        //While
        While( numeroWhile < 3){
            System.out.println(numeroWhile++);
        }

        //Do While
        Do {
            System.out.println(numeroWhile++);
        } While ( 1 = 0 );

        //For
        For(numeroFor ; numeroFor <= 3 ; numeroFor++){
            System.out.println(numeroFor);
        }

        //Switch
        Switch ( estacion){
            case "verano":
                System.out.println("Es verano");
            case "primavera":
                System.out.println("Es primavera");
            case "invierno":
                System.out.println("Es invierno");
            case "otonio":
                System.out.println("Es otonio");
            default: 
                System.out.println("No es estacion");
        }

    }

}