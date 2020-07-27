#学习笔记  
Q:树的面试解法一般都是递归，为什么?  
A:代码本身和树的定义没有所谓的后继结构，或者说是一个便于循环的结构，而更多的是左节点和右节点，这样的话，要去访问它的字树的话，更好的方式是直接对它的左节点再调用相同的遍历函数。  
##总结  
题量对自己来说，实在有些大。所以只能慢慢来，不要太着急，把题好好练。做不完不要紧，但是为了赶进度，匆匆忙忙刷题，那就真的是得不偿失了。  
本周学习的东西有三部分：  
1.树、二叉树、二叉搜索树  
链表就是特殊化的树，链表有两个next指针就是树  
树是特殊化的图，即没有环的图就是树  
二叉搜索树的定义，根节点大于左子节点，小于右子节点。另外二叉搜索树的中序遍历是升序的。  

2.堆、二叉堆、图  

3.是泛型递归、树的递归  
递归写得不好的话，时间复杂度稍高，可以将它们运算过程中的中间结果记录下来，以节省运算时间。  
递归模板  
```public void recur(int level,int param){
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

另外，在刷题的过程中，如果不能关联到相关的数据结构和算法，也可以考虑通过数学归纳法得出它们的递推公式，从而解答。 

