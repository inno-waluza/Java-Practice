class PentagonNumber{
    int n;
    public static int getPentagonalNumber(int n){
        return n * (3 * (n) - 1) / 2 ; 
    }
    public static void main(String[] args){
        System.out.print(getPentagonalNumber(2));
    }
}