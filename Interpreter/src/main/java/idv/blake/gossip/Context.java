package idv.blake.gossip;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class Context {
    private Iterator<String> tokens;
    private String currentToken;

    Context(String filename) throws IOException, URISyntaxException {
        tokens = Files.readAllLines(Paths.get(this.getClass().getClassLoader().getResource(filename).toURI()))
                .stream()
                .map(s->s.trim().split("\\s+"))
                .flatMap(Stream::of)
                .iterator();
        nextToken();
    }

    String nextToken() {
        currentToken = null;
        if (tokens.hasNext()) {
            currentToken = tokens.next();
        }
        return currentToken;
    }

    String currentToken() {
        //System.out.println("Currnt Token is=[" + currentToken+"]");
        return currentToken;
    }

    void skipToken(String token) {
        if (!token.equals(currentToken)) {
            System.err.println("Warning: " + token +
                    " is expected, but " +
                    currentToken + " is found.");
        }
        nextToken();
    }

    int currentNumber() {
        return Integer.parseInt(currentToken);
    }
}
