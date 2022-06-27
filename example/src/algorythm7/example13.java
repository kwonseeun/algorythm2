package algorythm7;

import java.util.Comparator;
import java.util.PriorityQueue;

class example13
{
    public static class Item{
        int val1, val2;
        Item(int val1, int val2){
            this.val1 = val1;
            this.val2 = val2;
        }
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        // 생성 및 정렬
        PriorityQueue<Item> queue = new PriorityQueue<>(new Comparator<Item>(){
            public int compare(Item i1, Item i2){
                if(i1.val1 == i2.val1){
                    return Integer.compare(i1.val2, i2.val2);
                }else
                    return Integer.compare(i1.val1, i2.val1);
            }
        });
        
        queue.add(new Item(4, 3));
        queue.add(new Item(3, 6));
        queue.add(new Item(4, 8));
        queue.add(new Item(1, 1));

    }
}