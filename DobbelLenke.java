class DobbelLenke<T> {
Node hode = null;
Node hale = null;
    private class Node{
        Node neste = null;
        Node forgje = null;
        T data;
        public Node(T E){
            data = E;
        }
    }
    public void settInn(T E){
        if (hode == null){
            hode = new node(E);
            hale = hode;
            return;
        }
        Node ny = new node(E);
        Node gammel = hale;
        hale = ny;
        gammel.neste = ny;
        ny.forgje = gammel;
    }

}