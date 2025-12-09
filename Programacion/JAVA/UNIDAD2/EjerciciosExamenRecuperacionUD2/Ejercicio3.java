package EjerciciosExamenRecuperacionUD2;

public class Ejercicio3 {
    public static boolean ordenado(int [] arr) {
		
		boolean ordenado=true;
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i]>arr[i+1]) {
				ordenado=false;
			}
		}
		return ordenado;
	}
	
	public static void ordenarArray(int [] arr) {
		
		while (!ordenado(arr)) {
			for (int i=0;i<arr.length-1;i++) {
				if (arr[i]>arr[i+1]) {
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				
				}
			}
		}
	}
	
	
	public static boolean buscaElemento(int elem,int arr[]) {
		boolean enc=false;
		for (int i=0;i<arr.length;i++)
		{
			if (elem==arr[i])
				enc=true;
				
		}
		return enc;
	}
	
	public static int [] buscaComunes(int array1[],int array2[]) {
		int [] comunes;
		int [] comunes2;
		int contadorElementos=0;
		
		if (array1.length>array2.length)
			comunes=new int[array2.length];
		else
			comunes=new int[array1.length];
			
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array2.length;j++) {
				if (array1[i]==array2[j]) {
					if (!buscaElemento(array1[i],comunes))
						comunes[i]=array1[i];
				}
					
			}
		}
		
		for (int i=0;i<comunes.length;i++){
			if (comunes[i]!=0)
				contadorElementos++;
		}
		comunes2 = new int[contadorElementos];
		int indiceComunes2=0;
		for (int i=0;i<comunes.length;i++) {
			if (comunes[i]>0) {
				comunes2[indiceComunes2]=comunes[i];
				indiceComunes2++;
			}
		}
		ordenarArray(comunes2);
		return comunes2;
	}
	
	public static void main(String[] args) {
		int [] array1 = {3,7,8,2,2,4,5,9,9,9,1};
		int [] array2 = {5,7,3,2,2,2,2,2,2,2,2,2,1};
		int [] array3;
		int [] array4;
		
		//este metodo buscaComunes es el que en el enunciado llama interseccionVectores
		array3=buscaComunes(array1,array2);
		for (int i=0;i<array3.length;i++)
			System.out.print("["+ array3[i] +"]");
		
		
	}
}