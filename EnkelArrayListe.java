import java.util.Iterator;

class EnkelArrayListe implements Iterable<String>{
    int teller = 0;
    int storelse;
    Object liste[];
public EnkelArrayListe(int storelse){
    this.storelse = storelse;
    liste= new Object[storelse];

}
public boolean settInn(String noe){
    if (teller != storelse){
        liste[teller] = noe;
        teller++;
        return true;
    }
    else return false;
}
class listeiterator implements Iterator<String>{
    int pos = 0;
    @Override
    public boolean hasNext() {
        return liste[pos+1] != null;

    }

    @Override
    public String next() {
        pos++;
        Object en = (liste[pos-1]);
        return en.toString();
    }

}
@Override
public Iterator<String> iterator() {
    return new listeiterator();
}
}