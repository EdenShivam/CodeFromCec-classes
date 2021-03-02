
class Sort 
{ 
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
                int temp,index;
		for (int i = 0; i < n-1; i++)
                { temp=arr[i];
                  index=i; 
		for (int j = i+1; j < n; j++) 
				if (arr[j] >temp) 
				{ temp=arr[j];
                                  index=j;
                                 }
					 temp = arr[index]; 
					arr[index] = arr[i]; 
					arr[i] = temp; 
				} 
	} 

	
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

 
	public static void main(String args[]) 
	{ 
		BubbleSort ob = new BubbleSort(); 
		int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
		ob.bubbleSort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 

