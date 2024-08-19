package code2;

public class ReverseStringUsingRecursionn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] name={'l','a','k','s','h','m','i'};
int index=0;
ReverseString(index,name);
	}
static	void ReverseString(int index,char[] name){
	//base case condition
		if(index>=name.length || name==null)
			return;
		ReverseString(index+1,name);
		System.out.print(name[index]);
	}

}
