//Program to print all prime number in Java

```java
class Findprimenumber{   
	public static void main(String[] args) {
		int a=1,b=100;
		for(int i=a;i<=b;i++){
		    if(checkPrime(i)){
		        System.out.print(i+" " );
		    }
		}
	}
	public static boolean checkPrime(int num){
	    // 0, 1 and negative numbers are not prime
	    if(num<2){
	        return false;
	    }
	    else{
	        int x= num/2;
	        for(int i=2;i<x;i++){
	            if(num%i==0){
	                return false;
	            }
	        }
	    }
	    return true;
	}
}
```
**Output**
```
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
```