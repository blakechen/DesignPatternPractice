package idv.blake.wiki;

//on System A
public class RealImage implements Image {
    String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Display " + filename);
    }
}
