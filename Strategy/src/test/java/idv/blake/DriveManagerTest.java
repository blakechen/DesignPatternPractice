package idv.blake;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DriveManagerTest {

    @Test
    public void demo_a_client_of_drive_manager() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);
        DriveManager dm = new DriveManager();
        dm.format("Ntfs");
        assertEquals("格式化為NTFS", stream.toString().trim());
        stream.reset();
        dm.format("Fat32");
        assertEquals("格式化為FAT32", stream.toString().trim());
        stream.reset();
        dm.format("Fat");
        assertEquals("格式化為FAT", stream.toString().trim());
    }
}
