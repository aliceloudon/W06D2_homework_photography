import java.util.HashMap;

public class JournalHashMap{

  public static void main(String[] args) {
    
    HashMap<String, Integer> journal = new HashMap<String, Integer>();

    journal.put("07/03/2017", 10);
    journal.put("05/03/2017", 6);
    journal.put("04/03/2017", 25);

    Integer journal_entry = journal.get("07/03/2017");

}
}

