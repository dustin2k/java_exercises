package Exception_student_management;

public class Mark {
    Students s;
    Subject sj;
    float m;
    int bonus;
    Mark(Students _s, Subject _sj, float _m, int _bonus){
        s = _s;
        sj = _sj;
        m = _m;
        bonus = _bonus;
    }
    public float score() {
        float score;
        score = m * sj.w;
        return score;
    }
}
