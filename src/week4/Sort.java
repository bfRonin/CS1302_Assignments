package week4;

public class Sort {
	
	public int[] sortItUp(int[] input)
	{
		 int temp;
	        for (int i = 1; i < input.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	}
	
}
