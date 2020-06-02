package idv.blake;

public class Printer {
    PaperTray paperTray;

    Printer(){
        paperTray=new PaperTray();
    }

    Printer(int papercount){
        paperTray=new PaperTray(papercount);
    }

    public boolean print(Image image) throws PrinterException {
        if(paperTray.getPapercount()<1){
            throw new PrinterException("No paper!");
        }
        paperTray.reducePapercount();
        return true;
    }

    public String getErrorMessage() {
        return "Scanner error: No paper!";
    }

    public PaperTray getPaperTray() {
        return paperTray;
    }
}
