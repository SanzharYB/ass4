public class ddMain {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.add(new Song("Song 1", "Artist A", "Pop"));
        playlist.add(new Song("Song 2", "Artist B", "Rock"));
        playlist.add(new Song("Song 3", "Artist C", "Pop"));
        playlist.add(new Song("Song 4", "Artist D", "Jazz"));

        System.out.println("Sequential Playback:");
        Iterator seqIter = playlist.getSeqIter();
        while (seqIter.hasNext()) {
            System.out.println(seqIter.next());
        }

        System.out.println("\nShuffled Playback:");
        Iterator shuffleIter = playlist.getShuffleIter();
        while (shuffleIter.hasNext()) {
            System.out.println(shuffleIter.next());
        }

        System.out.println("\nFiltered Playback (Pop):");
        Iterator genreIter = playlist.getGenreIter("Pop");
        while (genreIter.hasNext()) {
            System.out.println(genreIter.next());
        }
    }
}
