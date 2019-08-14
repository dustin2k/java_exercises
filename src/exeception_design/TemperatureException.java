package exeception_design;

class TemperatureException extends Exception {
//    private int temperature;
    private String msg;
    TemperatureException(int temp, String er){
//        temperature = temp;
        if(er.equals("Cold")) msg = "Too cold: " + temp;
        else if(er.equals("Hot")) msg = "Too hot: " + temp;
    }
    String getMsg() {
        return msg;
    }
}
