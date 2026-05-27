package Lab1;

public class main {
    public static void main(String[] args) {
        Playlist list = new Playlist();
        list.addToFront(new Song("Never Gonna Give You Up", "When you need somebody", "Rick Astley"));
        list.playAll();
        list.addToFront(new Song("Forever Young","67","Alphaville"));
        list.addToEnd(new Song("Dark Side of the Moon", "6","7"));
        list.playAll();
        System.out.println(list.size());
        list.removeSong("Dark Side of the Moon");
        list.playAll();
    }
}
