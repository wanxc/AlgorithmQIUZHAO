学习笔记  
动态规划  
自底向上  
1.递归 2.递归+记忆化搜索  
自顶向下  
1.动态规划 2.状态压缩  
难点在于如何想出动态规划方程  
递归模板  
```
public void recur(int level,int param){
	int MAX_LEVEL;
	int newParam;
	//terminal
	if(level>MAX_LEVEl){
		//process result
		return;
	}
	//process current logic
	process(level,param);
	//drill down
	recur(level:level+1,newParam);
	//restore current status
}
public static void process(int level,int param){

}  
```  

分治Java代码模板  
```  
private static int divide_conquer(Problem problem, ) {
  
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}

```  
DP例题解析
Fibonacci数列  
存在大量的重复计算，使用数组将中间结果存储来，提高效率  
使用记忆化搜索，可以让指数级的时间复杂变成O(n^2)的时间复杂度

 