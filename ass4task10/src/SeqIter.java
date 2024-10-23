import java.util.List;

public class SeqIter implements Iterator {
    private List<Song> songs;
    private int pos;

    public SeqIter(List<Song> songs) {
        this.songs = songs;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < songs.size();
    }

    @Override
    public Song next() {
        return hasNext() ? songs.get(pos++) : null;
    }
}
