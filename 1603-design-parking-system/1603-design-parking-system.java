class ParkingSystem {
    int[] canPark = new int[3];
    HashMap<Integer,Integer>hm=new HashMap<>();
    public ParkingSystem(int big, int medium, int small) {
         canPark[0]=big;
         canPark[1]=medium;
         canPark[2]=small;
         for(int i=1;i<=3;i++){
             hm.put(i,0);
         }
    }
    
    public boolean addCar(int carType) {
        if(canPark[carType-1]>hm.get(carType)){
            hm.put(carType,hm.get(carType)+1);
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */