class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();
        for(String ele : operations){
            if(ele.equals("C")){
                st.pop();
            }
            else if(ele.equals("D")){
                st.push(2*st.peek());
            }
            else if(ele.equals("+")){
                int last = st.pop();
                int secondlast = st.peek();
                st.push(last);
                st.push(last+secondlast);
            }else{
                st.push(Integer.parseInt(ele));
            }
        }
        int sum =0;
        while(!st.isEmpty()){
            sum+=st.pop();

        }
        return sum;
    }
}