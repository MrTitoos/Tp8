/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

/**
 *
 * @author Matias
 */
public class Matriz {

    public Matriz() {
    }
    
    public void armar(){
        int i, j, aux = 0, aux1 = 0;
        int matriz [][] = new int[4][];
        
        //   Creo la estructura de la matriz
        matriz[0] = new int [4];
        matriz[1] = new int [3];
        matriz[2] = new int [5];
        matriz[3] = new int [2];
        
        //   Relleno la matriz 
        
        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz[i].length; j++){
                aux += 3;
                matriz[i][j] = aux;
            }
        }
        
        System.out.print("Fila 1 -> ");
        for(j=0; j<matriz[0].length; j++) {
            int c = matriz[0][j];
            if(c%2==0){
                System.out.print(c+" ");
            }
        }
        System.out.println(" ");
        
        System.out.print("Fila 2 -> ");
        for(j=0; j<matriz[1].length; j++) {
            int c = matriz[1][j];
            if (c%2==0){
                System.out.print(c+" ");
            }
        }
        System.out.println(" ");
        
        System.out.print("Fila 3 -> ");
        for(j=0; j<matriz[2].length; j++) {
            int c = matriz[2][j];
            if (c%2==0){
                System.out.print(c+" ");
            }
        }
        System.out.println(" ");
        
        System.out.print("Fila 4 -> ");
        for(j=0; j<matriz[3].length; j++) {
            int c = matriz[3][j];
            if (c%2==0){
                System.out.print(c+" ");
            }
        }
        System.out.println(" ");
    }
    
}
