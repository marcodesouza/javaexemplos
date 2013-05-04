
public class RepeticaoWhile {
    public static void main(String[] args) {
        
        int x=0, soma=0;
        boolean VF=true;

        /*
         * while (x<=20) {            
            soma=soma+x;
            x++;
        }
        */
        
        while (VF) {            
            soma=soma+x;
            x++;
            
            if(x<=4) 
            { VF=false;}
        }
        
        System.out.println("Soma de 1 a 20="+ soma);
        
        x=0;
        while (x != 10) {            
            System.out.println(x);
            x++;
        }
        
    }
}
