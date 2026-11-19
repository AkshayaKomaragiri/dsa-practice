class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        int max = 0;
        boolean[] dp = new boolean[s.length()+1];
        for (String word : wordDict){
            set.add(word);
            max = Math.max(max,word.length());
        }
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++){
            boolean flag = false;
              for (int j =Math.max(0,i-max); j < i; j++){
                if (dp[j] && set.contains(s.substring(j, i))){
                    flag = true;
                    break;
                }

            }
            dp[i] = flag;

        }

    return dp[s.length()];
}
}
