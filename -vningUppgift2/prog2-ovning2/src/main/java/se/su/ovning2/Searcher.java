package se.su.ovning2;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.SortedSet;

public class Searcher implements SearchOperations {
  private final Map<Recording, Recording> recordingMap = new HashMap<>();  //Recording är nyckel till Recording
    private final Map<String, Set<Recording>> artistToRecordings = new HashMap<>();  //String är nyckel till en massa Recordings/Set<Recording>
      private final Map<String, Recording> titleToRecording = new HashMap<>();  
    private final Map<String, Set<Recording>> genreToRecording = new HashMap<>();  
    private final TreeMap<Integer, Set<Recording>> yearToRecording = new TreeMap<>();  
  private final Map<String, Recording> typeToRecording = new HashMap<>();  
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


        for ( String genre : r.getGenre())
        {
        if(genreToRecording.containsKey(genre)){
          genreToRecording.get(genre).add(r);
        }
        else{
          Set<Recording> newRecordings= new HashSet<>();
          newRecordings.add(r);
          genreToRecording.put(genre, newRecordings);
        }
        }


        int year = r.getYear();
        if(yearToRecording.containsKey(r.getYear())){
          yearToRecording.get(year).add(r);
        }
        else{
          Set<Recording> newRecordings= new HashSet<>();
          newRecordings.add(r);
          yearToRecording.put(year, newRecordings);
        }

        typeToRecording.put(r.getType(), r);

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
    return genreToRecording.size();
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
    
    return genreToRecording.keySet();  //tar ut alla nycklar i mappen och tar ut det som en Set
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getGenres'");
  }

  @Override
  public Recording getRecordingByName(String title) {


    return  titleToRecording.get(title);
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getRecordingByName'");
  }

  @Override
  public Collection<Recording> getRecordingsAfter(int year) {
    Collection<Recording> all = new HashSet<>();
    for( Collection<Recording> thisYear : yearToRecording.tailMap(year).values())  //den här värdet och alla värden efter som en ny map
      {
       all.addAll(thisYear);
    }
    return all;
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getRecordingsAfter'");
  }

  @Override
  public SortedSet<Recording> getRecordingsByArtistOrderedByYearAsc(String artist) {
   SortedSet<Recording> all1 = new TreeSet<>();
   //all1.addAll((artistToRecordings.get(artist)));
    if(yearToRecording.get(artist) == null){
    return all1;
    }
    for (Recording thisAll : yearToRecording.get(artist)){
      all1.add(thisAll);
    }
    return all1;

   //return all1;
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByArtistOrderedByYearAsc'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenre(String genre) {
       /*  Collection<Recording> all = new HashSet<>();
    for( Collection<Recording> thisYear : yearToRecording.values())  //den här värdet och alla värden efter som en ny map
      {
       all.addAll(thisYear);
    }*/
    //return genreToRecording.get(genre);
    if(genreToRecording.get(genre) == null){
    return new HashSet<Recording>();
    }
    return genreToRecording.get(genre);
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenre'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenreAndYear(String genre, int yearFrom, int yearTo) {
    Collection<Recording> all1 = new HashSet<>();
     Collection<Recording> all2 = new HashSet<>();
    for (int i = yearFrom; i <= yearTo; i++){
      //if(genreToRecording.get(genre) != null){

      if(yearToRecording.get(i) != null){
        all1.addAll(yearToRecording.get(i));
      }
    }
    //Hur vi ska få rätt genrer genom att ta bort fel genrer
for (Recording i : all1) {
if (i.getGenre().contains(genre)) {
all2.add(i);

}
} 
    genreToRecording.get(genre);

    return all2;
    /*   if(genreToRecording.get(genre) == null || r.getYear() && yearToRecording.get(r)){
    return new HashSet<Recording>();
    }*/
    //return genreToRecording.get(genre);
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenreAndYear'");
  }

  @Override
  public Collection<Recording> offerHasNewRecordings(Collection<Recording> offered) {
    /*if(offered.equals(offered.size())){
    return null;
    }*/
   Set<Recording> hej = new HashSet<>();
   if(offered == null){
     
     for (int i = 0; i < offered.size(); i++){
       recordingMap.size(offered, null);

      }
    }
      return offered;
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'offerHasNewRecordings'");
  }
}
