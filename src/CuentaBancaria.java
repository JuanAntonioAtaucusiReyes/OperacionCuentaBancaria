import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        String nombre = "Tonny Stark";
        String tipoDeCuenta = " corriente";
        double saldo = 1599.99;
        int option =0;

        System.out.println("***************Banco Nacional del Soltero*************************");
        System.out.println("\n Nombre del cliente : "+ nombre);
        System.out.println("\n tipo de cuenta es : "+ tipoDeCuenta);
        System.out.println("\n su saldo disponble es :" +saldo + "$");
        System.out.println("******************************************************************");

        String menu = """
                ***Escribe el numero de la opcion deseada**
                1._ Consultar.
                2._ Retirar.
                3._ Depositaar.
                9._ Salir.
                """;
        Scanner teclado = new Scanner(System.in);
        while (option != 9){
            System.out.println(menu);
            option = teclado.nextInt();

            switch (option){
                case 1:
                    System.out.println("El saldo actualizado es :" + saldo + "$");
                    break;
                case  2:
                    System.out.println("Cual es el valor que desea retirar ?:");
                    double valrRetirar = teclado.nextDouble();
                    if (saldo > valrRetirar){
                        //double ValorActual =saldo - valrRetirar;
                        saldo = saldo -valrRetirar;
                        System.out.println("Su Monto del retiro es         :"+ valrRetirar);
                        System.out.println("Su saldo despues del retiro es :" + saldo);

                    } else {
                        System.out.println("Saldo insuficiente : ERROR");
                    }
                    break;
                case 3:
                    System.out.println("Cual el valor que desea depositar :");
                    double valorDepositar = teclado.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("Su saldo despues del deposito es :" + saldo);
                    break;
                case 9:
                    String mensaje = """ 
                            Gracias por Utilizar el servicio de :
                            BANCO PARA SOLTEROS
                            *_*
                            """;
                    System.out.println(mensaje);
                    break;
                default:
                    System.out.println("opcion no valida");

            }
        }
    }
}
