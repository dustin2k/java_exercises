package Exception_student_management;

public class Students {
    private String sid;
    private String fullName;

    Students(String _sid, String _fullName){
        sid = _sid;
        fullName = _fullName;
    }
    
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
