class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int target) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(coin);

        sum(0,target,new ArrayList<>(),coin,l);
        return l;
    }
 public static void  sum(int idx,int target,List<Integer> ans,int coin[],List<List<Integer>> l)
    {
    if(target==0){
        l.add(new ArrayList<>(ans));
        return;
    }
    for(int i =idx;i<coin.length;i++){
        if(target>=coin[i]){
            ans.add(coin[i]);
            sum(i,target-coin[i],ans,coin,l);
            ans.remove(ans.size()-1);
        }
    }
    }



    
}