package edu.pitt.api.Mongo.models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("user")
public class Users {

    @Id
    public ObjectId _id;

    public String usrname;
    public String type; // user or admin
    public String pwd;
    public String city;
    public String state;
    public String email;
    public String phone;
    public String[] report;

    //Constructors
    public Users(){}
    public Users(ObjectId _id, String usrname, String type, String pwd, String city, String state, String email, String phone, String[] report)
    {
        this._id = _id;
        this.usrname = usrname;
        this.type = type;
        this.pwd = pwd;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone = phone;
        this.report= report;
    }

    //ObjectId needs to be converted to String
    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getName() { return usrname; }
    public void setName(String usrname) { this.usrname = usrname; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getPwd() { return pwd; }
    public void setPwd(String pwd) { this.pwd = pwd; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String[] getReport() { return report; }
    public void setReport(String[] report) { this.report = report; }

}
