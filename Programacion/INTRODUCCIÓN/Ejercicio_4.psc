Algoritmo Ejercicio_4
	Escribir "Dime un numero del 1 al 10"
	Leer PrimerNumero
	
	Si primerNumero > 0 o primerNumero =0 Entonces
		Escribir "Es mayor o igual que cero"
	SiNo
		Escribir "Es negativo"
	FinSi
	
	Escribir "Dime un numero Aleatorio"
	Leer PrimerNumero
	
	Si PrimerNumero > 0 Entonces
		Escribir "El numero es Positivo"
	FinSi
	Si PrimerNumero < 0 Entonces
		Escribir "El numero es Negativo"
	FinSi
	Si PrimerNumero = 0 Entonces
		Escribir "El numero que has dicho es 0"
	FinSi
	
	Escribir "Dime un primer numero"
	Leer PrimerNumero
	Escribir "Dime un segundo numero"
	Leer SegundoNumero
	
	Si PrimerNumero > 0 Y SegundoNumero > 0 Entonces
		Escribir " Los dos numeros son positivos"
	SiNo , PrimerNumero = 0 Y SegundoNumero = 0, Entonces
	FinSi
FinAlgoritmo

