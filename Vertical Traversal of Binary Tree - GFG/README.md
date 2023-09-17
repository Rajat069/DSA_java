# Vertical Traversal of Binary Tree
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Binary Tree, find the vertical traversal of it starting from the leftmost level to the rightmost level.<br>
If there are multiple nodes passing through a vertical line, then they should be printed as they appear in <strong>level order</strong> traversal of the tree.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
           1
         /   \
       2       3
     /   \   /   \
   4      5 6      7
              \      \
               8      9           
</span><span style="font-size:18px"><strong>Output: </strong>
4 2 1 5 6 3 8 7 9 
<strong>Explanation:</strong></span>
<img alt="" src="https://media.geeksforgeeks.org/img-practice/ScreenShot2021-05-28at3-1622541589.png"><ocid-button-p class="ocid-button-p" id="downloadButton_https://media.geeksforgeeks.org/img-practice/ScreenShot2021-05-28at3-1622541589.png__0"><ocidbutton class="ocid-dl-button-1-1 ocid-dl-button-1-8 ocid-dl-button-5-1 ocid-dl-button-1-4 ocid-dl-button-1-9 ocid-dl-button-5-2"><svg aria-hidden="true" focusable="false" data-prefix="fas" data-icon="arrow-down" class="svg-inline--fa fa-arrow-down fa-w-14 " role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path fill="currentColor" d="M413.1 222.5l22.2 22.2c9.4 9.4 9.4 24.6 0 33.9L241 473c-9.4 9.4-24.6 9.4-33.9 0L12.7 278.6c-9.4-9.4-9.4-24.6 0-33.9l22.2-22.2c9.5-9.5 25-9.3 34.3.4L184 343.4V56c0-13.3 10.7-24 24-24h32c13.3 0 24 10.7 24 24v287.4l114.8-120.5c9.3-9.8 24.8-10 34.3-.4z"></path></svg></ocidbutton></ocid-button-p>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
&nbsp;      </strong>1
 &nbsp; &nbsp;/&nbsp;&nbsp;&nbsp; \
 &nbsp; 2&nbsp; &nbsp; &nbsp;  3
 /&nbsp;&nbsp;  \&nbsp; &nbsp; &nbsp;&nbsp;\
4&nbsp; &nbsp;  &nbsp;5&nbsp; &nbsp;  &nbsp;6
<strong>Output: </strong>4 2 1 5 3 6<strong>
</strong></span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>verticalOrder()&nbsp;</strong>which takes the root node as input parameter and returns an array containing&nbsp;the vertical order traversal of the tree from the leftmost to the rightmost level. If 2 nodes lie in the same vertical level, they should be printed in the order they appear in the level order traversal of the tree.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 3*10<sup>4</sup></span></p>
</div>