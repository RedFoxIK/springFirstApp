package beans;

/**
 * Created by Yaroslava_Kalashnyk on 5/8/2017.
 */
public class Client {
    String id;
    String fullName;
    String gr;

    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public void setGreeting(String gr) {
        this.gr = gr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
