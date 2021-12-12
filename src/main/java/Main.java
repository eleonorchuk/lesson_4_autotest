public class Main
{
    public static void main(String [] args){
    }

    public static double triangleSquare(long a, long b, long c) {
        long p = (a + b + c)/2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
