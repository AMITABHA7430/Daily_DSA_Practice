class Solution {
    public int compress(char[] chars) {
        
       int a=0;
       int b=0;

       while(a<chars.length){

            char c=chars[a];
            int count=0;

            while(a<chars.length&&chars[a]==c){
                a++;
                count++;

            }
            chars[b++]=c;
            if(count>1){
                String num=String.valueOf(count);
                for(char m:num.toCharArray()){
                    chars[b++]=m;
                }
            }
       }

    return b;
    }
}
