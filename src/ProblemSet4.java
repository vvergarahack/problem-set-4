/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		
	}
	//--------------------------------------------------------------
	public static String surroundMe (String out, String in) { //1
		String result = null;
		if(in != null && out != null) {
		    String before;
		    String after;
		    int lengthin = in.length();
		    int lengthout = out.length();
		    if(lengthout == 4 && lengthin == 3) {
			    before = out.substring(0,2);
			    after = out.substring(2,4);
			    result = before+in+after;
		    }
		}
		return result;
	}
	//--------------------------------------------------------------
	public static String endsMeet(String str, int n) { //2
		String result = null;
		if(str != null) {
		    int lengthstr = str.length();
		    if(lengthstr >= 1 && lengthstr <=10 && n > 0 && n <= lengthstr) {
			    String begin = str.substring(0, n);
			    String end = str.substring(lengthstr-n, lengthstr);
			    result = begin+end;
		    }
		}
		return result;
	}
	//--------------------------------------------------------------
	public static String middleMan(String str) { //3
		String result = null;
		if(str != null) {
		    int lengthstr = str.length();
		    if(lengthstr%2 != 0) {
			    int start = lengthstr/2-1;
			    int end = lengthstr/2+2;
			    result = str.substring(start, end);
		    }
		}
		return result;
	}
	//--------------------------------------------------------------
	public static String doubleVision(String str) { //4
		String result = null;
		if(str != null) {
			int lengthstr = str.length();
		    result = "";
		    char x;
		    for(int i = 0; i<lengthstr; i++) {
			    x = str.charAt(i);
			    result = result+x+x;
		    }
		}
		return result;
		
	}
	//--------------------------------------------------------------
	public static boolean centered(String str, String target) { //5
		boolean result = false;
		if(str != null && target != null) {
			int lengthstr = str.length();
		    int lengthtarget = target.length();
		    if(lengthtarget == 3 && lengthstr > 2){
		        if(target.equals(str.substring(lengthstr/2-1,lengthstr/2+2))){
		            result = true;
		        }
		        if(lengthstr%2==0){//even
		            if(target.equals(str.substring(lengthstr/2-2,lengthstr/2+1))){
		                result = true;
		            }
		        }
		    }
		}
		return result;
	}
	//--------------------------------------------------------------
	public static int upOrDown(double number, char operation) { //6
		int result;
		switch (operation){
			case 'c':
				result = (int)Math.ceil(number);
				break;
			case 'f':
				result = (int)Math.floor(number);
				break;
			case 'r':
				result = (int)Math.round(number);
				break;
			default:
			    result = -1;
		}
		return result;
	}
	//--------------------------------------------------------------
	public static int countMe(String text, char end) { //7
		int result = -1;
		if(text != null &&((end>='a'&&end<='z')||(end>='A'&&end<='Z'))){
			int i = 0;
			result = 0;
			int length = text.length();
			while(i<length) {
				if(i==length-1) {
					if(text.charAt(i)==end) {
						result++;
					}
				}
				else if(text.charAt(i+1)==' ') {
					if(text.charAt(i)==end){result++;}
				}
				i++;
			}
		}
		return result;
	}
	//--------------------------------------------------------------
	public static boolean isNotEqual(String str) { //8
		boolean result = false;
		if(str != null){
		    String is = "is", not = "not";
		    int countis = 0, countnot = 0;
		    int i = 0, y = 0, x = 0;
		    int length = str.length();
		    while(i<length){
		        if(is.charAt(x)==str.charAt(i)){
		            if(x<2){
		                countis++;
		                x = -1;
		            }x++;
		        }
		        if(not.charAt(y)==str.charAt(i)){
		            if(y<3){
		                countnot++;
		                y = -1;
		            }y++;
		        }i++;
		    }
		    if (countis == countnot){result = true;}
		    else{result = false;}
		}
		return result;
	}
	//--------------------------------------------------------------
	public static int  triplets(String str) {//9
		int result = -1;
		if(str != null){
		    result = 0;
		    int i = 1, repeat = 0;
		    int length = str.length();
		    char x = ' ';
		    while(i<length && result != -1){
		        x=str.charAt(i);
		        if(x!=' ' && ((x>='a'&&x<='z')||(x>='A'&&x<='Z'))){
		            if(x==str.charAt(i-1)){
		                repeat++;
		                if(repeat>1){
		                    result++;
		                }
		            }
		            else{repeat = 0;}
		        }
		        else{result = -1;}
		        i++;
		    }
		}
		return result;
	}
	//--------------------------------------------------------------
	public static int addMe(String str, boolean digits) { //10
		int result = -1;
		if(str != null){
		    result = 0;
		    int i = 0;
		    int length = str.length();
		    char x = ' ';
		    String num = "";
		    while(i<length && result != -1){
		        x=str.charAt(i);
		        if(x!=' '){
		            if(x>='0'&&x<='9'){
		                if(digits==true){
		                    result += Integer.parseInt(String.valueOf(x));
		                }
		                else{
		                    num += x;
		                }
		            }
		            if(!(x>='0'&&x<='9')||i==length-1){
		                if(digits==false && (!(num.equals("")))){
		                    result += Integer.parseInt(num);
		                    num = "";
		                }
		            }
		        }
		        else{result = -1;}
		        i++;
		    }
		}
		return result;
	}
}