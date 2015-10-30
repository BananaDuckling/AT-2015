package linkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class AlgebraCalc {

    public static void main(String[] args) {
        Polynomial s = new Polynomial();
        s.add(new TermStore(2, 6));
        s.add(new TermStore(4, 4));
        s.add(new TermStore(5, 4));
        System.out.println("s: " + s);
        Polynomial q = new Polynomial();
        q.add(new TermStore(2, 2));
        q.add(new TermStore(1, 2));
        System.out.println("q: " + q);
        s.multiply(q);
        System.out.println(s.toString());
        
        s = new Polynomial();
        s.add(new TermStore(6, 5));
        s.add(new TermStore(2,5));
        s.add(new TermStore(3, 4));
        s.add(q);
        System.out.println(s.derivative());
        System.out.println(s.toString());
    }

}