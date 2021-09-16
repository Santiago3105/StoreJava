package Modelo.BusinessEntity;
/**
 *
 * @author Santiago Hernandez
 */
public class UserBE {
    int UserId;
    String Name;
    String Email;
    String Passwor;

    public UserBE() {
    }

    public UserBE(int UserId, String Name, String Email, String Passwor) {
        this.UserId = UserId;
        this.Name = Name;
        this.Email = Email;
        this.Passwor = Passwor;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPasswor() {
        return Passwor;
    }

    public void setPasswor(String Passwor) {
        this.Passwor = Passwor;
    }
    
    
}
