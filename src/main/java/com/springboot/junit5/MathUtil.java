package com.springboot.junit5;

public class MathUtil {

    MathUtil() {
    }

    public static int add(int i, int j) {
        return i + j;
    }
    
    public static int multiply(int i, int j) {
        return i * j;
    }
    
    public static int devide(int i, int j) {
        return i * j;
    }
    
    public static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
}
