
import java.util.HashSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Conference {

    private String name;
    private String description;
    private HashSet<Guest> people;
    private ImageIcon image;

    public Conference(String n, String d, String img) {
        name = n;
        description = d;
        image = new ImageIcon(getClass().getResource(img));
        people = new HashSet();
    }

    public boolean signup(Guest g) {
        if (people.contains(g)) {
            return false;
        } else {
            people.add(g);
            return true;
        }
    }

    public boolean remove(Guest g) {
        if (people.contains(g)) {
            people.remove(g);
            return true;
        } else {
            return false;
        }
    }

    Object getList() {
        return people;
    }

    String getName() {
        return name;
    }

    String getDescriprion() {
        return description;
    }

    Icon getImage() {
        return image;
    }
}
