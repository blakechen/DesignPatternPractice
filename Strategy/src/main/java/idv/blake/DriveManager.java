package idv.blake;

public class DriveManager {
    public void format(String fileSystem) {
        createFormater(fileSystem).execute();
    }

    private Formater createFormater(String fileSystem) {
        String fullName = "idv.blake." + fileSystem;
        try {
            Formater formater = (Formater) Class.forName(fullName).newInstance();
            return formater;
        } catch (Exception e) {
            throw new RuntimeException("Cannot create formater.", e);
        }
    }
}
