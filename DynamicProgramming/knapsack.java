public static int knapsack(int[] weight,int[] p,int i,int j)
{
    if(i==0)
    {
        if(weight[0]<=j)
        {
            return p[0];
        }
        else 
        {
            return 0;
        }
    }
    int not_take= 0+knapsack(weight,p,i-1,j); 
    int take=0;
    if(weight[i]<=j)
    {
        take=p[i]+knapsack(weight,p,i-1,j-weight[i]);
    } 
    return Math.max(take,not_take);
}
