package oops;

public class BlankFinalStaticVariable {
static final int data;
static
{
	data=45;
	}
int cube(final int n)
{
	//n=n+1;//The final local variable n cannot be assigned. It must be blank and not using a compound assignment
	return n*n*n;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BlankFinalStaticVariable.data);
	}

}
