// ramas

package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int iN = 22;
            	if (metodoMio(iN))
System.out.println("Es numero primo");
else
 System.out.println("NO es numero primo");           	 
          	 
for (int x=2;x<1000;x++) {
if (metodoMio(x))
System.out.print(x + " ");                         	 
}         	 
	}
    //para variable =16 y j=2, la respuesta es false
    //para variable =22 y j=21,la respuesta es true
public static boolean metodoMio(int variable){
int j = 21;
boolean aux=true;
while ((aux) && (j!=variable)){
if (variable % j == 0)
aux = false;
j++;
}
return aux;
  } 	 
    
}

/* Esto es una locura
 *
 */