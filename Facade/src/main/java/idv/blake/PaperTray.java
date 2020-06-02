package idv.blake;

public class PaperTray {
    private int papercount = 0;
    PaperTray(){
    }
    PaperTray(int papercount){
        this.papercount=papercount;
    }

    public void addPaper(Paper paper) {
        papercount++;
    }

    public int getPapercount() {
        return papercount;
    }

    public void reducePapercount() {
        papercount--;
    }
}
