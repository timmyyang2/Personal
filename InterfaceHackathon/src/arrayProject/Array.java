package arrayProject; //package name

public class Array implements dataInteractions{ //class
	
	private String[] arr = {"thanos car", "iron man", "speros the best", "13 hours", "out like a light"}; //string array
	
	public void setData(int index, String data) { //setData method
		arr[index] = data; //sets index to data
	}
	
	public String getData(int index) { //getData method with index parameter
		String n = arr[index]; //sets string n to the arr index
		System.out.println(n); //prints out n
		return n; //returns n
	}
	
	public int getSize() { //getSize method
		int size = arr.length; //sets int size as the arr length
		System.out.println(size); //prints out size
		return size; //returns size
	}
	
	public String getArray() { //getArray method
		String n = ""; //empty string
		for(int i=0; i<arr.length; i++) { //loop through array
			n=n+arr[i]+" "; //adds arr[i] to n
		}
		System.out.println(n); //prints out n
		return n; //returns n
	}
	
	public void eraseArray() { //eraseArray method
		for(int i=0; i<arr.length; i++) { //loop through array
			arr[i] = null; //sets each index to null
		}
	}
}
