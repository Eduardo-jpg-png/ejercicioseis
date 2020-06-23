package ejercicioseis;
public class Ejercicioseis {
     public static int matriz[] = new int[20];
    public static void main(String[] args) {
        //SeparaParesImpares();
        
        for (int i=0; i<matriz.length; i++) {
            matriz[i] = (int) Math.floor(Math.random()*i*5); 
        }
        System.out.println("Array Inicial generado con números aleatorios : ");
        for (int i=0; i<20; i++) {
            System.out.print(matriz[i]+" ");
        }
        System.out.println();
        separaParesImpares();
    }
    public static void separaParesImpares() {
        System.out.println("Los numeros pares son : ");
        for (int i=0; i<20; i++) {
            if (matriz[i]%2==0) {
                System.out.print(matriz[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("Los numeros impares son : ");
        for (int i=0; i<20; i++) {
            if (matriz[i]%2!=0) {
                System.out.print(matriz[i]+" ");
            }
        }
    }
    
}
    


        
        
           
                
            
        
        
    
    

