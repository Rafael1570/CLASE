Algoritmo Ejercicio_8
	//Ejercicio 8.1
	Escribir "Dime los numeros del 5 al 15"
	Para x <- 5 Hasta 15 Hacer
		Escribir x
	FinPara
	//Ejercicio 8.2
	Escribir  "Dime los multiplos de 3"
	Para x <- 3 Hasta 30 Con paso 3 Hacer
		Escribir x
	FinPara
	//Ejercicio 8.3
	Escribir "Muestrame los multiplos del 3, pero contando del uno al diez"
	Para x <- 1 Hasta 10 Hacer
        Escribir x * 3
    FinPara
	//Ejercicio 8.4
	Escribir "Dime los Numeros del 20 al 10"
	Para x <- 20 Hasta 10
		Escribir x
	FinPara
	//Ejercicio 8.5
	Escribir "Dime la tabla del 5"
	Para x <- 5 Hasta 50 Con paso 5
		Escribir x
	FinPara
	//Ejercicio 8.6
	Escribir "Escribe los numeros del 1 al 15"
	contador <- 1
    Mientras contador <= 15 Hacer
        Escribir contador
        contador <- contador + 1
    FinMientras
	//Ejercicio 8.7
	Escribir "Dibuja un cuadrado"
	Escribir "Introduce el lado: "
	Leer lado
	
	Para fila<- 1 Hasta lado Hacer
		Para columna <- 1 Hasta lado Hacer
			Escribir Sin Saltar"0"
		FinPara
		Escribir ""
	FinPara
	//Ejercicio 8.8
	Escribir "Introduce el tamaño del triángulo:"
    Leer n
	
    Si n <= 0 Entonces
        Escribir "Introduce un número entero mayor que 0."
    SiNo
        Para Base<- 1 Hasta n Con Paso 1 Hacer
            Para Altura <- 1 Hasta Base Con Paso 1 Hacer
                Escribir Sin Saltar "*"
            FinPara
            Escribir ""
        FinPara
    FinSi
FinAlgoritmo

