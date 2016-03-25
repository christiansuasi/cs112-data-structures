
public class TwoSmallest {
	public static void main(String[]args){
		System.out.println("Enter terminating value that's a positive integer");
		int terminator=IO.readInt();
		if (terminator<=0){
			IO.reportBadInput();
		}
		int lowest;
		int secondLowest;
		System.out.println("Enter value that isn't the terminating number");
		int num1=IO.readInt();
		if (num1==terminator){
			IO.reportBadInput();
			System.exit(0);
		}
		System.out.println("Enter another value that isn't the terminating number");
		int num2=IO.readInt();
		if (num1<=num2){
			lowest=num1;
			secondLowest=num2;
		}else{
			lowest=num2;
			secondLowest=num1;
		}
		System.out.println("Enter other values or terminator");
		int input=IO.readInt();
		while(input!=terminator){
			if (input<lowest){
				lowest=input;
			}else if(input<secondLowest && input>lowest){
				secondLowest=input;
			}
		System.out.println("Enter another value or terminator");
		input=IO.readInt();
		
		}
		IO.outputIntAnswer(lowest);
		IO.outputIntAnswer(secondLowest);
	}
}
