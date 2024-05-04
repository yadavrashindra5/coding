package org.example.coding.stack;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.*;

/**
 * The type Coding.
 */
public class Coding {
    /*
     * 1021 remove-outermost-parentheses
     *
     * @param s valid parenthesis
     * @return String
     * @see https://leetcode.com/problems/remove-outermost-parentheses/description/
     *
     *The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does.
     */

    /**
     * Remove outer parentheses string.
     *
     * @param s the s
     * @return the string
     */
    public static String removeOuterParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int lengthOfS = s.length();
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i < lengthOfS) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                stack.push(i);
            } else {
                if (stack.size() == 1) {
                    result.append(s.substring(stack.pop() + 1, i));
                } else {
                    stack.pop();
                }
            }
            i++;
        }
        return result.toString();
    }

    /**
     * Max depth int.
     *
     * @param s the valid parenthesis string
     * @return the depth of nested parenthesis int 1614. Maximum Nesting Depth of the Parentheses
     * @see https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses
     */
    public static int maxDepth(String s) {
        int maxDepth = 0, countOpenParen = 0;
        int lengthOfString = s.length();
        int i = 0;
        Stack<Character> stack = new Stack<>();
        while (i < lengthOfString) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                stack.push(currentChar);
                countOpenParen++;
            } else if (currentChar == ')') {
                if (maxDepth < countOpenParen) {
                    maxDepth = countOpenParen;
                }
                countOpenParen--;
                stack.pop();
            }
            i++;
        }
        return maxDepth;
    }

    /**
     * Final prices int [ ].
     *
     * @param prices the prices
     * @return the int [ ]
     */
    public static int[] finalPrices(int[] prices) {
        int previousEle = Integer.MAX_VALUE;
        int numberOfItems = prices.length;
        for (int i = numberOfItems - 1; i >= 0; --i) {
            int priceOfCurrentItem = prices[i];
            if (previousEle <= priceOfCurrentItem) {
                prices[i] = priceOfCurrentItem - previousEle;
            } else if (previousEle >= priceOfCurrentItem) {
                previousEle = priceOfCurrentItem;
            }
        }
        System.out.println(Arrays.toString(prices));
        return prices;
    }


    /**
     * Remove duplicates string.
     *
     * @param s the s
     * @return the string
     */
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int lengthOfString = s.length();

        for (int i = 0; i < lengthOfString; ++i) {
            char currentChar = s.charAt(i);
            boolean isCurrentCharEqualToPeek = false;
            while (!stack.isEmpty() && stack.peek() == currentChar) {
                stack.pop();
                isCurrentCharEqualToPeek = true;
            }
            if (!isCurrentCharEqualToPeek) {
                stack.push(currentChar);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            char currentChar = stack.pop();
            stringBuilder.insert(0, currentChar);
        }
        return stringBuilder.toString();
    }

    public static String palidromChecker(int number, String result) {
        //base case
        if (number < 10) {
            return (result + number);
        }
        int digit = number % 10;
        number = number / 10;
        //recursive assumption
        result = palidromChecker(number, result);
        //self work
        result = digit + result;
        return result;
    }

    /*
     *
     * */
    public static void minRemoveToMakeValid(String s) {
        System.out.println("minRemoveToMakeValid");
        Stack<Character> stack = new Stack<>();
        String result="";
        for (int i = 0; i < s.length(); ++i) {
            if(s.charAt(i)=='('){
                stack.push('(');
            }else if(!stack.isEmpty()&&s.charAt(i)==')'){
                String str="";
                while(!stack.isEmpty()&&stack.peek()!='('){
                    str=stack.pop()+str;
                }
                str = stack.pop() + str + ')';
                result+=str;
            } else if(Character.isAlphabetic(s.charAt(i))){
                if(!stack.isEmpty()){
                    stack.push(s.charAt(i));
                }else{
                    result+=s.charAt(i);
                }
            }
        }
        System.out.println(result);
    }

    public static boolean checkValidString(String s) {
        Stack<Integer>bracket=new Stack<>();
        Stack<Integer>astrik=new Stack<>();
        for(int i=0;i<s.length();++i){
            char currentCharacter=s.charAt(i);
            if(currentCharacter=='('){
                bracket.push(i);
            }else if(currentCharacter==')'){
                //find open bracket in bracket stack
                if(!bracket.isEmpty()){
                    bracket.pop();
                }else if(!astrik.isEmpty()){
                    astrik.pop();
                }
                else {
                    return false;
                }
            }else if(currentCharacter=='*'){
                astrik.push(i);
            }
        }
        while(!bracket.isEmpty() && !astrik.isEmpty() && bracket.peek()<astrik.peek()){
            bracket.pop();
            astrik.pop();
        }
        return bracket.isEmpty();
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer>deque=new ArrayDeque<>();
        for(int i=0;i<students.length;++i){
            deque.add(students[i]);
        }
        int size=deque.size();
        int count=0,i=0;
        while(!deque.isEmpty()){
            int frontElement=deque.getFirst();
            if(count==size){
                return size;
            }
            if(frontElement==sandwiches[i]){
                deque.pop();
                size=deque.size();
                count=0;
                i++;
            }else if(frontElement!=sandwiches[i]){
                deque.addLast(deque.pop());
                count++;
            }
        }
        return 0;
    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        int size=deck.length;
        int result[]=new int[size];
        Deque<Integer>deque=new ArrayDeque<>();
        for(int i=0;i<size;++i){
            deque.add(i);
        }

        Arrays.sort(deck);
        int i=0;
        while (!deque.isEmpty()){
            int front=deque.pollFirst();
            result[front]=deck[i];
            i++;
            try{
                int secondFront=deque.pop();
                deque.addLast(secondFront);
            }catch (Exception e){

            }
        }
        return result;
    }

    /**
     *
     *
     *
     *
     * @param s this is string
     * @return int this is index of non-repeated character
     * */
    public int firstUniqChar(String s) {
        Map<Character,Integer>map=new HashMap<>();
        Deque<Integer>deque=new ArrayDeque<>();
        for(int i=0;i<s.length();++i){
            char currentChar=s.charAt(i);
            if(!map.containsKey(currentChar)){
                deque.add(i);
                map.put(currentChar,i);
            }else{
                deque.remove(map.get(currentChar));
            }
        }
        try{
            return deque.getFirst();
        }catch (Exception e){
            return -1;
        }
    }

//    public static int minCost(String colors, int[] neededTime) {
//        Stack<Integer>stack=new Stack<>();
//        int count=0;
//        for(int i=0;i<colors.length();++i){
//            if(stack.isEmpty()){
//                stack.push(i);
//            }else{
//                int peek=stack.peek();
//                if(colors.charAt(peek)==colors.charAt(i)){
//                    if(neededTime[peek]<neededTime[i]){
//                        stack.pop();
//                        stack.push(i);
//                        count+=neededTime[peek];
//                    }else{
//                        count+=neededTime[i];
//                    }
//                }
//                else {
//                    stack.push(i);
//                }
//            }
//        }
//        return count;
//    }

    public static int minCost(String colors, int[] neededTime) {
       int prev=-1,next=-1;
       int count=0;
        for(int i=0;i<colors.length();++i){
        }
        return 0;
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;++i){
            if(map.containsKey(nums[i])){
                count=map.get(nums[i])+count;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }

    public static String reverseString(String str){
        int i=0,j=str.length()-1;
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        int i=0,j=0;
        while(i<(2*n)){
            int index=i%n;
            System.out.println(nums[index]);
            ans[i]=nums[index];
            i++;
        }
        return ans;
    }

    public static int[] shuffle(int[] nums, int n) {
        int i=0,j=n,k=0;
        int sizeOfNums=2*n;
        int ans[]=new int[sizeOfNums];
        while(k<sizeOfNums){
            if(k%2==0){
                ans[k]=nums[i];
                i++;
            }else{
                ans[k]=nums[j];
                j++;
            }
            k++;
        }
        //nums contains 2n elements in the nums array

        return ans;
        //return array in the form of [x1,y1,x2,y2,x3,y3,x4,y4]
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<words.length;++i){
            if(words[i].contains(String.valueOf(x))){
                list.add(i);
            }
        }
        return list;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//        minRemoveToMakeValid("lee(t(c)o)de)");
//        (((((()*)(*)*))())())
//        int students[]={1,1,0,0};
//        int sandwiches[]={0,1,0,1};
//        System.out.println(countStudents(students,sandwiches));
//        int deck[]={17,13,11,2,3,5,7};
//        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));
//        Deque<Integer>deque=new ArrayDeque<>();
//        deque.add(12);
//        deque.add(11);
//        deque.add(45);
    }
}
