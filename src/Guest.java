
import java.util.Objects;


public class Guest {
    String email;
    String name;
    
    public Guest(String e, String n){
        email = e;
        name = n;
    }
    
    public Guest(String info){
        int div = info.indexOf("<");
        name = info.substring(0, div);
        email = info.substring(div + 1, info.length() - 1);
    }
    
    public String toString(){
        return name + "<" + email + ">";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guest other = (Guest) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
}
