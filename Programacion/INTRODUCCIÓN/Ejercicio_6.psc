Algoritmo Ejercicio_6
//Ejercicio 6.1
	Escribir "Introduce  una contraseña"
	Repetir
		Leer contraseña
	Hasta Que contraseña = 1234
	Escribir "Bienvenido"
	//Ejercicio 6.2
	Escribir "Dime un numero"
	Leer x
	suma <- 0
	Mientras x <> 0 Hacer
		suma <- suma + x
		Escribir "Hasta ahora, la suma es ", suma
		Escribir "Dime otro numero"
		Leer x
	FinMientras
	Escribir "Terminado"	
//Ejercicio 6.3
	Escribir "Calcula la suma de los dos siguientes numeros"
	X <- AZAR(101)
	Escribir X
	z <- AZAR(101)
	Escribir Z
	Repetir
		Leer suma
	Hasta Que X + Z = suma
	Escribir "Eres un genio"
FinAlgoritmo
