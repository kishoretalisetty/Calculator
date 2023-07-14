package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");
		StandardCalculator calc = new StandardCalculator();
		calc.add(2,1);
		System.out.println(calc.getResult());
         calc.subtract(10, 2);
		 System.out.println(calc.getResult());
		 calc.divide(4.0,2.0);
		System.out.println(calc.getResult());
		calc.divide(12,4);
		System.out.println(calc.getResult());
         calc.multiply(10, 2);
		 System.out.println(calc.getResult());
	}

}
