package idv.blake;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommandTest {
    @Test
    public void testCommand_DoorOpen() {
        Door door = new MockRemoteDoor("192.168.0.1", "open");
        Command doorCmd = new DoorCommand(door);
        Result result = doorCmd.execute();
        assertEquals(Result.CRITICAL, result.getStatus());
        assertTrue(result.getMessage().startsWith("門被開啟"));
    }

    @Test
    public void testCommand_DoorClose(){
        Door door = new MockRemoteDoor("192.168.0.1", "not open");
        Command doorCmd = new DoorCommand(door);
        Result result = doorCmd.execute();
        assertEquals(Result.OK, result.getStatus());
        assertTrue(result.getMessage().isEmpty());
    }

    @Test
    public void testLambdaCommand_DoorClosed() {
        Command doorCmd = () ->{
            Result result = new Result();
            result.setStatus(Result.OK);
            return result;
        };
        Result result = doorCmd.execute();
        assertEquals(Result.OK, result.getStatus());
        assertTrue(result.getMessage().isEmpty());

    }
}
