package Java_Advanced_Lab.Day4.Assignment33;

public class StringMock {
    String capacity;
    public StringMock(){

    }
    public StringMock(String capacity){
        this.capacity = capacity;
    }
    @Deprecated
    public static int search(String string, char searchItem){
        int index;
        char[] charArray= string.toCharArray();
        for (index = 0; index < charArray.length; index++) {
            if(charArray[index]==searchItem)
                return index;
        }
        return -1;
    }
}
class TestStringMock{
    public static void main(String[] args) {
        String message = "What's in the name";
        StringMock stringMock = new StringMock();
        System.out.println(stringMock.search(message,'a'));
    }
}