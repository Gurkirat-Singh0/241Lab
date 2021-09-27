package Lab;
public class HashTable{

    private String[] table;
    private String[] tablev;

    public HashTable(int size){
        table = new String[size];        
    }

    public void insert(String key, String value){
        int index = 0;
        for(int i = 0; i < key.length(); i ++){
            index = (int)key.charAt(i) % table.length;
        }
    }
    public static void main(String args[]){
        
    }
}
