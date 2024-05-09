import java.util.LinkedList;

public class Test {
    public static void main(String[] args){
        LinkList<String> link = new LinkList<String>();
        link.add("ggg");
        link.add("yyt");
        link.add("vvc");
        link.add("vvbkdfjb");
//        link.print();
//        System.out.println();
//        System.out.println(link.size());
        LinkList<String> link2 = new LinkList<>();
        LinkList<Integer> link3 = new LinkList<>();
//        System.out.println(link2.isEmpty());
//        System.out.println(link.isEmpty());
//        System.out.println(link3.isEmpty());

//        link.add("54");
//        System.out.println(link.contains("54"));

//        Object[] arr = link.toArray();
//        for (int i = 0; i < arr.length; i++){
//            System.out.print( arr[i]+ " ");

//        System.out.println(link.remove("vvc"));
//        System.out.println(link.remove("ggg"));
        System.out.println(link.remove("vvbkdfjb"));
        link.print();

//        LinkedList<String> lstCheck = new LinkedList<String>();
//        lstCheck.add("ggg");
//        lstCheck.add("yyt");
//        lstCheck.add("vvc");
//        lstCheck.add("vvbkdfjb");
//
//        System.out.println(link.indexOf("vvc"));
//        System.out.println(lstCheck.indexOf("vvc"));



        }
    }
