// Last updated: 9/3/2026, 3:05:47 PM
1class Solution {
2    public String numberToWords(int num) {
3    if(num == 0)
4        return "Zero";
5    String[] bigString = new String[]{"Thousand","Million","Billion"};
6    String result =  numberToWordsHelper(num%1000);
7    num = num/1000;
8    if(num > 0 && num%1000>0){
9        result = numberToWordsHelper(num%1000) + "Thousand " + result;
10    }
11    num = num/1000;
12    if(num > 0 && num%1000>0){
13        result = numberToWordsHelper(num%1000) + "Million " + result;
14    }
15    num = num/1000;
16    if(num > 0){
17        result = numberToWordsHelper(num%1000) + "Billion " + result;
18    }
19    return result.trim();
20}
21
22public String numberToWordsHelper(int num){
23    String[] digitString = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
24    String[] teenString = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};
25    String[] tenString = new String[]{"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
26    String result = "";
27    if(num > 99){
28        result += digitString[num/100] + " Hundred ";
29    }
30    num = num % 100;
31    if(num < 20 && num > 9){
32        result += teenString[num%10]+" ";
33    }else{
34        if(num > 19){
35            result += tenString[num/10]+" ";
36        }
37        num = num % 10;
38        if(num > 0)
39            result += digitString[num]+" ";
40    }
41    return result;
42}
43}