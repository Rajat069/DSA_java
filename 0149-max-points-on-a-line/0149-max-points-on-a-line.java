class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) {
            return points.length;
        }

        int maxC = 1;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[j][0] == points[i][0]) {
                    int c = 2;
                    for (int q = j + 1; q < points.length; q++) {
                        if (points[q][0] == points[i][0]) {
                            c++;
                        }
                    }
                    maxC = Math.max(maxC, c);
                } else {
                    double slope = (double) (points[j][1] - points[i][1]) / (double) (points[j][0] - points[i][0]);
                    int c = 2;
                    for (int q = j + 1; q < points.length; q++) {
                        if (points[q][0] == points[i][0]) {
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
