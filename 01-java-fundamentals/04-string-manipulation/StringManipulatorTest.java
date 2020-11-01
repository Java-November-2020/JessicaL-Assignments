public class StringManipulatorTest {
    public static void main(String[] args){
        // trim and concatenate
        StringManipulator manipulator1 = new StringManipulator();
        String str= manipulator1.trimAndConcat("    Hello    ", "   world   ");
        System.out.println(str);
        

        //getIndexOrNull(String, char)
        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        String a = manipulator2.getIndexOrNull("Coding", letter);
        String b = manipulator2.getIndexOrNull("Hello World", letter);
        String c = manipulator2.getIndexOrNull("Hi", letter);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        String aa = manipulator3.getIndexOrNull(word, subString);
        String bb = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(aa);
        System.out.println(bb);

        //conCatSubstring(String, int, int, String) 
        StringManipulator manipulator = new StringManipulator();
        String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1);
    }



}
