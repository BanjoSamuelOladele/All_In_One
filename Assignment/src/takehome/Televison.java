package takehome;

public class Televison {

    private boolean state;
    private int volumn;
    private String mode;
    public void onTv(boolean state) {
        this.state = state;
    }

    public boolean tvState() {
        return state;
    }

    public boolean toggle() {
        state = !state;
        return state;
    }

    public void increaseVolumn() {
        if(state) {
            if (volumn >= 0 && volumn < 99) volumn = volumn + 2;}
    }

    public int volumnMeasure() {
        return volumn;
    }

    public void decreaseVolumn() {
        if(state) {
            if (volumn > 0 && volumn <= 100)volumn = volumn - 2;}

    }


    public String getMode() {
        return mode;
    }

    public void tvMode(int mode) {
        if(state){
        if(mode == 1) this.mode = "TV MODE";
        if(mode == 2) this.mode = "AV MODE";
        if(mode == 3) this.mode = "HDMI MODE";
        if(mode == 4) this.mode = "NETFLIX";
        if(mode == 0) this.mode = "CHROME";}
        if(!state) this.mode = " ";
    }

}

