class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> list = new ArrayList<>();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++){            
            if (s1.charAt(i) != s2.charAt(i)){
                str1.append(s1.charAt(i));
                str2.append(s2.charAt(i));
            }
            else{
                if (str1.length()>0 && str2.length()>0){              
                List<String> row = new ArrayList<>();
                row.add(str1.toString());
                row.add(str2.toString());
                list.add(row);
                str1.setLength(0);
                str2.setLength(0);
                seg = false;
            }
                
            }
           
        }
        if (str1.length()>0 && str2.length()>0){
            List<String> row = new ArrayList<>();
                row.add(str1.toString());
                row.add(str2.toString());
                list.add(row);
        }

        return list;
        
    }
}
