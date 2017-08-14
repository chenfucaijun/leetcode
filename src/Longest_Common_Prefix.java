
public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length==0) return "";
       String prefix =  strs[0];
       for(int i=1;i<strs.length;i++){
           while(strs[i].indexOf(prefix)!=0){
               prefix = prefix.substring(0,prefix.length()-1);
               if(prefix.isEmpty()){
                   return "";
               }
           }
       }
      return prefix;


    }


    public String longestCommonPrefix_VerticalScan(String[] strs) {
        if(strs==null||strs.length==0) return "";
        for(int i = 0 ;i< strs[0].length();i++){
            char ch = strs[0].charAt(i);
            for(int j  =  0 ;j<strs.length;j++){
                if(i==strs[j].length()||strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }

            }
        }

        return strs[0];


    }


    public String longestCommonPrefix_Divided_And_Conquer(String[] strs){

        if(strs==null||strs.length==0) return "";
        return longestCommonPrefix_Divided_Conquer(strs,0,strs.length-1);





    }

    //---------------------------divided and conquer start-----------------------------
    public String commonPrefix(String a,String b){
        int min  = Math.min(a.length(),b.length());
        for(int i =0;i<min;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return a.substring(0,i);
            }
        }
        return a.substring(0,min);
    }


    public String longestCommonPrefix_Divided_Conquer(String[] str,int l,int r){
        if(l==r){
            return str[l];
        }

        int mid  = (l+r)/2;
        String left= longestCommonPrefix_Divided_Conquer(str,l,mid);
        String right= longestCommonPrefix_Divided_Conquer(str,mid+1,r);
        return commonPrefix(left,right);


    }





    //---------------------------divided and conquer end-----------------------------


    public String longestCommonPrefixTest(String[] strs){
        //vertical scan search
        if(strs== null||strs.length==0){
            return  "";
        }
        for(int i =0;i<strs[0].length();i++){
            char ch  = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length()||strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }


        }



        return strs[0];

    }



}
