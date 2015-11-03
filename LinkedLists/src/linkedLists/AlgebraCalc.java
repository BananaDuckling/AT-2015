package linkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class AlgebraCalc {

    public static void main(String[] args) {
        Polynomial s = new Polynomial();
        s.add(new TermStore(2, 6));
        s.add(new TermStore(4, 4));
        s.add(new TermStore(5, 4));
        s.add(new TermStore(2, 3));
        
        System.out.println("s: " + s);
        Polynomial q = new Polynomial();
        
        q.add(new TermStore(2, 2));
        q.add(new TermStore(1, 2));
        q.add(new TermStore(5, 3));
        System.out.println("q: " + q);
        s.multiply(q);
        System.out.println("s * q: "+s.toString());
        
        System.out.println();
        Polynomial p = new Polynomial();
        p.add(new TermStore(6, 5));
        p.add(new TermStore(2,5));
        p.add(new TermStore(3, 4));
        System.out.println("P: "+p.toString());
        
        //derivative of p
        System.out.println();
        System.out.println("deriv of p: "+p.derivative());
    }

}