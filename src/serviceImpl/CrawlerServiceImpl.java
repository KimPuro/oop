package serviceImpl;
import org.jsoup.nodes.Document;
import service.CrawlerService;
import org.jsoup.*;

import java.io.IOException;

public class CrawlerServiceImpl implements CrawlerService{
    @Override
    public void findNameFromWeb() throws IOException {
        Document doc = Jsoup.connect("").get();

    }
}
