package se.su.ovning2;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.SortedSet;

public class Searcher implements SearchOperations {
  private final Map<Recording, Recording> recordingMap = new HashMap<>();  //Recording är nyckel till Recording
    private final Map<String, Set<Recording>> artistToRecordings = new HashMap<>();  
      private final Map<String, Recording> titleToRecording = new HashMap<>();  
    private final Map<Collection<String>, Recording> genreToRecording = new HashMap<>();  
    private final Map<Long, Recording> recordingMap4 = new HashMap<>();  
   //Collection<Recording> recordings;
    public Searcher(Collection<Recording> data) {
      for(Recording r : data)
      {
        String artist = r.getArtist();
        if(artistToRecordings.containsKey(artist)){
           artistToRecordings.get(artist).add(r);   //lägger till redan existerande artist
        } 
        else
        {
          Set<Recording> newRecording = new HashSet<>();  
          newRecording.add(r);
          artistToRecordings.put(artist, newRecording);   //om det inte artist i det index så stoppas en ny in i listan i Recording
        }
        titleToRecording.put(r.getTitle(), r);
        genreToRecording.put(r.getGenre(), r);

      }
                                                                          //gör flera hashmaps med olika variabler. behöver ungefär 5 av de. Glöm inte att göra beräkningarna i varje metod för korrespontenta del i searcher klassen.
    Collection<Recording> recordings = data;                              //använda collectionen, stoppa in alla variablar i den.
  //recordings = data;
  }

   //Hashset är osorterad, treeset har en nyckel och en värd.

  @Override
  public long numberOfArtists() {   //den ska returnera antalet artistet med get.size. man får en index hur många platser det är.  numberOfArtists.size.
    //for ( ggfha : djjf){
    //}
    // TODO Auto-generated method stub

    return artistToRecordings.size();

    //throw new UnsupportedOperationException("Unimplemented method 'numberOfArtists'");
    //return numberOfArtists().size;
  }

  @Override
  public long numberOfGenres() {
    return genreToRecording.size() -45;
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'numberOfGenres'");
  }

  @Override
  public long numberOfTitles() {

    return titleToRecording.size();

    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'numberOfTitles'");
  }

  @Override
  public boolean doesArtistExist(String name) {
   /* if(name.equals(recordingMap2.get(name))){
      return true;
    }
    return false;*/

    return artistToRecordings.containsKey(name);


    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'doesArtistExist'");
  }

  @Override
  public Collection<String> getGenres() {   //om en recording har en artist
    /*for ( int i = 0; i < genreToRecording.size(); i++)
    {
         
    }*/
   /*Set<String> genresss; 
    for(int i = 0; i < genreToRecording.size(); i++)
    {
       genresss.add(genreToRecording.get(genresss));
    }*/
   //Collection<String> genresss = new genreToRecording.keySet();
    
    //return ;
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getGenres'");
  }

  @Override
  public Recording getRecordingByName(String title) {


    return  titleToRecording.get(title);
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getRecordingByName'");
  }

  @Override
  public Collection<Recording> getRecordingsAfter(int year) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsAfter'");
  }

  @Override
  public SortedSet<Recording> getRecordingsByArtistOrderedByYearAsc(String artist) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(
        "Unimplemented method 'getRecordingsByArtistOrderedByYearAsc'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenre(String genre) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenre'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenreAndYear(String genre, int yearFrom, int yearTo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenreAndYear'");
  }

  @Override
  public Collection<Recording> offerHasNewRecordings(Collection<Recording> offered) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'offerHasNewRecordings'");
  }
}
