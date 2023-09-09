class Bank {
    long[]bb;
    public Bank(long[] balance) {
        bb=balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1>bb.length||account2>bb.length)return false;
        if(bb[account1-1]<money){
            return false;
        }
        bb[account1-1]-=money;
        bb[account2-1]+=money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account>bb.length)return false;
        bb[account-1]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account>bb.length||bb[account-1]-money<0)return false;
        bb[account-1]-=money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */