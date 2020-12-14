public class type_cAdapter implements Type_c{

    Micro micro;
    public type_cAdapter(String x){
        if(x.equals("read"))micro = new Micro_read();
        if(x.equals("charging"))micro = new Micro_General_charging();
    }
    public void read() {
        micro.read();
    }

    public void Fast_charging() {
        micro.General_charging();
    }
}
