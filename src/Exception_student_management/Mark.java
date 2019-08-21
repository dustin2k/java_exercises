package Exception_student_management;

public class Mark {
    Students s;
    Subject sj;
    Double m;
    int bonus;
    Mark(Students _s, Subject _sj, Double _m, int _bonus){
        s = _s;
        sj = _sj;
        m = _m;
        bonus = _bonus;
    }
    public Double score() {
        Double score;
        score = m * sj.w;
        return score;
    }
}
