# Java数据基本结构底层实现

数据结构研究的是数据如何在计算机中组织和存储，使得我们可以高效地获取数据和修改数据.

我们需要根据应用场景的不同，灵活选择最合适的数据结构.

以下为根据数据结构的四种逻辑结构，**线性结构**、**树形结构**、**关联结构**和**图形结构**进行分别的底层实现.

* 线性结构
> 1.数组 Array
> 
> > loitering object不属于内存泄漏memory leak
> > 
> > 渐进复杂度分析与均摊复杂度分析Amortized Time
> > 
> > 增：O(n) 删：O(n) 改：已知索引O(1)、未知索引O(n) 查：已知索引O(1)、未知索引O(n)
> > 
> > 适用于读多写少的问题.
> 
> 2.栈 Stack
> 
> > 应用：系统栈、中断、括号匹配、逆波兰表达式求值
> > 
> > * **数组栈 ArrayStack**
> > push：均摊O(1) pop：均摊O(1) getTop：O(1) getSize：O(1) isEmpty：O(1)
> >
> > * **链栈 LinkedStack**
> > 链栈 push：O(1) pop：O(1) getTop：O(1) getSize：O(1) isEmpty：O(1)
> 
> 3.队列 Queue
> 
> > 应用：优先队列、树的层次遍历、图的广度优先搜索
> > 
> > * **数组队列 ArrayQueue**
> > 
> > enqueue：均摊O(1) dequeue：O(n) getFront：O(1) getSize：O(1) isEmpty：O(1)
> > 
> >  * **循环队列 LoopQueue** 解决enqueue：均摊O(1)问题，**front == tail队列为空**, **(tail + 1) % c == front队列满**.
> > 
> > enqueue：均摊O(1) dequeue：均摊O(1) getFront：O(1) getSize：O(1) isEmpty：O(1)
> 
> >  * **链队列 LinkedQueue** 
> > enqueue：O(1) dequeue：O(1) getFront：O(1) getSize：O(1) isEmpty：O(1)
> 
> >  * **优先队列 PriorityQueue** 
> > enqueue：O(logn) dequeue：O(logn) getFront：O(logn) getSize：O(1) isEmpty：O(1)
> 
> 4.链表 LinkedList
> 
> > 虚拟头结点 dummyHead
> > 
> > 增：O(n) 只对链表头操作O(1) 删：O(n) 只对链表头操作O(1) 改：O(n) 查：O(n) 只对链表头操作O(1)
> > 
> > 最简单的动态数据结构，不适用于索引有语义的情况，不支持快速查询. 适用于读少写多的问题.
> 
> 5.哈希表

* 树形结构

需要考虑树是否为满二叉树？完全二叉树？二叉搜索树？平衡二叉树？空或只有一个节点也可以看做二叉树.

对于满二叉树，第h-1层有2^(h-1)个节点，0~h-1层共有2^h-1个节点. 设n为总结点数，2^h-1=n，h=log<sub>2</sub>n+1 	最后一层节点数大致等于前面所有层节点数之和. 

> 1.二叉树
> 
> > B树是一种自平衡多叉查找树. B+树是B树的一种变形，B+树的所有终端节点包含了全部有序且有指针的关键字信息. 
> > 
	B树常用于文件管理系统和数据库系统. 在算法设计时，如果遇到多路分支且有序的层次结构时，就可以考虑使用B树.  
	《算法的乐趣》
> 
> 2.二分搜索树(二叉排序树) BST Binary Search Tree / Binary Sort Tree
> 
> > 二分搜索树是二叉树，二分搜索树每个节点的值大于其左子树所有节点的值，小于其右子树节点的值，即不包含重复元素. 存储元素必须具有可比较性.
> > 
> > BST的前序遍历(先序遍历)：最自然、最常用的遍历方式. 相当于深度优先遍历.
> > 
> > BST的中序遍历：元素排序后的结果. 由此，二分搜索树也被称为排序树.
> > 
> > BST后序遍历：C++释放BST内存.
> > 
> > BST层序遍历：相当于广度优先遍历.
> > 
> > add contains remove traversal successor predecessor floor ceil(元素可能不在BST中) rank select 
> > 
> 
> 3.二叉堆
> 
> 完全二叉树、堆中某个节点的值总是不大于其父节点的值(最大堆).
> 
> 使用数组存储二叉堆. 可以使用数学归纳法证明如下等式.
> 
> 第一层为1：数组第一个元素空出来
>     parent(i) = i / 2
>     left child(i) = 2 * i
>     right child(i) = 2 * i + 1
> 第一层为0：
>     parent(i) = (i - 1) / 2
>     left child(i) = 2 * i + 1
>     right child(i) = 2 * i + 2
> 
> 更多堆：索引堆、二项堆、斐波那契堆...
> 
> add replace siftUp siftDown extractMax size isEmpty
> 
> 4.平衡二叉树 AVL
> 
> 5.红黑树
> 
> 6.平衡树 Treap二叉搜索树和堆合并构成的新数据结构，所以它的名字取了Tree和Heap各一半，叫做Treap.
> 
> 
> 7.伸展树 Splay也叫分裂树，是一种二叉排序树，它能在O(log n)内完成插入、查找和删除操作。它由丹尼尔·斯立特Daniel Sleator 和 罗伯特·恩卓·塔扬Robert Endre Tarjan 在1985年发明的。
> 
> 8.字典树 Trie：前缀树，解决毫秒级通讯录查询。 
> 
> 压缩字典树CompressedTrie 解决Trie占用空间过大的问题，但同时又带来不方便维护的另一问题：不断拼拆.
> 
> Ternary Search Tire：三分搜索树 平衡时间复杂度和空间复杂度.
> 
> 后缀树：字符串模式识别.
> 
> 更多字符串问题(子串查询)：KMP、Boyer Moore、Rabin-Karp...
> (文件压缩)：哈夫曼树 Haffman tree
> (模式匹配)：正则表达式
> (编译原理)
> (DNA)
> 
> 9.线段树(区间树) Segment Tree/interval tree : LeetCode相关线段树的问题208、611、277
> 
> 区间树是一种以区间为数据元素的红黑树，可用于求解图形之间的包含关系. 线段树不一定是满二叉树，也不一定是完全二叉树，但是一定是平衡二叉树.
> 
> 对于给定区间：
> 更新：更新一个区间的一个元素或一个区间的值
> 查询：查询一个区间[i,j]的最小值、最大值或者区间数字和
> 
> 如果区间有n个元素，数组表示需要有多少个节点？
> 最坏情况：n=2^k+1，需要4n的空间
> 
> 更新区间元素时，采用懒惰更新方式可以降低时间复杂度O(n)->O(logn). 使用lazy数组记录，再次访问每个叶子结点时再进行更新.
> 
> 更多线段树：二维线段树、(链式)动态线段树：省空间、区间操作相关另一个数据结构：树状数组BIT，Binary Index Tree.
> 
> 区间相关问题不一定需要一种数据结构，RMQ：Range Minimum Query，在区间中查询最小值
> 
> 10.k-D树 K-D树是把K维空间中的点组织起来的空间划分数据结构，与四叉树不同的是，K-D树对空间的划分不是按照某种固定模式进行的，对空间的划分更有效。
> 
> 11.并查集 Union Find
> 
> 孩子指向父亲的树结构，解决连接问题(是否属于同一个集合)Connectivity Problem、求集合中的并集操作.
> 
> Quick Find：unionElements O(n) isConnected O(1)
> 
> Quick Union：unionElements O(h)，h为树的高度 isConnected O(1)
> 
> 其他优化方案：基于size、rank的优化过程，以及路径压缩Path Compression(让树的高度尽可能地低).
> 
> 12.哈夫曼树

* 关联结构
> 1.集合Set
> 
> > 集合内的元素具有无序性、互异性和确定性. 集合的典型应用：客户统计、词汇量统计...
> > 
> > 分为有序集合、无序集合(哈希表)、多重集合...
> > 
> > add：O(h) remove：O(h) contains：O(h) getSize：O(1) isEmpty：O(1)
> > 其中h为树的深度，O(h)的最好情况为O(logn)，最坏情况为O(n)
> >
> > 基于BST的集合实现比基于链表的集合实现快很多.
> 
> 2.映射Map
> 
> > 亦可称之为字典Dictionary.
> > 
> > 分为有序映射、无序映射(哈希表)、多重映射...
> > 
> > add：O(h) remove：O(h) contains：O(h) get：O(h) set：O(h) getSize：O(1) isEmpty：O(1)
> > 其中h为树的深度，O(h)的最好情况为O(logn)，最坏情况为O(n)
> >
> > 基于BST的集合实现比基于链表的集合实现快很多.
> 

* 图形结构
> 1.邻接矩阵(二维数组)
> 
> 2.邻接表(链表、可变长数组vector)

## 算法面试需要熟练掌握的数据结构
数组、链表、栈、队列、堆、二分搜索树
## 算法竞赛需要熟练掌握的数据结构
线段树、Trie、并查集
## 代码量大，比较复杂的数据结构，需要掌握时间、空间与均摊复杂度分析amortized
平衡二叉树AVL、红黑树、哈希表

---

# TODO

* 递归实现链表的增、删、改、查.

* 更多数据结构
> [笛卡尔树Cartesian Tree](https://www.cnblogs.com/CaptainSlow/p/9282507.html)

* Java中LinkedList类的底层实现是循环双向链表.
* 数组链表：在数组中同时存储数据与索引. 适用于已知节点个数的情况，-1表示链表结束.
* 将所有数据结构的全部操作列表总结.


---

# 参考资料

* 1. 《算法笔记》、《剑指offer》、《算法的乐趣》、《算法导论》.
* 2. 慕课网-刘宇波老师相关课程
* 3. leetcode官网
* 4. 牛客网


