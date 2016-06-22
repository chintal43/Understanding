public class StringUniqueAllChar{

	public void  isUniqueChars(String input) {
		 boolean[] chars = new boolean[26];

		    for(int i = 0; i < input.length(); i++) {

		        if(!chars[(int)input.toUpperCase().charAt(i) - 64]) {
		            chars[(int)input.toUpperCase().charAt(i) - 64] = true;
		        }
		        else {
		            System.out.println("not unique");
		            return;
		        }
		    }

		    System.out.println("unique");
	}

	public static void main(String[] args) {
		StringUniqueAllChar test = new StringUniqueAllChar();
		test.isUniqueChars("dsfdddft");
		test.isUniqueChars("aabbccddee");
		test.isUniqueChars("abcde");
	}

}
