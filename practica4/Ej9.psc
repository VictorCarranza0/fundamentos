Proceso sin_titulo
	Definir n,cont,num Como Entero;
	Definir ma,me Como Entero;
	Escribir 'n=';
	Leer n;
	ma <- 0;
	me <- 1000;
	cont <- n;
	Repetir
		Leer num;
		Si num<me Entonces
			me <- num;
		FinSi
		Si num>ma Entonces
			ma <- num;
		FinSi
		cont <- cont-1;
	Hasta Que cont=0
	Escribir 'Mayor = ',ma;
	Escribir 'Menor',me;
FinProceso
