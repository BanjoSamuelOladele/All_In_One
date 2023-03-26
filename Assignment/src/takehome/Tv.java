package takehome;

public class Tv {
    private boolean status;
    private String toggl;
    private boolean update;
    private int volumnUp;
    private int volumnDown;


    public boolean tvStatus(boolean status) {
        this.status = status;
        return this.status;
    }

    public String toggler() {
        String togg = " ";
        if(status){
        if(update) togg = "welcome";
        if(!update)togg = "goodbye";
        }
        if(!status) togg = "0";

        return toggl = togg;

    }

    public boolean toggleUpdate(boolean toggleUpdate) {
        update = toggleUpdate;
        return update;
    }

    public int volumnUp(int button) {
        if(status) {
            if (update) volumnUp = 1 + button;
            if(!update) return 0;
        }
        if(!status) return volumnUp;

        return volumnUp;
    }

    public int volumnDown(int button) {
        if(status){
            if(button > 0) {
                if (update) volumnDown = button - 1;
            }
            if(button == 0){
                if(update) volumnDown = 0;}
        if(!update) volumnDown = 0;}
        return volumnDown;
    }
}
