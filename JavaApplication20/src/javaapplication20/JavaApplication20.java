
package javaapplication20;

import java.util.Scanner;


public class JavaApplication20 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        *int n1,n2, s;
        *System.out.println("ingrese un numeros: ");
        *n1 = entrada.nextInt();
        *System.out.println("ingrese otro numeros: ");
        *n2 = entrada.nextInt();
        
        *s = n1 + n2;
        
        *System.out.println("La suma es: "+s);
        
        
        int x,y;
        double division; 
        x = entrada.nextInt();
        y = entrada.nextInt();
        
        division = (double)x / (double)y;
        
        System.out.println("La respuesta es: "+division);
       
        
        String cadena; 
        System.out.println("digite una palabra: ");
        cadena = entrada.nextLine();
        
        char letra; 
        System.out.println("digite una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("Mi letra es: "+letra);
        
        
        int n, n2, m;
        System.out.println("Introduzca el primer numero: ");
        n = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        n2 = entrada.nextInt();
        
        m = n * n2;
        System.out.println("El resultado es: "+m);  
        
        
        int n;
        int c;
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();
        
        c = n * n; 
        
        System.out.println("El cuadrado de "+n+" es: "+c);
        
        
        int n;
        double c; 
        
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();
        c = Math.pow(n, 2);
        
        System.out.println("el cuadrado de "+n+" es: "+c);
        
        
        int n;
        double raiz;
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();
        
        raiz = Math.sqrt(n);
        System.out.println("La raiz cuadrada es: "+raiz);
        
        
        int m;
        double km; 
        double cm;
        System.out.println("Ingrese un valor en (metros): ");
        m = entrada.nextInt();
        
        km = m * 1/1000;
        cm = m * 100;
        
        System.out.println("en kilometros: "+km+" Kilometros");
        System.out.println("en centimetros: "+cm+" Centimetros");
        
        
        double pi; 
        double pf;
        double i; 
        
        System.out.println("Ingrese el precio inicial(dolares): ");
        pi = entrada.nextDouble();
        
        i = pi * 0.30;
        pf = i + pi;
        
        System.out.println("El precio de venta es: "+pf+" $.");
        
        
        int n, u;
        System.out.println("Ingrse un numero: ");
        n = entrada.nextInt();
        
        u = n % 10; 
        System.out.println("El ultimo digito es: "+u);
               
        int n,p; 
        
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();
        
        p = n / 10; 
        System.out.println("El primer numero es: "+p);
        
        
         int a, b, c;
         int n;
         int x,y,z;
         System.out.println("ingrse el primer digito: ");
         a = entrada.nextInt();
         System.out.println("ingrse el segundo digito: ");
         b = entrada.nextInt();
         System.out.println("ingrse el tercer digito: ");
         c = entrada.nextInt();
         
         x = a *10*10;
         y = b *10;
         z = c *1;
         n = x + y + z;
         
         System.out.println("el numero es: "+n);
         
        
        int n,dp,dm,du;
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        
        du = n % 10; 
        n = n / 10;
        dm = n % 10;
        n = n / 10; 
        dp = n % 10; 
        
        System.out.println("primer digito: "+dp);
        System.out.println("segundo digito: "+dm);
        System.out.println("tercer digito: "+du);
        
        double A, r; 
        System.out.println("Ingrese el valor del radio: ");
        r = entrada.nextDouble();
        
        A = Math.PI * Math.pow(r, 2);
        System.out.println("El area del circulo es: "+A);
        
        
        int n; //numero 
        System.out.println("Ingrse un numero: ");
        n = entrada.nextInt();
        
        if(n > 0){
            System.out.println("El numero es positivo");
        }else {
            System.out.println("el numero es negatico");
        }
        
        int n; 
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        if(n % 2 == 0){
            System.out.println("es par");
            
        }else{
            System.out.println("es impar");
        }
        
         
        int n,m; 
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        
        System.out.println("ingrese un numero: ");
        m = entrada.nextInt();
        
        if(n % m == 0){
            System.out.println("es multiplo");
        }else{
            System.out.println("no es multiplo");
        }
          
        
        int n1,n2;
        System.out.println("ingrese el primer numero: ");
        n1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero: ");
        n2 = entrada.nextInt();
        
        if(n1 == n2){
            System.out.println("son iguales");
        }else{
            if(n1 > n2){
                System.out.println(n1+" es mayor que "+n2);
            }else{
                System.out.println(n2+" es mayor que "+n1);
            }
        }
        
        
        int a,b,c;
        System.out.println("ingrese el valor de a: ");
        a = entrada.nextInt();
        System.out.println("ingrese el valor de b: ");
        b = entrada.nextInt();
        System.out.println("ingrese el valor de c: ");
        c = entrada.nextInt();
        
        if(a > b && b > c){
            System.out.println(a+", "+b+", "+c);
        }else{
            if(a > c && c > b){
                System.out.println(a+", "+c+", "+b);
            }else{
                if(b > a && a > c){
                    System.out.println(b+", "+a+", "+c);
                }else{
                    if(b > c && c > a){
                        System.out.println(b+", "+c+", "+a);
                    }else{
                        if(c > a && a > b){
                            System.out.println(c+", "+a+", "+b);
                        }else{
                            if(c > b && b > a){
                                System.out.println(c+", "+b+", "+a);
                            }
                        }
                    }
                }
            }  
        }
        
        
        System.out.println("Ingrese un numero:");
        int semana = entrada.nextInt();
        String dia;
        
        switch(semana){
            case 1:
                dia = "Domingo";
            break;
            case 2:
                dia = "Lunes";
            break;
            case 3:
                dia = "Martes";
            break;
            case 4:
                dia = "Miercoles";
            break;
            case 5:
                dia = "Jueves";
            break;
            case 6:
                dia = "Viernes";
            break;
            case 7:
                dia = "Sabado";
            break;
            default:
                dia = "no existe ese dia";      
        }
        System.out.println("el dia "+semana+", es: "+dia);
        
        
        System.out.println("CALCULADORA");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        
        int menu = entrada.nextInt();
        double n1,n2,s,r,m,d;
        
        switch(menu){
            case 1:
                System.out.println("suma");
                System.out.println("ingrese un numero: ");
                n1 = entrada.nextDouble();
                System.out.println("ingrese un numero: ");
                n2 = entrada.nextDouble();
                s = n1 + n2;
                System.out.println("Respuesta: "+s);
            break;
            case 2:
                System.out.println("resta");
                System.out.println("ingrese un numero: ");
                n1 = entrada.nextDouble();
                System.out.println("ingrese un numero: ");
                n2 = entrada.nextDouble();
                r = n1 - n2;
                System.out.println("Respuesta: "+r);
            break;
            case 3:
                System.out.println("multiplicacion");
                System.out.println("ingrese un numero: ");
                n1 = entrada.nextDouble();
                System.out.println("ingrese un numero: ");
                n2 = entrada.nextDouble();
                m = n1 * n2;
                System.out.println("Respuesta: "+m);
            break;
            case 4:
                System.out.println("division");
                System.out.println("ingrese un numero: ");
                n1 = entrada.nextDouble();
                System.out.println("ingrese un numero: ");
                n2 = entrada.nextDouble();
                d = n1 / n2;
                System.out.println("Respuesta: "+d);
            break;
                    
        }
        
        
        int contador = 0;
        int limite = 5;
        
        while(contador < limite){
            System.out.println("numero = "+contador);
            contador++;
        }
        
        
        int n; 
        int c = 0;
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        while(c < n){
            System.out.println(c+".");
            c++;
        }
        
        
        int n,p;
        int c = 1;
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        
        while(c <= n){
            
            p = 2*c - 2;
            System.out.println(p+".");
            c++;
        }
        
        
        int n,d; 
        int c = 0;
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        
        while(n > 0){
            d = n % 10;
            n = n / 10;
            c++;
               
        }
        System.out.println("numero de digitos es: "+c);
          
        
        int n, d; 
        int s = 0;
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();
        
        while(n > 0){
            d = n % 10;
            n = n / 10;
            s = s + d;   
        } 
        System.out.println("La suma de los digitos es: "+s);
        
        
        int n; 
        int c = 0;
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();
        do{
            System.out.println(c+".");
            c++;
        }while(c < n);
        
        
        int n;
        int c = 1;
        int p;
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        
        do{
            p = 2 * c - 2;
            System.out.println(p+".");
            c++;
        }while(c <= n);
        
        int n; 
        int s = 0;
        int d;
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        do{
            d = n % 10;
            s = s + d;
            n = n / 10;    
        }while(n > 0);
        System.out.println("La suma de los diitos es: "+s);
        
        
        int limite = 10;
        int c = 0;
        
        for(c = 0; c < limite; c++){
            System.out.println("numero = "+c);
        }
        
        
        int limite = 0;
        int c = 10;
        
        for(c = 10; c >= limite; c--){
            System.out.println("numero = "+c);
        }
        
        
        int n;
        int c = 1;
        int p; 
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        for(c = 1;c <= n; c++){
            p = 2 * c - 2;
            System.out.println("numero = "+p);
           
        }
        
        
        int n; 
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        for( int c = 0; c <= n; c = c + 5){
            System.out.println(c);
        }
        
        
        int n; 
        int s = 0;
        for(int c = 1;c <= 5;c++){
            System.out.println("ingrese un numero: ");
            n = entrada.nextInt();
            s = s + n;
        }
        System.out.println("suma total es: "+s);
        
        
        int n; 
        do{
            System.out.println("ingrese un numero(0 a 10): ");
            n = entrada.nextInt();
        }while(!(0 <= n && n <= 10));
        for(int c = 1;c <= 10; c++){
            System.out.println(n+" x "+c+" = "+n * c);
        }
        
        int n; 
        System.out.println("ingrese un numero: ");
        n = entrada.nextInt();
        int c = 1; 
        int i = 0;
        while(c <= n){
            i = 2 * c - 1;
            System.out.println(i);
            c++;
        }
        
        int n; 
        n = entrada.nextInt();
        int c1 = 1;
        int c2 = 4;
        while(c1 <= n){
            System.out.println(c2);
            c1++;
            c2+=3;
        }
        
        int n;
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();
        int c = 0;
        int w = 7; // interruptor
        while(c <= n){
            System.out.println(w);
            if(w > 5){
                w--;
            }else{
                w = 7;
            }
            c++;
        }
        
        int n; 
        n = entrada.nextInt();
        int c1 = 0;
        int c2 = 0;
        int uno = 2;
        int t = 2; 
        while(c1 <= n){
            System.out.println(t);
            if(c2 < uno){
                t = 1;
                c2++;
            }else{
                uno++;
                t = uno;
                c2 = 0; 
            }
            c1++;
        }
        
        int n,l; 
        System.out.println("numero limite: ");
        l = entrada.nextInt();
        
        for(int c = 0;c <= l;c++){
            n = c + 1;
            while (n <= l) {  
                System.out.println(n - c);
                n++;
            }
            System.out.println(" ");
        }
        
        int n;
        n = entrada.nextInt();
        for(int c1 = 1; c1 <= n; c1++){
            System.out.println(" ");
            for(int c2 = 1; c1 * 2 >= c2;c2++){
                if((c2 % 2 )!= 0){
                    System.out.println(c2);
                }
            }
        }
        
        
        int [] numero = new int[5];
        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;
        numero[3] = 4;
        numero[4] = 5;
        
        for(int c = 0; c < 5;c++){
            System.out.println(numero[c]);
        }
        
        
        int [] array = new int[5];
        for(int c = 0;c < 5;c++){
            System.out.println("ingrese un numero: ");
            array [c] = entrada.nextInt();
        }
        System.out.println("los numero son: ");
        for(int c = 0;c < 5;c++){
            System.out.println(array[c]);
        }
        
        
        int [] numero = new int [6];
        System.out.println("ingrese 6 numeros: ");
        for(int c = 0;c < 6;c++){
            numero[c] = entrada.nextInt();
        }
        for(int c = 0;c < 6;c++){
            if(numero[c] % 2 == 0){
                System.out.println(numero[c]+" = par");
            }else{
                System.out.println(numero[c]+" = impar");
            }
        } 
        
        
        int [] arreglo = new int [8];
        for(int c = 0; c < 8; c++){
            arreglo[c] = entrada.nextInt();
        }
        System.out.println("invertido");
        for(int c = 7;c >= 0; c--){
            System.out.println(arreglo[c]);
        }
        
        
        int [] numero = new int [8];
        int c;
        System.out.println("ingrese 8 numeros:");
        for(c = 0;c < 8;c++){
            numero[c] = entrada.nextInt();
        }
        System.out.println(" Array original");
        for(c = 0;c < 8;c++){
            System.out.printf(" | "+c);
        }
        System.out.println(" | ");
        for(c = 0;c < 11;c++){
            System.out.print(" - ");
        }
        System.out.println(" - ");
        for(c = 0;c < 8;c++){
            System.out.printf(" | "+numero[c]);
        }
        System.out.println(" | ");
        
        int aux = numero[7];
        for(c = 7;c > 0;c--){
            numero[c] = numero[c-1];
        }
        numero[0] = aux;
        System.out.println("Array recorrido");
        for(c = 0;c < 8;c++){
            System.out.printf(" | "+c);
        }
        System.out.println(" | ");
        for(c = 0;c < 11;c++){
            System.out.print(" - ");
        }
        System.out.println(" - ");
        for(c = 0;c < 8;c++){
            System.out.printf(" | "+numero[c]);
        }
        System.out.println(" | ");
        
        int tabla [][];
        tabla = new int[5][4];
        tabla[0][0] = 23;
        tabla[0][1] = 45;
        tabla[0][2] = 78;
        tabla[0][3] = 20;
        tabla[1][0] = 10;
        tabla[1][1] = 85;
        tabla[1][2] = 33;
        tabla[1][3] = 69;
        tabla[2][0] = 16;
        tabla[2][1] = 67;
        tabla[2][2] = 12;
        tabla[2][3] = 87;
        tabla[3][0] = 77;
        tabla[3][1] = 96;
        tabla[3][2] = 45;
        tabla[3][3] = 25;
        tabla[4][0] = 55;
        tabla[4][1] = 11;
        tabla[4][2] = 16;
        tabla[4][3] = 82;
        
        System.out.println(" "+tabla[3][1]);
        
        int[][] matriz = new int[3][3];
        matriz[0][0] = 10;
        matriz[0][1] = 10;
        matriz[0][2] = 10;
        matriz[1][0] = 10;
        matriz[1][1] = 10;
        matriz[1][2] = 10;
        matriz[2][0] = 10;
        matriz[2][1] = 10;
        matriz[2][2] = 10;
        int fil = 3;
        int col = 3;
        int c1,c2;
        for(c1 = 0;c1 < fil;c1++){
            for(c2 = 0;c2 < col;c2++){
                System.out.print(" "+matriz[c1][c2]);
            }
            System.out.println(" ");
        }
        
        int[][] matrizversion2 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int c1 = 0;c1 < 3;c1++){
            for(int c2 = 0;c2 < 3;c2++){
                System.out.print(" "+matrizversion2[c1][c2]);
            }
            System.out.println(" ");
        }
        */
        int fil = 4;
        int col = 5;
                
        char[][] alfabeto = new char[fil][col];
        char letra = 'A';
        
        for(int c1 = 0;c1 < fil;c1++){
            for(int c2 = 0; c2 < col;c2++){
                alfabeto[c1][c2] = letra;
                letra++;
            }
        }
        //mostrar elementos de la matriz
        for(int c1 = 0;c1 < fil;c1++){
            for(int c2 = 0;c2 < col;c2++){
                System.out.print(" "+alfabeto[c1][c2]);
            }
            System.out.println(" ");
        }
        
    }
    
}
