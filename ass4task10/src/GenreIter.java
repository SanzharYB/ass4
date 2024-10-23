import java.util.ArrayList;
import java.util.List;

public class GenreIter implements Iterator {
    private List<Song> songs;
    private List<Song> filteredSongs;
    private int pos;

    public GenreIter(List<Song> songs, String genre) {
        this.songs = songs;
        filteredSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                filteredSongs.add(song);
            }
        }
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < filteredSongs.size();
    }

    @Override
    public Song next() {
        return hasNext() ? filteredSongs.get(pos++) : null;
    }
}
