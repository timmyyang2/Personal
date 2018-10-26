package arrayProject; //package name

public interface dataInteractions { //interface

	public void setData(int index, String data); //setData method sets data at index
	
	public String getData(int index); //getData method
	
	public int getSize(); //getSize method to get array size
	
	public String getArray(); //getArray method
	
	public void eraseArray(); //eraseArray replaces array indexes to null
}
