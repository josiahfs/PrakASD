public class RandomExample{
    public static void main(String[] args) {
        // soal no 1b (0,1,2,3)
		System.out.println((int) (Math.random() * 4));
		
		// soal no 1c (1,2,3,4,5,6)
		System.out.println((int)((Math.random() * 6) + 1));
		
		
		// soal no 1d (2,4,6,8)
		System.out.println((int)((Math.random() * 4) + 1) * 2);
		
		// soal no 1e (-5,-4,-3,...,5)
		System.out.println((int)((Math.random() * 11) - 5));
    }
}