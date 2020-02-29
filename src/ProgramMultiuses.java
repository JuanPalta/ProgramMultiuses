import java.util.Scanner;
/** 
*Multiple operations
*This class create a menu with many options and operations
*@version 1.0
@author JuanPalta*/
public class ProgramMultiuses{

	static Scanner sc;
	/**Constants of main menu*/
	static final int OPERATOR_STRINGS = 1;
	static final int OPERATOR_NUMBERS = 2;
	static final int OPERATOR_ARRAYS= 3;
	static final int EXIT = 4;
	/**constants of menu1*/
	static final int STRING_LENGTH = 1;
	static final int CONCATENATE_STRING = 2;
	static final int CHARACTER_SCREEN= 3;
	static final int INSERT_AGAIN1 = 4;
	static final int COMEBACK_MENU1=5;
    /**constans of menu2*/
	static final int DIVIDEREAL = 1;
	static final int DIVIDEINTEGER = 2;
	static final int INSERT_AGAIN2= 3;
	static final int COMEBACK_MENU2= 4;
	/**constans of menu3*/
	static final int DETERMINATELENGTH=1;
	static final int INSERTARRAYS=2;
	static final int SHOWARRAYS =3;
	static final int AVERAGE=4;
	static final int HIGHVALUE=5;
	static final int OPERATIONSWITHARRAYS=6;
	static final int FIRSTARRAY=1;
	static final int SECONDARRAY=2;
	static final int THIRDARRAY=3;
	static final int ADDICTION = 1;
	static final int SUBSTRACTION =2;
	static final int MULTIPLICATION = 3;
	static final int UNIONREPEAT=7;
	static final int UNIONWITHOUTREPEAT = 8;
	static final int INTERCEPTION = 9;
	static final int TURNPOSITION =10;
	static final int MENOR = 11;
	static final int COMEBACK_MENU3 = 12;
	
	/** VARIABLES */
	static String string1;
	static String string2;
	static String string3;
	static String concatenate;
	static int extraction;
	static int option;
	static int option1;
	static int option2;
	static int option3;
	static int optionarray;
	static double number1;
	static double number2;
	static int number1Integer;
	static int number2Integer;
	static int remainder;
	static double division;
	static double divisionInteger;
	static int[] arrayNumber1;
	static int[] arrayNumber2;
	static int[] arrayNumber3;
	static int[] operationarray;
	static int[] unionarray1;
	static int[] unionarray2;
	static int numberOfArray;
	static int numberOfArray2;
	static int optionturn;
	static int optionmenor;
	static int positionsarray;
		
	/**
	*Initialize the variables used
	*
	*pre:
	*
	*pos:initialize the variables used
	*/
	public static void initialize(){
	
	sc = new Scanner (System.in);
	string1 = "";
	string2 = "";
	string3 = "";
	concatenate = "";
	extraction = 0;
	option = 0;
	number1 = 0;
	number2= 0;
	number1Integer= 0;
	number2Integer=0;
	remainder= 0;
	division=0;
	divisionInteger=0;
	option1=0;
	option2=0;
	option3=0;
	numberOfArray = 0;
	numberOfArray2 = 0;
	optionarray = 0;
	optionturn=0;
	optionmenor=0;
	positionsarray = 0;
	}
	
	
	//OPERATOR OF STRINGS
	
	/**
	*Ask the user to enter three strings
	*
	*pre:
	*
	*pos: three strings
	*/
	public static void insertstrings(){
	System.out.println("                               ");	
	System.out.println("Insert the first string");
	string1 = sc.nextLine();
	System.out.println("Insert the second string");
	string2 = sc.nextLine();
	System.out.println("Insert the third string");
	string3 = sc.nextLine(); }
	
	/**	
	*This method show the length of the three strings
	*
	*pre:
	*
	*pos: the length of the three strings
	*/
	public static void showLength(){
		System.out.println("                                                             ");
		System.out.println("the length of the string  " + 1 + " is " + string1.length());
		System.out.println("the length of the string  " + 2 + " is "  + string2.length());
		System.out.println("the length of the string  " + 3 + " is " + string3.length());
	}
	
	
	/**
	*Concatenate the three strings
	*
	*pre:
	*
	*pos:show by console the result of the concatenate the three strings
	*/
	public static void concatenatestrings(){
		
		concatenate = string1 + " " + string2 + "  " + string3;
	System.out.println("                                                             ");
	System.out.println(concatenate);}
	
	
	/**
	*Ask the user which position of caracther want extract in the three strings and show it in console
	*
	*pre:all strings must contain the indicated position
	*
	*pos: the character in the selected position
	*/
	
	public static void showCharacter(){
		System.out.println("Insert the position of character in the three strings to extract");
	extraction = sc.nextInt();
	sc.nextLine();
	if ( extraction<= string1.length() && extraction<= string2.length() && extraction<= string1.length()){
	System.out.println("                                                             ");	
	System.out.println(" the character in first string is " + string1.charAt(extraction-1));
	System.out.println(" the character in second string is " + string2.charAt(extraction-1));
	System.out.println(" the character in third string is " + string3.charAt(extraction-1));
	}
	
	else { 
	System.out.println("                                                             ");
	System.out.println("you insert a incorrect value, all string need have the positions of the number inserted");}
	
	
	}
	
	//OPERATOR OF NUMBERS
	
	/**
	*Ask to enter two numbers
	*	
	*pre:
	*
	*pos: two numbers
	*/
	public static void insertNumbers(){
		
	System.out.println("Insert the dividend");
	number1 = sc.nextDouble();
	sc.nextLine();
	System.out.println("Insert the divisor");
	number2 = sc.nextDouble();
	sc.nextLine();	}
	
	/**
	*Makes the division with the numbers inserted
	*
	*pre:
	*
	*pos: the division of the inserted numbers
	*/
	public static void divisionReal(){
		if(number2!=0){
		division= number1/number2;
		System.out.println("                               ");
	System.out.println("the division between both numbers is " + division); }
		else{ 
		System.out.println();
		System.out.println("You can't divide by 0");
	}}
	/**
	*Makes the division with the whole part of the numbers inserted
	*
	*pre:
	*
	*pos: the whole part of the division of the two inserted numbers
	*/
	
	public static void divisionInteger(){
		
		number1Integer = (int)number1;
		number2Integer = (int)number2;
		
		if(number2Integer !=0){
		divisionInteger = number1Integer/number2Integer;
		remainder = number1Integer%number2Integer;
		System.out.println("                               ");
	System.out.println(" the division of the whole part of the numbers is " + divisionInteger + " and the remainder is " + remainder);}
	else{ 
	System.out.println();
	System.out.println("You can't divide by 0");}}
	
	
	//OPERATOR OF ARRAYS
	
	/**
	*Ask the length of the three arrays
	*
	*pre:
	*
	*pos: create three arrays with the indicated length
	*/	
	
	public static void LengthArrays(){
		
		System.out.println("Insert the length of the first array");
		int l1 = sc.nextInt();
		sc.nextLine();
		arrayNumber1 = new int[l1];
		
		System.out.println("Insert the length of the second array");
		int l2 = sc.nextInt();
		sc.nextLine();
		arrayNumber2 = new int[l2];
		
		System.out.println("Insert the length of the third array");
		int l3 = sc.nextInt();
		sc.nextLine();
		arrayNumber3 = new int[l3];
		
	}
	
	/**
	*Ask the elements that will go inside the arrays
	*
	*pre: elements are numbers
	*
	*pos: three arrays with elements
	*/
	public static void InsertArrays(){
		System.out.println("Insert the elements of the first array");
		System.out.println("");
		for (int i = 0 ; i<arrayNumber1.length;i++){
			System.out.println("Insert the element in the position number  " + (i+1) );
			
			arrayNumber1[i] = sc.nextInt();
			sc.nextLine();}

		System.out.println("Insert the elements of the second array");
		System.out.println("");
		for (int j = 0 ; j<arrayNumber2.length;j++){
			System.out.println("Insert the element in the position number  " + (j+1) );
			
			arrayNumber2[j] = sc.nextInt();
			sc.nextLine();}
			
		System.out.println("Insert the elements of the third array");
		System.out.println("");
		
		for (int k = 0 ; k<arrayNumber3.length;k++){
			System.out.println("Insert the element in the position number " + (k+1) );
			
			arrayNumber3[k] = sc.nextInt();
			sc.nextLine();}	
			
	}
	
	/**
	*Show the elements of the three arrays
	*
	*pre: arrays[] != null
	*
	*pos: show the elements of the three arrays by console
	*/
	public static void ShowArrays(){
		System.out.println(" ");
		System.out.println("The elements of first array are : ");
		for (int i = 0 ; i<arrayNumber1.length;i++){
			
		System.out.print(arrayNumber1[i] + " "); }
		
		System.out.println(" ");
		
		System.out.println("The elements of second array are : ");

		for (int j = 0 ; j<arrayNumber2.length;j++){
			System.out.print(arrayNumber2[j] + " ");}
		System.out.println(" ");
		System.out.println("The elements of third array are : ");
		
		for (int k = 0 ; k<arrayNumber3.length;k++){
			System.out.print(arrayNumber3[k] + " ");}	
		System.out.println(" ");
	}
	
	/** 
	*Calculate the average of the selected array
	*
	*pre:
	*
	*pos:Calculate the average of the selected array and show by console
	*/
	public static void Average(){
		int valorTotal = 0;
		System.out.println("Insert the number of the array to extract the average of his elements");
		numberOfArray = sc.nextInt();
		sc.nextLine();
		switch(numberOfArray){
			case FIRSTARRAY:
			for(int i = 0; i<arrayNumber1.length;i++){
				
			valorTotal += arrayNumber1[i]; }
			
			System.out.println();
			System.out.println("The average of this array is  " + valorTotal/arrayNumber1.length);
			break;
			
			case SECONDARRAY:
			for(int j = 0; j<arrayNumber2.length;j++){
				
			valorTotal += arrayNumber2[j]; }
			
			System.out.println();
			System.out.println("The average of this array is  " + valorTotal/arrayNumber2.length);
			break;
			
			case THIRDARRAY:
			for(int k = 0; k<arrayNumber3.length;k++){
				
			valorTotal += arrayNumber3[k]; }
			
			System.out.println();
			System.out.println("The average of this array is  " + valorTotal/arrayNumber3.length);
			break;
			
			default:
			System.out.println();
			System.out.println("Insert an existing array");
			break;
				
	}}
	
	/**
	*Show the higher value inside of the selected array
	*
	*pre:
	*
	*pos: the higher value inside of the selected array
	*/
	
	public static void HigherValue(){
		int higher = 0;
		System.out.println("");
		System.out.println("Insert the number of array to extract his higher value");
		numberOfArray = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		switch(numberOfArray){
			case FIRSTARRAY:
			for(int i = 0; i<arrayNumber1.length;i++){
				if(arrayNumber1[i]>higher){
			    higher = arrayNumber1[i]; }
			}
			
			System.out.println("The element of higher value is " + higher);
			System.out.println("");
			break;
			
			case SECONDARRAY:
			for(int j = 0; j<arrayNumber2.length;j++){
					if(arrayNumber2[j]>higher){
					higher = arrayNumber2[j];}
			}
			
			System.out.println("The element of higher value is " + higher);
			System.out.println("");
			break;
			
			case THIRDARRAY:
			for(int k = 0; k<arrayNumber3.length;k++){
				if(arrayNumber3[k]>higher){
			    higher = arrayNumber3[k]; }
			}
			
			System.out.println("The element of higher value is " + higher);
			System.out.println("");
			break;
			
			default:
			System.out.println();
			System.out.println("Insert an existing array");
			break;
		}
	}
	
	/**
	*Show a menu with differents type of operations will you can do with the arrays, you selected to arrays to operation
	*
	*pre: the arrays to operate must have the same length
	*
	*pos: Show an array with the results of the operation
	*/
	public static void OperationsArray(){
		
		
		System.out.println("");
		System.out.println("Insert the first array");
		numberOfArray = sc.nextInt();
		sc.nextLine();
		
		System.out.println("");
		System.out.println("Insert the second array");
		numberOfArray2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("");
		System.out.println(" INSERT 1: ADDICTION, \n INSERT 2:SUBSTRACTION, \n INSERT 3:MULTIPLICATION");
		optionarray = sc.nextInt();
		sc.nextLine();
		
		
		if(numberOfArray == 1 && numberOfArray2 == 2 || numberOfArray == 2 && numberOfArray2 == 1){
		switch(optionarray){
			
			case ADDICTION:
			
			System.out.println("");
				if(arrayNumber1.length == arrayNumber2.length){
					operationarray = new int[arrayNumber1.length];	
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber1[i] + (arrayNumber2[i]);}
			
			System.out.println("The result of the sum is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}
			
			System.out.println("");
			
			}
			
			else {
				
			System.out.println("The arrays have different length of elements"); }
			
			break;
			
			case SUBSTRACTION:
			
			System.out.println("");
				if(arrayNumber1.length == arrayNumber2.length){
					operationarray = new int[arrayNumber1.length];	
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber1[i] - (arrayNumber2[i]);}
			
			System.out.println("The result of the substraction is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}System.out.println("");
			
			}
			else {
			System.out.println("The arrays have different length of elements");}
			break;
			
			case MULTIPLICATION:
			
			System.out.println("");
				if(arrayNumber1.length==arrayNumber2.length){
					operationarray = new int[arrayNumber1.length];	
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber1[i] * arrayNumber2[i];}
			
			System.out.println("The result of the multiplication is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}System.out.println("");
			
			}
			else {
				
			System.out.println("The arrays have different length of elements");}
			
			break;
			
			default:
			System.out.println();	
			System.out.println(" You dont inserted a valid option ");
			break;
		}}
		
		else if(numberOfArray == 1 && numberOfArray2 == 3 || numberOfArray == 3 && numberOfArray2 == 1){
		switch(optionarray){
			case ADDICTION:
			
			System.out.println("");
				if(arrayNumber1.length==arrayNumber3.length){
					operationarray = new int[arrayNumber1.length];	
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber1[i] + (arrayNumber3[i]);}
			
			System.out.println("The result of the sum is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}System.out.println("");
			
			}
			else {
				
			System.out.println("The arrays have different length of elements");}
			
			break;
			
			case SUBSTRACTION:
			
			System.out.println("");
				if(arrayNumber1.length==arrayNumber3.length){
					operationarray = new int[arrayNumber1.length];	
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber1[i] - (arrayNumber3[i]);}
			
			System.out.println("The result of the substraction is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}System.out.println("");
			
			}
			else {
				
			System.out.println("The arrays have different length of elements");}
			
			break;
			
			case MULTIPLICATION:
			
			System.out.println("");
				if(arrayNumber1.length==arrayNumber3.length){
					operationarray = new int[arrayNumber1.length];	
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber1[i] * arrayNumber3[i];}
			
			System.out.println("The result of the multiplication is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}System.out.println("");
			
			}
			else {
				
			System.out.println("The arrays have different length of elements");}
			
			break;
			
			default:
			
			System.out.println();	
			System.out.println(" You dont inserted a valid option ");
			
			break;
		}}
		
		else if(numberOfArray == 2 && numberOfArray2 == 3 || numberOfArray == 3 && numberOfArray2 == 2){
		
		switch(optionarray){
			case ADDICTION:
			
			System.out.println("");
				if(arrayNumber2.length==arrayNumber3.length){
					operationarray = new int[arrayNumber2.length];	
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber2[i] + (arrayNumber3[i]);}
			
			System.out.println("The result of the sum is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}
			
			System.out.println("");
			
			}
			else {
				
			System.out.println("The arrays have different length of elements");}
			break;
			
			case SUBSTRACTION:
			
			System.out.println("");
				if(arrayNumber2.length==arrayNumber3.length){
					operationarray = new int[arrayNumber2.length];	
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber2[i] - (arrayNumber3[i]);}
			
			System.out.println("The result of the substraction is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}System.out.println("");
			
			}
			else {
				
			System.out.println("The arrays have different length of elements");}
			break;
			
			case MULTIPLICATION:
			
			System.out.println("");
				if(arrayNumber2.length==arrayNumber3.length){
					operationarray = new int[arrayNumber2.length];	
				
				for(int i=0; i<operationarray.length;i++){
					operationarray[i] = arrayNumber2[i] * arrayNumber3[i];}
			
			System.out.println("The result of the multiplication is ");
			for(int i=0; i<operationarray.length;i++){
				System.out.print(operationarray[i] + " ");
			}System.out.println("");
			
			}
			
			else {
				
			System.out.println("The arrays have different length of elements");}
			
			break;
			
			default:
			
			System.out.println();	
			System.out.println(" You dont inserted a valid option ");
			
			break;
		}}
		
		else{
		System.out.println();	
		System.out.println(" You entered a nonexistent array ");}
		
		
			
}
	/**
	*Show the union of the three arrays with repeated numbers
	*
	*pre:
	*
	*pos:the union of the three arrays with repeated numbers
	*/
	
	public static void GenerateUnionRepeat(){
		
		unionarray1 = new int [arrayNumber1.length + arrayNumber2.length + arrayNumber3.length];
		
		for(int i = 0; i<arrayNumber1.length;i++){
			
		unionarray1[i] = arrayNumber1[i];}
		
		int j = 0;
		for(int i = arrayNumber1.length; i<arrayNumber1.length + arrayNumber2.length;i++){	
		unionarray1[i] = arrayNumber2[j];
		j++;
		}
		
		j=0;
		for(int i = arrayNumber1.length + arrayNumber2.length; i<unionarray1.length;i++){
		unionarray1[i] = arrayNumber3[j];
		j++;
		}
		
		System.out.println("");
		
		System.out.print("The union of the three arrays with repeat numbers is " + " ");
		
		for(int i=0; i<unionarray1.length;i++){
		System.out.print(unionarray1[i] + " ");}
	
	}
	
	/**
	*Show the union of the three arrays without repeated numbers
	*
	*pre:
	*
	*pos:the union of the three arrays without repeated numbers
	*/
	
	public static void GenerateUnionWithoutRepeat(){
		unionarray1 = new int [arrayNumber1.length + arrayNumber2.length + arrayNumber3.length];
		
		for(int i = 0; i<arrayNumber1.length;i++){
			
		unionarray1[i] = arrayNumber1[i];}
		
		int j = 0;
		for(int i = arrayNumber1.length; i<arrayNumber1.length + arrayNumber2.length;i++){	
		unionarray1[i] = arrayNumber2[j];
		j++;
		}
		
		j=0;
		for(int i = arrayNumber1.length + arrayNumber2.length; i<unionarray1.length;i++){
		unionarray1[i] = arrayNumber3[j];
		j++;
		}
		
		System.out.println("");
		
		for(int i=0;i<unionarray1.length;i++){
				 
			for(int l=0; l<unionarray1.length;l++){
				
				if (l != i){
					if(unionarray1[i] == unionarray1[l]){
						unionarray1[i] = 0;
				}

			
		
		} }}
		
		int contador = unionarray1.length;
		System.out.println("The union array Whitout repeat numbers is ");
		for(int k = 0; k<=contador-1;k++){
			if(unionarray1[k]!= 0){
	System.out.print(" " + unionarray1[k] + " ");}
	}
	
	System.out.println();
	}
	
	/**
	*Look for the repeated numbers in the union of the three arrays
	*
	*Show the interception of the three arrays
	*
	*pre:
	*
	*pos: the interception of the three arrays
	*/
	public static void Interception(){
		
		unionarray1 = new int [arrayNumber1.length + arrayNumber2.length + arrayNumber3.length];
		
		for(int i = 0; i<arrayNumber1.length;i++){
			
		unionarray1[i] = arrayNumber1[i];}
		
		int j = 0;
		for(int i = arrayNumber1.length; i<arrayNumber1.length + arrayNumber2.length;i++){	
		unionarray1[i] = arrayNumber2[j];
		j++;
		}
		
		j=0;
		for(int i = arrayNumber1.length + arrayNumber2.length; i<unionarray1.length;i++){
		unionarray1[i] = arrayNumber3[j];
		j++;
		}
		
		System.out.println("");
		
		int contador = 0;
		
		for(int i=0;i<unionarray1.length;i++){
				 
			for(int l=0; l<unionarray1.length;l++){
				
				if (l != i){
					if(unionarray1[i] == unionarray1[l]){
					contador++;}
				}

			
		
		} }
		
		int[]unionarray2=new int[contador];
		
		int x = 0;
		for(int i=0;i<unionarray1.length && x!= contador;i++){
				 
			for(int l=0; l<unionarray1.length && x != contador;l++){
				
				if (l != i && x!=contador){
					if(unionarray1[i] == unionarray1[l] && x!=contador){
					unionarray2[x] = unionarray1[i];
					x++;}
				}

			
		
		} }
		
		System.out.println();
		
		System.out.print(" The interception in the three arrays is ");
		
		for(int k = 0; k<unionarray2.length;k++){
			
		System.out.print(unionarray2[k] + " ");}
		
		System.out.println();
			
	}
		
	/**
	*Rotate the positions of the selected array as many times as we want
	*
	*pre:
	*
	*pos:the new array after turning it
	*/
		public static void TurnPosition(){
		System.out.println();
		System.out.println("What array do you would like  turn?");
		optionturn = sc.nextInt();
		sc.nextLine();
		switch(optionturn){
			case FIRSTARRAY : 
			 System.out.println("How many positions do you like move?");
			 
			 positionsarray = sc.nextInt();
			 sc.nextLine();
			 
			 
			 
			 for(int j=0; j<positionsarray;j++){
				 
			int last= arrayNumber1[arrayNumber1.length-1];
				 
			 for(int i=arrayNumber1.length-2;i>=0;i--){
				 
				
			 arrayNumber1[i+1] = arrayNumber1[i];}
			 
				 
			 arrayNumber1[0] = last;}
			 
		System.out.println("");
		System.out.print(" The result of array is " + " ");
		for(int i=0; i<arrayNumber1.length;i++){
		System.out.print(arrayNumber1[i] + " ");}
		System.out.println("");
		
		break;
		
		case SECONDARRAY : 
			 System.out.println("How many positions do you like move?");
			 positionsarray = sc.nextInt();
			 sc.nextLine();
			 
			 
			 
			 for(int j=0; j<positionsarray;j++){
				 
			int last= arrayNumber2[arrayNumber2.length-1];
				 
			 for(int i=arrayNumber2.length-2;i>=0;i--){
				 
				
			 arrayNumber2[i+1] = arrayNumber2[i];}
			 
				 
			 arrayNumber2[0] = last;}
			 
		System.out.println("");
		System.out.print(" The result of array is " + " ");
		for(int i=0; i<arrayNumber2.length;i++){
		System.out.print(arrayNumber2[i] + " ");}
		System.out.println("");
		break;
		
		case THIRDARRAY : 
			 System.out.println("How many positions do you like move?");
			 positionsarray = sc.nextInt();
			 sc.nextLine();
			 
			 
			 
			 for(int j=0; j<positionsarray;j++){
				 
			int last= arrayNumber3[arrayNumber3.length-1];
				 
			 for(int i=arrayNumber3.length-2;i>=0;i--){
				 
				
			 arrayNumber3[i+1] = arrayNumber3[i];}
			 
				 
			 arrayNumber3[0] = last;}
			 
		System.out.println("");
		System.out.print(" The result of array is " + " ");
		for(int i=0; i<arrayNumber3.length;i++){
		System.out.print(arrayNumber3[i] + " ");}
		
		System.out.println("");
		
		break;
		
		default: System.out.println("Insert a valid option");
		break;
		
		
	
	
	
	}}
	
	/** 
	*Sorts the selected array from least to greatest
	*
	*pre:
	*
	*pos: show the selected array from least to greatest
	*/
	public static void Sort(){
		System.out.println();
		System.out.println("What array do you would like  ordinate?");
		optionmenor = sc.nextInt();
		sc.nextLine();
		int aux = 0;
		switch(optionmenor){
			case FIRSTARRAY: 
			
			  for(int j=0; j<arrayNumber1.length;j++){
				 
			 for(int i=j+1;i<arrayNumber1.length;i++){
				 
				 if(arrayNumber1[j]>arrayNumber1[i]){
					 aux = arrayNumber1[j];
					 arrayNumber1[j] = arrayNumber1[i];
			 arrayNumber1[i] = aux; }}}
			 
		System.out.println("");
		System.out.print(" The result of the ordinate is " + " ");
		for(int i=0; i<arrayNumber1.length;i++){
		System.out.print(arrayNumber1[i] + " ");}
		System.out.println("");
		break;
		
		case SECONDARRAY: 
			 
			 for(int j=0; j<arrayNumber2.length;j++){
				 
			 for(int i=j+1;i<arrayNumber2.length;i++){
				 
				 if(arrayNumber2[j]>arrayNumber2[i]){
					 aux = arrayNumber2[j];
					 arrayNumber2[j] = arrayNumber2[i];
			 arrayNumber2[i] = aux; }}}
			 
		System.out.println("");
		System.out.print(" The result of the ordinate is " + " ");
		for(int i=0; i<arrayNumber2.length;i++){
		System.out.print(arrayNumber2[i] + " ");}
		System.out.println("");
		break;
		
		case THIRDARRAY: 
			 for(int j=0; j<arrayNumber3.length;j++){
				 
			 for(int i=j+1;i<arrayNumber3.length;i++){
				 
				 if(arrayNumber3[j]>arrayNumber3[i]){
					 aux = arrayNumber3[j];
					 arrayNumber3[j] = arrayNumber3[i];
			 arrayNumber3[i] = aux; }}}
			 
		System.out.println("");
		System.out.print(" The result of the ordinate is " + " ");
		for(int i=0; i<arrayNumber3.length;i++){
		System.out.print(arrayNumber3[i] + " ");}
		System.out.println("");
		break;
		
		default: 
		System.out.println();	
		
		System.out.println(" You dont inserted a valid option ");
		break;
	}
	}
			
	/**
	*It shows a menu on the console with all the options that the program can perform
	*
	*pre:
	*
	*pos:menu on the console with all the options that the program can perform
	*/
	public static void mainMenu(){
		while (option!=EXIT ){
		System.out.println("                                                             ");
		System.out.println("WELCOME TO MY PROGRAM MULTIUSES");
		System.out.println("Options Menu \n Choose any option \n 1:OPERATOR OF STRINGS \n 2:OPERATOR OF NUMBERS\n 3:OPERATOR OF ARRAYS \n 4:EXIT");
		option = sc.nextInt();
		sc.nextLine();
		
		switch(option){
			case OPERATOR_STRINGS:
			insertstrings();
			menu1();
			break;
			case OPERATOR_NUMBERS:
			insertNumbers();
			menu2();
			break;
			case OPERATOR_ARRAYS:
			LengthArrays();
			InsertArrays();
			menu3();
			break;
			
			case EXIT:
			System.out.println("             ");
			System.out.println("Thank you to use my program, see you later");
			break;
			
			default: System.out.println("             ");
			System.out.println("You inserted a invalid option");
			break;
			
	} } }	
		
			
	//SUBMENUS
	
	/** MENU OF THE OPERATOR OF STRINGS */
		public static void menu1 (){
		option1 = 0;
		while(option1 != COMEBACK_MENU1){
		System.out.println("                                                             ");
		System.out.println("WELCOME TO THE OPERATOR OF STRINGS");
		System.out.println("Options Menu \n Choose any option \n 1:Calculate the strings length \n 2:Concatenate strings \n 3:Extract character \n 4:Insert strings again \n 5:COMEBACK TO THE MAIN MENU");
		option1 = sc.nextInt();
		sc.nextLine();
		
		switch(option1){
			case STRING_LENGTH:
			showLength();
			
			break;
			case CONCATENATE_STRING:
			concatenatestrings();
			
			break;
			case CHARACTER_SCREEN:
			showCharacter();
			
			break;
			case INSERT_AGAIN1:
			insertstrings();
			
			break;
			case COMEBACK_MENU1:
			mainMenu();
			break;
			default: System.out.println("You inserted a invalid option, you will be redirected to the main menu");
			break;
	}}}
		
		/** MENU OF THE OPERATOR OF NUMBERS */
		public static void menu2 (){
		option2 = 0;
		while(option2 != COMEBACK_MENU2){		
		System.out.println("                                                             ");
		System.out.println("WELCOME TO THE OPERATOR OF NUMBERS");
		System.out.println("Options Menu \n Choose any option \n 1:DIVIDE THE NUMBERS \n 2:DIVIDE THE WHOLE PART OF THE NUMBERS AND CALCULATE THE REMAINDER \n 3:INSERT NUMBERS AGAIN\n 4:COMEBACK MAIN MENU");
		option2 = sc.nextInt();
		sc.nextLine();
		
		switch(option2){
			
			case DIVIDEREAL:
			divisionReal();
			
			break;
			case DIVIDEINTEGER:
			divisionInteger();
			
			break;
			case INSERT_AGAIN2:
			insertNumbers();
			
			break;
			case COMEBACK_MENU2:
			mainMenu();
			break;
			default: System.out.println("You inserted a invalid option, you will be redirected to the main menu");
			break;
			
			
			
		}}}
		
		
		/** MENU OF THE OPERATOR OF ARRAYS */
		public static void menu3 (){
		option3 = 0;
		while(option3 != COMEBACK_MENU3){		
		System.out.println("                                                             ");
		System.out.println("WELCOME TO THE OPERATOR OF ARRAYS");
		System.out.println("Options Menu \n Choose any option \n 1:DETERMINATE THE LENGTH OF ARRAYS \n 2:INSERT ARRAYS \n 3:SHOW ARRAYS\n 4:AVERAGE \n 5:HIGHER VALUE \n 6:OPERATIONSWITHARRAYS \n 7:UNION WITH REPEAT NUMBERS \n 8:UNION WITHOUT REPEAT NUMBERS \n 9:INTERCEPTION \n 10:TURN POSITION \n 11:ORDER FROM LEAST TO GREATEST \n 12:BACK TO MAIN MENU ");
		option3 = sc.nextInt();
		sc.nextLine();
		
		switch(option3){
			case DETERMINATELENGTH:
			LengthArrays();
			
			break;
			case INSERTARRAYS:
			InsertArrays();
			
			break;
			case SHOWARRAYS:
			ShowArrays();
			
			break;
			case AVERAGE:
			Average();
			
			break;
			case HIGHVALUE:
			HigherValue();
			
			break;
			
			case OPERATIONSWITHARRAYS:
			OperationsArray();
			break;
			
			case UNIONREPEAT:
			GenerateUnionRepeat();
			break;
			
			case UNIONWITHOUTREPEAT:
			GenerateUnionWithoutRepeat();
			
			break;
			
			case INTERCEPTION:
			Interception();
			
			break;
			
			case TURNPOSITION:
			TurnPosition();
			break;
			
			case MENOR:
			Sort();
			
			break;
			case COMEBACK_MENU3:
			mainMenu();
			break;
			default: System.out.println("You inserted a invalid option, you will be redirected to the main menu");
			mainMenu();
			break;
			
			
			
			
		}}}
public static void main(String[]args){
	initialize();
	mainMenu(); 
}
}