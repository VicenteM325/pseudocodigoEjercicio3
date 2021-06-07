Algoritmo Ejercicio3
	Escribir "Introduzca un número: "
	Leer numero
	Si numero < 0 Entonces
		Escribir "El valor ingresado no se puede calcular."
	SiNo
		x = 1
		factorial = 1
		Mientras x <= numero Hacer
			factorial = factorial * x
			x = x+1
		Fin Mientras
		Escribir "El factorial del número " numero " = ", factorial
	Fin Si
FinAlgoritmo
