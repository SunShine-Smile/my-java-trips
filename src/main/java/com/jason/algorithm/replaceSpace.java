package com.jason.algorithm;

/**
 * @desc 将一个字符串中的空格替换成 "%20"
 * @input "A B"
 * @output "A%20B"
 * @idea 在字符串尾部填充任意字符，使得字符串的长度等于替换之后的长度。因为一个空格要替换成三个字符（%20），因
此当遍历到一个空格时，需要在尾部填充两个任意字符。
令 P1 指向字符串原来的末尾位置，P2 指向字符串现在的末尾位置。P1 和 P2 从后向前遍历，当 P1 遍历到一个空格
时，就需要令 P2 指向的位置依次填充 02%（注意是逆序的），否则就填充上 P1 指向字符的值。
从后向前遍是为了在改变 P2 所指向的内容时，不会影响到 P1 遍历原来字符串的内容。
 * @author Jason
 *
 */
public class replaceSpace {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("A B");
		System.out.println(replaceSpace1(stringBuffer));
		String string = "qw";
		System.out.println(replaceSpace2(string,2));
	}
	
	public static String replaceSpace1(StringBuffer stringBuffer) {
		int p1 = stringBuffer.length() - 1;
		for(int i = 0; i <= p1; i++) {
			if(stringBuffer.charAt(i) == ' ') {
				stringBuffer.append("  ");
			}
		}
		int p2 = stringBuffer.length() - 1;
		while(p1 < p2 && p1 >= 0) {
			char c = stringBuffer.charAt(p1--);
			if(c == ' ') {
				stringBuffer.setCharAt(p2--, '0');
				stringBuffer.setCharAt(p2--, '2');
				stringBuffer.setCharAt(p2--, '%');
			} else {
				stringBuffer.setCharAt(p2--, c);
			}
		}
		return stringBuffer.toString();
	}
	
	public static String replaceSpace2(String iniString, int length) {
        // write code here
        if(null == iniString || length <= 0){
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(iniString);
        int p1 = length - 1;
        for(int i=0; i<= p1; i++){
            char c = iniString.charAt(i);
            if(' ' == c){
                stringBuffer.append("  ");
            }
        }
        int p2 = stringBuffer.length() - 1;
        while(p1 < p2 && p1 >= 0){
            char c = stringBuffer.charAt(p1--);
            if(' ' == c){
                stringBuffer.setCharAt(p2--,'0');
                stringBuffer.setCharAt(p2--,'2');
                stringBuffer.setCharAt(p2--,'%');
            }else{
                stringBuffer.setCharAt(p2--,c);
            }
        }
        return stringBuffer.toString();
    }
}
