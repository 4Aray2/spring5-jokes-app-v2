package guru.springframework.springJokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

//    private final ChuckNorrisQuotes chuckNorrisQuotes;
//
//    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
//        this.chuckNorrisQuotes = chuckNorrisQuotes;
//    }

    @Override
    public String getRandomQuote() {
        ChuckNorrisQuotes randomQuote = new ChuckNorrisQuotes();
        return randomQuote.getRandomQuote();
    }
}