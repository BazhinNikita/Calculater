package com.example;
import java.util.*;

public class Calculater{
	public static void main(String[] args){
		Scanner Calculater = new Scanner(System.in);
		double x,y;
		int act;
			System.out.println("Введите первое число");
				x = Calculater.nextDouble();		
			System.out.println("Введите второе число");
				y = Calculater.nextDouble();
			System.out.println("Выберите операцию");
			System.out.println(" 1.Сложение\n 2.Вычетание\n 3.Деление\n 4.Умножение\n");
				act = Calculater.nextInt();
			switch(act){ 
			case 1: System.out.printf("Сложение\n %f \n", x+y); break;
			case 2: System.out.printf("Вычетание\n %f \n", x-y); break;
			case 3: if (y==0) {
				System.out.printf("Ай Ай Ай, на ноль делить нельзя!!!(получится бесконечность)\n"); break;}
			 System.out.printf("Деление\n %f \n", x/y); break;
			case 4: System.out.printf("Умножение\n %f \n", x*y); break;		
			default: System.out.printf("Неправильно выбранное действие\n"); break;
			
		}		
	}
}

