public class StringObjects {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String college = new String("Leeds Beckett University");

        // Part (a)
        String town = new String("Anytown, UK");

        int stringLength;
        String change1, change2, change3;

        // Part (b)
        stringLength = college.length();

        System.out.println(college + " contains " + stringLength + " characters.");

        // Part (c)
        change1 = college.toUpperCase();

        // Part (d)
        change2 = change1.replace('E', '*');

        // Part (e)
        change3 = college.concat(town);

        System.out.println("The final string is " + change3);
    }
}
