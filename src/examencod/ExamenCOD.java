// ramas

package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int Num = 11;
            	if (metodoMio(Num))
System.out.println("Es numero primo");
else
 System.out.println("NO es numero primo");           	 
          	 
for (int x=2;x<1000;x++) {
if (metodoMio(x))
System.out.print(x + " ");                         	 
}         	 
	}
public static boolean metodoMio(int variable){
int pt = 2;
boolean aux=true;
while ((aux) && (pt!=variable)){
if (variable % pt == 0)
aux = false;
pt++;
}
return aux;
  } 	 
    
}

/* Esto es una locura
 *
 */