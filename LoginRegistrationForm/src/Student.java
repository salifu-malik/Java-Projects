

public class Student {
private int id;
private String uname;
private String pass;
private String cPass;

public Student(){}

    public Student(int id, String uname, String pass){
    this.id = id;
    this.uname = uname;
    this.pass = pass;

    }


    public Student(String uname, String pass){
    this.uname = uname;
    this.pass = pass;

    }

    public void setId(){
    this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public String getPass(){
    return pass;
    }


    public void setUname(String uname) {
        this.uname = uname;
    }


    public String getUname() {
        return uname;
    }

    public void setCPass(String cpass){
    this.cPass = cpass;
    }


    public String getCPass() {
        return cPass;
    }
}

