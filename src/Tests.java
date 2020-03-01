import c030519.Elemento;


public class Tests {
	public static void main(String[] args) {
			
		Elemento a = new Elemento(1,"Hola");
		Elemento b = new Elemento(2,"Hola");
		Elemento c = new Elemento(3,"Hola");
		Elemento d = new Elemento(4,"Hola");
		Elemento e = new Elemento(5,"Hola");
		Elemento f = new Elemento(6,"Hola");
		Elemento g = new Elemento(7,"Hola");
		Elemento h = new Elemento(8,"Hola");
		Elemento i = new Elemento(9,"Hola");
		Elemento j = new Elemento(10,"Hola");
		
		Elemento[] ordenado = new Elemento[10];
		ordenado[0] = a;
		ordenado[1] = b;
		ordenado[2] = c;
		ordenado[3] = d;
		ordenado[4] = e;
		ordenado[5] = f;
		ordenado[6] = g;
		ordenado[7] = h;
		ordenado[8] = i;
		ordenado[9] = j;
		
		Elemento[] desordenado = new Elemento[10];
		desordenado[9] = a;
		desordenado[8] = b;
		desordenado[7] = c;
		desordenado[6] = d;
		desordenado[5] = e;
		desordenado[4] = f;
		desordenado[3] = g;
		desordenado[2] = h;
		desordenado[1] = i;
		desordenado[0] = j;
		
		Elemento[] random = new Elemento[10];
		random[0] = c;
		random[1] = f;
		random[2] = b;
		random[3] = d;
		random[4] = e;
		random[5] = a;
		random[6] = h;
		random[7] = g;
		random[8] = j;
		random[9] = i;
		
		for(Elemento x: desordenado)
			System.out.print(x.getClave()+" ");
		
		System.out.println();

		//////////////////////////////////////
		long startTime = System.nanoTime();//
		////////////////////////////////////
		
		
		
		//Elemento.seleccion(desordenado);
		//Elemento.burbujear(desordenado);
		Elemento.insercion(desordenado);
		
		
		/////////////////////////////////////
		long endTime = System.nanoTime();///
		///////////////////////////////////
		
		
		
		for(Elemento x: desordenado)
			System.out.print(x.getClave()+" ");
		System.out.println();
		
		
		
		////////////////////////////////////////////////////////////////////////
		long timeElapsed = endTime - startTime;////////////////////////////////
		System.out.println("Execution time in nanoseconds: " + timeElapsed);//
		/////////////////////////////////////////////////////////////////////
	
		Elemento.seleccion(desordenado);
		
		for(Elemento x: desordenado)
			System.out.print(x.getClave()+" ");
	}

}
