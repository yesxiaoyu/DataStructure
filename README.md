# Java数据结构容器实现

数据结构研究的是数据如何在计算机中组织和存储，使得我们可以高效地获取数据和修改数据。

我们需要根据应用场景的不同，灵活选择最合适的数据结构。

* 线性结构
> 1.数组 Array
> 
> loitering object不属于内存泄漏memory leak
> 
> 渐进复杂度分析与均摊复杂度分析Amortized Time
> 
> 增：O(n) 删：O(n) 改：已知索引O(1)、未知索引O(n) 查：已知索引O(1)、未知索引O(n)
> 
> 2.栈 Stack
> 
> 应用：系统栈、中断、括号匹配、逆波兰表达式求值
> 
> push：均摊O(1) pop：均摊O(1) getTop：O(1) getSize：O(1) isEmpty：O(1)
> 
> 3.队列 Queue
> 
> 应用：优先队列、树的层次遍历、图的广度优先搜索
> 
> * **数组队列 ArrayQueue**
> 
> enqueue：均摊O(1) dequeue：O(n) getFront：O(1) getSize：O(1) isEmpty：O(1)
> 
> * **循环队列 LoopQueue** 解决enqueue：均摊O(1)问题，**front == tail队列为空**, **(tail + 1) % c == front队列满**.
> 
> enqueue：均摊O(1) dequeue：均摊O(1) getFront：O(1) getSize：O(1) isEmpty：O(1)
> 
> 4.链表
> 
> 虚拟头结点 dummyHead
> 
> 增：O(n) 删：O(n) 改：O(n) 查：O(n)
> 
> 最简单的动态数据结构，不适用于索引有语义的情况，不支持快速查询.
> 
> 5.哈希表

* 树结构
> 1.二叉树
> 
> 2.二分搜索树
> 
> 3.平衡二叉树 AVL
> 
> 4.红黑树
> 
> 5.平衡树 Treap二叉搜索树和堆合并构成的新数据结构，所以它的名字取了Tree和Heap各一半，叫做Treap。
> 
> 6.伸展树 Splay也叫分裂树，是一种二叉排序树，它能在O(log n)内完成插入、查找和删除操作。它由丹尼尔·斯立特Daniel Sleator 和 罗伯特·恩卓·塔扬Robert Endre Tarjan 在1985年发明的。
> 
> 7.堆
> 
> 8.字典树 Trie：前缀树，解决毫秒级通讯录查询。 
> 
> 9.线段树 LeetCode相关线段树的问题208、611、277
> 
> 10.k-D树 K-D树是把K维空间中的点组织起来的空间划分数据结构，与四叉树不同的是，K-D树对空间的划分不是按照某种固定模式进行的，对空间的划分更有效。
> 
> 11.并查集
> 
> 12.哈夫曼树

* 图结构
> 1.邻接矩阵
> 
> 2.邻接表

## 算法面试需要熟练掌握的数据结构
数组、链表、栈、队列、堆、二分搜索树
## 算法竞赛需要熟练掌握的数据结构
线段树、Trie、并查集
## 代码量大，比较复杂的数据结构，需要掌握时间、空间与均摊复杂度分析amortized
平衡二叉树AVL、红黑树、哈希表

---

# TODO

* 更多数据结构
> [笛卡尔树Cartesian Tree](https://www.cnblogs.com/CaptainSlow/p/9282507.html)

---

# 参考资料

* 1.《剑指offer》
* 2.慕课网-刘宇波老师相关课程
* 3.leetcode官网
* 4.牛客网


