package take1;

public class Task {
    public static void main(String[] args) {
        String[] array ={"apple" , "banana" , "orange" , "watermelon" , "mango" , "litchi"};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].compareToIgnoreCase(array[j])>0){
                    String temp = array[i];
                    array[i]= array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
