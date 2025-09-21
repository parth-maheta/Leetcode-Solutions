class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        int n=candidates.length;
        generate(0,ans,candidates,target,n,new ArrayList<>());
        return ans;
    }
    public void generate(int ind,List<List<Integer>> ans,int[] arr,int target,int n,List<Integer> ds){
        if(ind==n){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            generate(ind,ans,arr,target-arr[ind],n,ds);
            ds.remove(ds.size()-1);
        }
        generate(ind+1,ans,arr,target,n,ds);
    }
}