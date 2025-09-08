class Bank {
    public int branchCount;
    public String bankName;
    public long ifscCode;
    public float interestRate;
    public double minBalance;
    public char accountType;
    public boolean netBanking;

    public Bank(int branchCount, String bankName, long ifscCode, float interestRate,
                double minBalance, char accountType, boolean netBanking) {

        System.out.println("first try=" + this.branchCount);
        System.out.println("first try=" + this.bankName);
        System.out.println("first try=" + this.ifscCode);
        System.out.println("first try=" + this.interestRate);
        System.out.println("first try=" + this.minBalance);
        System.out.println("first try=" + this.accountType);
        System.out.println("first try=" + this.netBanking);

        this.branchCount = branchCount;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.interestRate = interestRate;
        this.minBalance = minBalance;
        this.accountType = accountType;
        this.netBanking = netBanking;

        System.out.println("second try=" + this.branchCount);
        System.out.println("second try=" + this.bankName);
        System.out.println("second try=" + this.ifscCode);
        System.out.println("second try=" + this.interestRate);
        System.out.println("second try=" + this.minBalance);
        System.out.println("second try=" + this.accountType);
        System.out.println("second try=" + this.netBanking);
    }
}
