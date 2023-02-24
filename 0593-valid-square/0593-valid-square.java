class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Double> points = new HashSet<>();
        points.add(distance(p1,p2));
        points.add(distance(p1,p3));
        points.add(distance(p1,p4));
        points.add(distance(p2,p3));
        points.add(distance(p2,p4));
        points.add(distance(p3,p4));
        return !points.contains(0.0)&&points.size()==2;
    }
     private double distance(int points1[], int points2[]){
        return Math.sqrt(Math.pow(points2[0] - points1[0], 2) +      Math.pow(points2[1] - points1[1], 2));
    }

}
