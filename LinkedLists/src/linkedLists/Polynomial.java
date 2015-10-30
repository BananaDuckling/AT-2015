package linkedLists;
import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial 
{
    LinkedList<TermStore> expression; 
    ListIterator<TermStore> cursor;

    public Polynomial(){
        expression = new LinkedList<TermStore>();
        cursor = expression.listIterator();
    }

    public void sort()
    {
        cursor = expression.listIterator();
        TermStore prev=cursor.next();
        TermStore next;
        while(cursor.hasNext()){
            if(cursor.next().getY() > prev.getY()){
                next=cursor.previous();
                cursor.remove();
                cursor.previous();
                cursor.add(next);
                sort();
            }
            continue;
        }
    }

    public void add(TermStore term)
    {
        if(expression.size() >= 1)
            sort();
        boolean inserted = false;
        cursor = expression.listIterator();
        TermStore existing;
        while(cursor.hasNext()){
            existing = cursor.next();
            if(existing.getY() == term.getY())
            {
                existing.setX(existing.getX()+term.getX());
                cursor.remove();
                cursor.add(existing);
                inserted = true;
                return;
            }
            if(existing.getY() < term.getY())
            {
                cursor.previous();
                cursor.add(term);
                inserted = true;
                return;
            }
        }
        if(!inserted)
            cursor.add(term);
    }

    public void add(Polynomial poly)
    {
        cursor = poly.getList().listIterator();
        while(cursor.hasNext())
            expression.add(cursor.next());
        sort();
    }

    public void multiply(TermStore term)
    {
        cursor = expression.listIterator();
        TermStore current;
        while(cursor.hasNext())
        {
            current = cursor.next();
            current.setX(current.getX() * term.getX());
            current.setY(current.getY() + term.getY());
            cursor.previous();
            cursor.remove();
            cursor.add(current);
        }
    }

    public void multiply(Polynomial poly)
    {
    	LinkedList<TermStore> newExp = new LinkedList<TermStore>();
        ListIterator<TermStore> pIter = poly.getList().listIterator();
        cursor = expression.listIterator();
        while(cursor.hasNext()){
            newExp.addLast(cursor.next());
        }
        cursor = expression.listIterator();
        LinkedList<TermStore> toAdd = new LinkedList<TermStore>();
        while(pIter.hasNext())
        {
            toAdd.addAll(multiplyTerm(pIter.next(), newExp));
            
            //reset copy of expression
            cursor = expression.listIterator();
            newExp = new LinkedList<TermStore>();
            while(cursor.hasNext()){
                newExp.addLast(cursor.next());
            }
        }
        expression = toAdd;
        sort();
    }
    public LinkedList<TermStore> multiplyTerm(TermStore poly1, LinkedList<TermStore> poly2){
        ListIterator<TermStore> newC = poly2.listIterator();
        TermStore current;
        while(newC.hasNext()){
            current = newC.next();
            current = new TermStore(current.getX() * poly1.getX(), current.getY() + poly1.getY());
            newC.remove();
            newC.add(current);
        }
        return poly2;
    }

    public LinkedList<TermStore> derivative()
    {
        LinkedList<TermStore> ret = new LinkedList<TermStore>();
        cursor = expression.listIterator();
        TermStore current;
        while(cursor.hasNext()){
            current = cursor.next();
            if(current.getY() != 0){
                ret.add(new TermStore(current.getY()*current.getX(), current.getY()-1));
            }

        }
        return ret;
    }

    public LinkedList<TermStore> getList()
    {
        return expression;
    }

    //@override
    public String toString()
    {
        cursor = expression.listIterator();
        TermStore thing = cursor.next();
        String retString = thing.toString();

        while(cursor.hasNext()){
            thing = cursor.next();
            retString += " + "+thing.toString();
        }
        return retString;
    }

}