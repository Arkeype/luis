/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discos;

import java.util.Scanner;

/**
 *
 * @author luis_miguel_vargas_garrido
 */
public class Discos {

  // N determina el tamaño del array//
  static int N = 100;
  
  
  
  //Crea el arrayList de discos//

    /**
     *
     */
  public void Listado(){
    Disco[] arrayAlbums = new Disco[N];
    boolean orden = false;
  }
  
  //Crea un nuevo disco//

    /**
     *
     */
  public static void nuevoDisco(){
      Disco[] arrayAlbums = new Disco[N];
    for(int i = 0; i < N; i++) {
      arrayAlbums[i] = new Disco();
    }
    
    
    
    //main class//
}

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
    Disco[] arrayAlbums = new Disco[N];

    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int i=0;
    
    
    //Lista las opciones//
do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(entrada.nextLine());
      
      switch (opcion) {
          
          //Comprueba que el listado sea LIBRE
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for(i = 0; i < N; i++) {
          if (!arrayAlbums[i].codigo.equals("LIBRE")) {
            System.out.println(arrayAlbums[i]);
          }
        }
        break;
        
        
        //Crea un nuevo disco
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        // Busca la primera posición libre del array
        primeraLibre = -1;
        do {
          primeraLibre++;
        } while (!((arrayAlbums[primeraLibre].codigo.equals("LIBRE"))));
        
        System.out.println("Por favor, introduzca los datos del disco.");  
        
        System.out.print("Código: ");
        codigoIntroducido = entrada.nextLine();
        arrayAlbums[primeraLibre].codigo= codigoIntroducido;
        
        System.out.print("Autor: ");
        autorIntroducido = entrada.nextLine();
        arrayAlbums[primeraLibre].autor = autorIntroducido;
        
        System.out.print("Título: ");
        tituloIntroducido = entrada.nextLine();
        arrayAlbums[primeraLibre].titulo = tituloIntroducido;
        
        System.out.print("Género: ");
        generoIntroducido = entrada.nextLine();
        arrayAlbums[primeraLibre].genero = generoIntroducido;
        
        System.out.print("Duración: ");
        duracionIntroducida = Integer.parseInt(entrada.nextLine());
        arrayAlbums[primeraLibre].duracion = duracionIntroducida;
        
        break;
        
      case 3:
          
          //Modifica el disco con los datos introducidos a mano
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = entrada.nextLine();
  
        i = -1;
        do {
          i++;
        } while (!((arrayAlbums[i].codigo.equals(codigoIntroducido))));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + arrayAlbums[i].codigo);
        System.out.print("Nuevo código: ");
        codigoIntroducido = entrada.nextLine();
        if (!codigoIntroducido.equals("")) {
         arrayAlbums[i].codigo=codigoIntroducido;
        }
        
        System.out.println("Autor: " + arrayAlbums[i].autor);
        System.out.print("Nuevo autor: ");
        autorIntroducido = entrada.nextLine();
        if (!autorIntroducido.equals("")) {
          arrayAlbums[i].autor = autorIntroducido;
        }
        
        System.out.println("Título: " + arrayAlbums[i].titulo);
        System.out.print("Nuevo título: ");
        tituloIntroducido = entrada.nextLine();
        if (!tituloIntroducido.equals("")) {
          arrayAlbums[i].titulo = tituloIntroducido;
        }
        
        System.out.println("Género: " + arrayAlbums[i].genero);
        System.out.print("Nuevo género: ");
        generoIntroducido = entrada.nextLine();
        if (!generoIntroducido.equals("")) {
          arrayAlbums[i].genero = generoIntroducido;
        }
        
        System.out.println("Duración: " + arrayAlbums[i].duracion);
        System.out.print("Duración: ");
        duracionIntroducidaString = entrada.nextLine();
        if (!duracionIntroducidaString.equals("")) {
          arrayAlbums[i].duracion = Integer.parseInt(duracionIntroducidaString);
        }
        
        break;
        
        
        //Borra el codigo del disco introducido
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = entrada.nextLine();
  
        i = -1;
        do {
          i++;
        } while (!((arrayAlbums[i].codigo.equals(codigoIntroducido))));
        arrayAlbums[i].codigo = "LIBRE";
        System.out.println("Album borrado.");
        
        break;
        
      default:
      
      } // switch
    } while (opcion != 5);
  }
}
