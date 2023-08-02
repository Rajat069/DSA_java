class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) {
            return points.length;
        }

        int maxC = 1;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[j][0] == points[i][0]) {  //special case where x cordinates are same hence to avoid / by zero we count the no of same x cordinates Example points: [[1,1], [2,1], [3,1], [3,2]]
/*
If we calculate the slope for any two points with the same x-coordinate, we will get a division by zero error:

Slope between points [1,1] and [2,1]: (1 - 1) / (2 - 1) = 0/1 = 0
Slope between points [2,1] and [3,1]: (1 - 1) / (3 - 2) = 0/1 = 0
As you can see, the slope between any two points with the same x-coordinate will always be 0 (or undefined). Therefore, in this specific case, we cannot calculate the slope as we would do in the else part of the code. Instead, we consider these points as part of the same line segment and count them in the variable c.
*/
                    int c = 2;
                    for (int q = j + 1; q < points.length; q++) {
                        if (points[q][0] == points[i][0]) {
                            c++;
                        }
                    }
                    maxC = Math.max(maxC, c);
                } else {  //normal cases where we calculate slope and find rest of the points with same slope
                    double slope = (double) (points[j][1] - points[i][1]) / (double) (points[j][0] - points[i][0]);
                    int c = 2;
                    for (int q = j + 1; q < points.length; q++) {
                        if (points[q][0] == points[i][0]) {  // same x cordintates
                            continue;
                        }
                        double temp = (double) (points[q][1] - points[i][1]) / (double) (points[q][0] - points[i][0]);
                        if (temp == slope) {
                            c++;
                        }
                    }
                    maxC = Math.max(maxC, c);
                }
            }
        }
        return maxC;
    }
}
