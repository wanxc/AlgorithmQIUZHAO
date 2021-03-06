#学习笔记  
Q:使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方。同学们可以将自己的思路、代码写在学习总结中。  
A:依然使用二分法，将整个半有序数组分成前后两个部分进行相应的条件判断  
##学习总结  
本周学习的东西有四个部分：  
1.分治、回溯  
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

2.深度优先搜索和广度优先搜索  
广度优先搜索完成括号生成  

深度优先、广度优先、优先级优先  
(1).深度优先搜索（DFS）使用递归或者栈实现  

(2).广度优先搜索（BFS）使用队列实现，类似于水的波纹往外泛起涟漪  

(3).启发式搜索用于各种推荐算法、高级搜索算法，更加适用于现实中的很多业务场景，例如深度学习、估价函数、搜索的整个效率  

3.贪心算法  
(1)贪心算法的难度
a.在于你怎么证明，它是可以用贪心的  
 
b.贪心的角度不一样  

有时候你可以正常用贪心
有些时候你必须把问题稍微转化一下，在进行所谓的贪心求解
或者有些时候你必须从前往后贪，这是比较常规的套路
但有些时候你可能是从后往前进行贪心
所谓贪心的套路以及证明傻贪心是可以得到最优解的过程，反而更加重要。

(2)贪心算法与动态规划  
不同在于贪心算法对每个子问题的解决方案都做出选择，不能回退。
动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。
总结  
贪心：当下做局部最优判断  
回溯：能够回退  
动态规划：最优判断+回退

4.二分查找  
前提  
a.目标函数单调性（单调递增或者单调递减）  
二分查找，只能在有序的集合进行查找，如果是无序的话就没法进行二分查找。那无序的集合怎么办，只能从头到尾遍历。
正因为是有序的，所以可以通过判断它的某些特征排除掉比如说前半部分或者排除后半部分。因此需要单调，可以单调递增，也可以单调递减。
链表的话，可以使用跳表来升维来提速。树的话，可以使用二叉搜索树。  

b.存在上下界（bounded）  
如果不存在上下界，那么它的空间可能是无穷大的，那么它没法往中间扩  

c.能够通过索引访问（index accessible）  
索引指的是可以使用下标进行访问
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

要牢记五毒神掌和四步解题法，可以将自己的思路写在代码注释里面或者是Leetcode的note模块  

