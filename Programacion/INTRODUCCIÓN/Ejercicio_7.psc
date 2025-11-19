Algoritmo Ejercicio_7
	//Ejercicio 7.1
	Escribir "Dime un codigo de usuario y una contraseña para el mismo"
	Repetir
		Leer cod_user
		Leer contraseña
	Hasta Que cod_user = 1 Y contraseña = 1234
	
	//Ejercicio 7.2
	Escribir "Dime dos numero para sumarlos"
	Repetir
		Leer x
		Leer z
		Escribir x + z
	Hasta Que x = 0 Y z = 0
	
	//Ejercicio 7.3
	Escribir "Dime dos numeros para dividirlos"
	Repetir
		Leer X
		Leer Z
		Si z = 0
			Escribir "No se puede dividir con 0"
			Leer Z
		FinSi
		Escribir X / Z
	Hasta Que X = 0
	
FinAlgoritmo
