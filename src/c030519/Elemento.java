package c030519;

public class Elemento implements Comparable{

	Integer clave;
	String valor;
	
	public Elemento(){}
	public Elemento(Integer clave, String valor){
		this.setClave(clave);
		this.setValor(valor);
	}
	
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public static Elemento[] seleccion(Elemento[] paraOrdenar) {
		for(int pos=0;pos < paraOrdenar.length; pos++){
			
			Integer menor = paraOrdenar[pos].getClave(); //se guarda la primera clave como la minima
			Integer posicionDelMenor = pos;
			
			for(int i = ++pos; i< paraOrdenar.length;i++){
				if (paraOrdenar[i].getClave() < menor){
					
					Elemento aux = paraOrdenar[i];
					paraOrdenar[i] = paraOrdenar[pos];
					paraOrdenar[pos] = aux;
					
				}
			}
			
		}
		
		return paraOrdenar;
}
	
	public static Elemento[] burbujear(Elemento[] paraOrdenar){
		
		for(int n = 0; n< paraOrdenar.length; n++){
			for(int m = 0; m < paraOrdenar.length;m++) {
				
				if(paraOrdenar[n].getClave() < paraOrdenar[m].getClave()){
					Elemento aux = paraOrdenar[m];
					paraOrdenar[m] = paraOrdenar[n];
					paraOrdenar[n] = aux;
				}
				
			}
			
		}
		//preguntarle al profe por que no funciona si le pongo al lenght un -1
		return paraOrdenar;
	}

	public static Elemento[] insercion(Elemento[] paraOrdenar){
	    Elemento aux;
	    for (int p = 1; p < paraOrdenar.length; p++){ // desde el segundo elemento hasta
	              aux = paraOrdenar[p]; // el final, guardamos el elemento y
	              int j = p - 1; // empezamos a comprobar con el anterior
	              while ((j >= 0) && (aux.getClave() < paraOrdenar[j].getClave())){ // mientras queden posiciones y el
	                                                                    // valor de aux sea menor que los
	                             paraOrdenar[j + 1] = paraOrdenar[j];       // de la izquierda, se desplaza a
	                             j--;                   // la derecha
	              }
	              paraOrdenar[j + 1] = aux; // colocamos aux en su sitio
	    }
	    return paraOrdenar;
	}
	
	@Override
	public String toString(){
		return this.clave.toString();
	}
	@Override
	public int compareTo(Object arg0) {
		
		return this.getClave().compareTo(((Elemento) arg0).getClave());
	}
	
	 
}
