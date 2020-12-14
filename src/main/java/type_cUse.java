public class type_cUse implements Type_c{

    type_cAdapter type_cadapter;

    public void read() {

    }

    public void Fast_charging() {

    }

    public void transform(String x){
        if(x.equals("read")) {
            type_cadapter = new type_cAdapter("read");
            type_cadapter.read();
        }
        if(x.equals("charging")){
            type_cadapter = new type_cAdapter("charging");
            type_cadapter.Fast_charging();
        }
    }
}
