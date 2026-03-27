1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<String> stk = new Stack<>();
4
5        for(int i = 0 ; i < tokens.length ; i++){
6            String s = tokens[i];
7            char ch = s.charAt(s.length() - 1);
8            // boolean pop = false ;
9
10            if(ch == '+' || ch == '-' || ch=='*' || ch=='/'){
11                if( !stk.isEmpty() ){
12                    // pop=true;
13                    int n2 = Integer.valueOf(stk.pop());
14                    if(!stk.isEmpty()){
15                        int n1 =  Integer.valueOf(stk.pop()) ;
16                        if(ch == '+'){
17                            String op = Integer.toString(n1+n2); 
18                            stk.push(op);
19                        }else if(ch == '-'){
20                            String op = Integer.toString(n1-n2); 
21                            stk.push(op);
22                        }else if(ch == '*'){
23                            String op = Integer.toString(n1*n2); 
24                            stk.push(op);
25                        }else{
26                            String op = Integer.toString(n1/n2); 
27                            stk.push(op);
28                        }
29                    } 
30                }
31            }else{
32                stk.push(s);
33            }
34
35        }
36
37        return Integer.valueOf(stk.pop());
38    }
39    
40}