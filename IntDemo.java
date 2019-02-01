import java.io.*;
public class IntDemo {
	
	int i;
	
	IntDemo(int i){
		this.i=i;
	}
	
	public int hashCode() {    // checking duplicate numbers
		return this.i;
	}
	
	public String toString() {
		return Integer.toString(i);  //convert int to string
	}

}
