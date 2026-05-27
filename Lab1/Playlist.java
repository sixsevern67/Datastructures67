package Lab1;

public class Playlist {
    private SongNode head;
    private int size;

    public Playlist() {
        this.head = null;
        this.size = 0;
    }

    public void addToFront(Song song) {
        SongNode newNode = new SongNode(song);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addToEnd(Song song) {
        if (head != null) {
            SongNode node = head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new SongNode(song);
        } else {
            head = new SongNode(song);
        } 
        size++;
    }

    public Song removeFirst() {
        if (head != null){    
            Song bad = head.data;
            head = head.next;
            size--;
            return bad;
        } else {
            return null;
        }
    }

    public void playAll() {
        System.out.print("[");
        SongNode node = head;
        while (node != null) {
            System.out.print(node.data + "; ");
            node = node.next;
        }
        System.out.println("]");
    }

    public int size() {
        return size;
    }

    public void removeSong(String name) {
        if (head == null) {return;}
        if (head.data.name.equals(name)) {
            head = head.next;
            size--;
            return;
        }
        SongNode prev = head;
        SongNode node = head.next;
        while (node != null) {
            if (node.data.name.equals(name)) {
                prev.next = node.next;
                size--;
                return;
            }
            prev = node;
            node = node.next;
        }
    }
}