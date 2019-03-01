package com.anr.util;

public  abstract class MathUtil {

	
		// TODO Auto-generated method stub
		public static boolean isPrime(int posInt){
			boolean b=true;
			for(int j=2;j<posInt;j++){
				if(posInt%j==0){
					b=false;
					break;
				}
			}
			return b;
		}
		public static boolean  isPrimeFactor(int num){
			int  product=1;
				for(int i=2;i<num;i++){
					if(isPrime(i)&& num%i==0){
					product *=i;
					//System.out.println(product);
					}}
				return product==num;
			}
		
		public static boolean isPerfect(int num){
			int sum=0;
			for(int i=1;i<num;i++){
				if(num%i==0)
					sum +=i;
			}
			return sum==num;
		}
		public static boolean isDeficient(int uperLimit)
		{
		    int sumDivisors = 0;
		    for (int i = 1 ; i < uperLimit; i++) {
		        sumDivisors += (uperLimit%i == 0) ? i : 0;
		    }
		    return (sumDivisors < uperLimit);
		}
		 
	}


