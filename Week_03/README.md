#学习笔记  
Q:使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方。同学们可以将自己的思路、代码写在学习总结中。  
A:   
##学习总结  
本周学习的东西有四个部分：  
1.分治、回溯  
  
2.深度优先搜索和广度优先搜索  
广度优先搜索完成括号生成  

3.贪心算法  

4.二分查找  
二分查找Java代码模板  
```  
public int binarySearch(int[] array, int target){
        int left = 0,right =array.length-1,mid;
        while(left<=right){
            mid =(right-left)/2+left;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    } 
```  
  
## 刷题情况  
| 题号 |           题目           | 难度  | 遍数 | 解法 | 复杂度 |
| :--: | :----------------------: | :---: | :--: | :--: | :----: |
| 26   | 删除排序数组中的重复项   | 简单  |  1   | 暴力 |   O(n) |
| 94   |    二叉树的中序遍历      | 中等  |  1   | 暴力 |   O(n) |
| 283  |          移动零          | 简单  |  1   | 暴力 |   O(n) |
| 11  |     盛最多水的容器        | 中等  |  1   | 暴力 |   O(n) |
 
