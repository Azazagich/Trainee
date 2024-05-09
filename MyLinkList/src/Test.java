import java.util.LinkedList;

public class Test {
    public static void main(String[] args){
        LinkList<String> link = new LinkList<String>();
        System.out.println(link.add("ggg"));
        System.out.println(link.add("yyt"));
        link.add("vvc");
        link.add("vvbkdfjb");
        link.print();
        System.out.println();
        System.out.println(link.size());
        LinkList<String> link2 = new LinkList<>();
        LinkList<Integer> link3 = new LinkList<>();
        System.out.println(link2.isEmpty());
        System.out.println(link.isEmpty());
        System.out.println(link3.isEmpty());
    }
}