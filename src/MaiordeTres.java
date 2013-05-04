
public class MaiordeTres {
    public static void main(String[] args) {
        
        int a=3, b=5, c=2, maior=0, menor;
        
        if (a>b & a>c) {
            maior=a;
            menor=c;
        } else if (b>a && b>c)  {
            maior=b;
            menor=c;
        } else if (c>a & c>b){
            maior=c;
            menor=b;
        }
        
        System.out.println("Maior número = "+maior);
    }
}
