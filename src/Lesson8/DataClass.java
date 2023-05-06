package Lesson8;

public class DataClass {

    public int sum(int a, int b){
        return a + b;
    }

    public boolean boolAnd(boolean a, boolean b){
        return a & b;
    }

    public boolean isStringEmpty(String str){
        return str.isEmpty();
    }

    public char charAt(String str, int position){
        if (position > str.length()){
            return ' ';
        }
        else{
            return str.charAt(position);
        }
    }
}
