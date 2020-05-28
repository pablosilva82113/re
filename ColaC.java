
public class ColaC<T> {
private T Esquina [];//vector para reprecengtar la cola
private int Frente; 
private int Maximo;//Variavle para la capacidad de la cola 
private int n; 


    public ColaC(int N){
        Maximo=N;
      Esquina = (T[]) new Object [Maximo];
         Frente=0;
         n=0;
     
    }
     public boolean colaLlena(){
        if(Frente==Esquina.length){
            return true;
        }else{
            return false;
        }
    }
  public void encolar(T Num)throws ExcepcionColaLLena {
      if(colaVacia()){
          
      }
      if(colaLlena()){
            throw new ExcepcionColaLLena();
        }
      int ubicacion=(Frente+n)%Maximo;
       Esquina [ubicacion] = Num; 
       n++;
  }
     public boolean colaVacia(){
        if(n==Maximo){
            return true;
        }else if(n==0){
             return true;
        }else{
            return false;    
           }
    }
      public T sacar()throws ExcepcionColaVacia{
        if(colaVacia()){
            throw new ExcepcionColaVacia();
        }
        T aux=Esquina[Frente];
        Frente=(Frente+1)%Maximo;
        n--;
        return aux;
      }
      public double capacidad(){
    	  for (int i = 0; i < Esquina.length; i++) {
			System.out.println();
		}
    	  return Esquina.length;
      }
     public double sum(ColaC<Double>cd) {
    	 double acum=0;
    	 for (int i = 0; i < cd.capacidad(); i++) {
			try {
				acum=(Double)acum+cd.sacar();
			} catch (ExcepcionColaVacia e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
    	 return acum;
     }
     public double resta(ColaC<Double>d) {
    	double acum=0;
    	try {
    		acum=d.sacar();
    	for (int i = 0; i < d.capacidad(); i++) {
			acum=acum-d.sacar();
		}
    	}catch(ExcepcionColaVacia e) {
    		System.out.println(e.getMessage());
    	}
    	return acum;
     }
     public double mult(ColaC<Double>d) {
      	double acum=0;
      	try {
      		acum=d.sacar();
      	for (int i = 0; i < d.capacidad(); i++) {
  			acum=acum*d.sacar();
  		}
      	}catch(ExcepcionColaVacia e) {
      		System.out.println(e.getMessage());
      	}
      	return acum;
       }
     public double div(ColaC<Double>d) {
     	double acum=0;
     	try {
     		acum=d.sacar();
     	for (int i = 0; i < d.capacidad(); i++) {
 			acum=acum/d.sacar();
 			System.out.print(acum);
 		}
     	}catch(ExcepcionColaVacia e) {
     		System.out.println(e.getMessage());
     	}
     	return acum;
      }
}
