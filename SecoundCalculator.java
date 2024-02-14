package com.secound.calculator.project;
import java.util.Scanner;
public class SecoundCalculator {

	public static void main(String[] args) 
	{
			System.out.println("         SMART CALCULATOR       ");
			System.out.println("...........................................");
			System.out.println();
			System.out.println("1. ADDITION.");
			System.out.println("2. SUBSTRACTION.");
			System.out.println("3. MULTIPLICATION.");
			System.out.println("4. DIVISION.");

			
			int a, b, ps, cal;
			System.out.println("Enter two Numbers.");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("Select Operation");
			ps = sc.nextInt();
			
			if(ps==1)
			{
				cal = a + b;
				System.out.println("ADDITION " +cal);
			}
			else if(ps==2)
			{
				cal = a - b;
				System.out.println("SUBSTRACTION " +cal);
			}
			else if(ps==3)
			{
				cal = a * b;
				System.out.println("MULTIPLICATION " +cal);
			}
			else if(ps==4)
			{
				cal = a / b;
				System.out.println("DIVISION " +cal);
			}
			else
			{
				cal = a % b;
				System.out.println("****REMAINDER****** ");
				System.out.println("You entered wrong Number");
			}

		}

	}
