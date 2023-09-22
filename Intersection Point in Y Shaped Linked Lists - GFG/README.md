# Intersection Point in Y Shaped Linked Lists
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given two singly linked lists of size <strong>N</strong> and <strong>M, </strong>write a program to get the point where two linked lists intersect each other.</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
LinkList1 = 3-&gt;6-&gt;9-&gt;common
LinkList2 = 10-&gt;common
common = 15-&gt;30-&gt;NULL
<strong>Output: 1</strong>5
<strong>Explanation:
</strong><img class="aligncenter size-full wp-image-2753" style="height: 334px; width: 388px;" title="Y ShapedLinked List" src="https://contribute.geeksforgeeks.org/wp-content/uploads/linked.jpg" alt="Y ShapedLinked List"><ocid-button-p class="ocid-button-p" id="downloadButton_https://contribute.geeksforgeeks.org/wp-content/uploads/linked.jpg__0"><ocidbutton class="ocid-dl-button-1-1 ocid-dl-button-1-8 ocid-dl-button-7-1 ocid-dl-button-1-4 ocid-dl-button-1-9 ocid-dl-button-7-2"><svg aria-hidden="true" focusable="false" data-prefix="fas" data-icon="arrow-down" class="svg-inline--fa fa-arrow-down fa-w-14 " role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path fill="currentColor" d="M413.1 222.5l22.2 22.2c9.4 9.4 9.4 24.6 0 33.9L241 473c-9.4 9.4-24.6 9.4-33.9 0L12.7 278.6c-9.4-9.4-9.4-24.6 0-33.9l22.2-22.2c9.5-9.5 25-9.3 34.3.4L184 343.4V56c0-13.3 10.7-24 24-24h32c13.3 0 24 10.7 24 24v287.4l114.8-120.5c9.3-9.8 24.8-10 34.3-.4z"></path></svg></ocidbutton></ocid-button-p></span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: 
</strong>Linked List 1 = 4-&gt;1-&gt;common
Linked List 2 = 5-&gt;6-&gt;1-&gt;common
common = 8-&gt;4-&gt;5-&gt;NULL
<strong>Output: </strong>8
<strong>Explanation: </strong></span>

<span style="font-size: 18px;"><strong>4              5</strong></span>
<span style="font-size: 18px;"><strong>|              |</strong></span>
<span style="font-size: 18px;"><strong>1              6
</strong></span><span style="font-size: 18px;"><strong> \             /</strong></span>
<span style="font-size: 18px;"><strong>  8   -----  1 </strong></span>
   <strong>|</strong>
   <strong>4</strong>
   <strong>|
</strong><span style="font-size: 18px;"><strong>  5</strong></span>
<span style="font-size: 18px;"><strong>  |</strong></span>
<span style="font-size: 18px;"><strong>  NULL       </strong></span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read input or print anything. The task is to complete the function <strong>intersetPoint</strong>() which takes the pointer to the head of linklist1(<strong>head1</strong>) and linklist2(<strong>head2</strong>) as input parameters and&nbsp;returns data value of a node where two linked lists intersect. If linked list do not merge at any point, then it should&nbsp;return <strong>-1</strong>.</span><br><span style="font-size: 18px;"><strong>Challenge </strong>: Try to solve the problem without using any extra space.</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong>&nbsp;O(N+M)<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N + M ≤&nbsp;2*10<sup>5</sup><br>-1000&nbsp;≤&nbsp;value ≤&nbsp;1000</span></p>
<p>&nbsp;</p></div>