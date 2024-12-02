package hust.soict.dsai.aims;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import hust.soict.dsai.aims.media.*;

public class Aims {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] mediaInfo = line.split(",");
                Media media = null;
                switch (mediaInfo[0]) {
                    case "DVD":
                        if (mediaInfo.length == 2) {
                            media = new DigitalVideoDisc(mediaInfo[1]);
                        } else if (mediaInfo.length == 4) {
                            media = new DigitalVideoDisc(mediaInfo[1], mediaInfo[2], Float.parseFloat(mediaInfo[3]));
                        } else if (mediaInfo.length == 6) {
                            media = new DigitalVideoDisc(
                                mediaInfo[1],
                                mediaInfo[2],
                                mediaInfo[3],
                                Integer.parseInt(mediaInfo[4]),
                                Float.parseFloat(mediaInfo[5])
                            );
                        }
                        break;
                    case "Book":
                        if (mediaInfo.length >= 4) {
                            Book book = new Book();
                            book.setTitle(mediaInfo[1]);
                            book.setCategory(mediaInfo[2]);
                            book.setCost(Float.parseFloat(mediaInfo[3]));
                            for (int i = 4; i < mediaInfo.length; i++) {
                                book.getAuthors().add(mediaInfo[i]);
                            }
                            media = book;
                        }
                        break;
                    case "CD":
                        if (mediaInfo.length >= 6) {
                            CompactDisc cd = new CompactDisc(
                                mediaInfo[1],
                                mediaInfo[2],
                                mediaInfo[3],
                                Integer.parseInt(mediaInfo[4]),
                                Float.parseFloat(mediaInfo[5]),
                                mediaInfo[6]
                            );
                            media = cd;
                            if (media != null) {
                                for (int i = 7; i < mediaInfo.length; i += 2) {
                                    if (i + 1 < mediaInfo.length) {
                                        Track track = new Track(mediaInfo[i], Integer.parseInt(mediaInfo[i + 1]));
                                        cd.addTrack(track);
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        continue; // skip
                }
                if (media != null) {
                    mediaList.add(media);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); //debug
        }
        // Sort by title then cost
        Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Sorted by title then cost:");
        for (Media media : mediaList) {
            System.out.println(media);
        }
        // Sort by cost then title
        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Sorted by cost then title:");
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }
}
