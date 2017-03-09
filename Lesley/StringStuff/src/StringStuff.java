
public class StringStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num1=5;
         String name="ICS 3U";
         System.out.println(name.length()*num1);
         System.out.println(name.charAt(2)+name.charAt(4)+name.charAt(0));
         //.indexof and .lastindexof
         
         name="St.Patrick's High School";
         System.out.println(name.lastIndexOf("o"));
         System.out.println(name.substring(6));
	}

}
