import ArrayList;

public class Array
{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> li = new ArrayList<>();

        li.add("Mani");
        li.add("Sunny");
        li.add("Avay");
        li.add("Sandip");


        ListIterator<String> list1 = li.listIterator(li.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }
    }
}
        
//         //add elements
//         list.add(0);
//         list.add(1);
//         list.add(2);

//         System.out.println(list);

//         //get elements
//         //int element = list.get(0);
//         System.out.println(list.get(0));

//         //add elements in between
//         list.add(1,3);
//         System.out.println(list);   
        
//         //set elements
//         list.set(0,10);
//         System.out.println(list);

//         //delete elements
//         list.remove(2);
//         System.out.println(list);

//         //size of array list
//         int size = list.size();
//         System.out.println(size);

//         //loops
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" ");
//         }
//         System.out.println();

//         //sorting
//         Collections.sort(list);
//         System.out.println(list);
//     }
// }