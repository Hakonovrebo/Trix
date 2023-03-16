import java.util.Iterator;

class EnkelArrayListe<String> implements Iterable<String>{
    int teller = 0;
    int storelse;
    String[] liste;
public EnkelArrayListe(int storelse){
    this.storelse = storelse;
    liste = new String[storelse];

}
public boolian settInn(String noe){
    if (teller != storelse){
        liste[teller] = noe;

    }
}
class listeiterator implements Iterator<String>{

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }

    @Override
    public String next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

}
@Override
public Iterator<String> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
}
}