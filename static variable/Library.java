class Library {
    public int bookCount;
    public String libraryName;
    public long registerNo;
    public float lateFee;
    public double membershipFee;
    public char section;
    public boolean digitalAccess;

    public Library(int bookCount, String libraryName, long registerNo, float lateFee,
                   double membershipFee, char section, boolean digitalAccess) {

        System.out.println("first try=" + this.bookCount);
        System.out.println("first try=" + this.libraryName);
        System.out.println("first try=" + this.registerNo);
        System.out.println("first try=" + this.lateFee);
        System.out.println("first try=" + this.membershipFee);
        System.out.println("first try=" + this.section);
        System.out.println("first try=" + this.digitalAccess);

        this.bookCount = bookCount;
        this.libraryName = libraryName;
        this.registerNo = registerNo;
        this.lateFee = lateFee;
        this.membershipFee = membershipFee;
        this.section = section;
        this.digitalAccess = digitalAccess;

        System.out.println("second try=" + this.bookCount);
        System.out.println("second try=" + this.libraryName);
        System.out.println("second try=" + this.registerNo);
        System.out.println("second try=" + this.lateFee);
        System.out.println("second try=" + this.membershipFee);
        System.out.println("second try=" + this.section);
        System.out.println("second try=" + this.digitalAccess);
    }
}
