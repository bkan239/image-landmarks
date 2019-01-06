
import io.swagger.client.ApiException;
import io.swagger.client.api.MediaApi;
import io.swagger.client.model.MediaUploadResponse;
import io.swagger.client.model.Point;
import org.apache.commons.lang3.tuple.Pair;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

public class Main {
    public static final String API_KEY = "d45fd466-51e2-4701-8da8-04351c872236";
    public static final String NEWLINE = "\r\n";
    private static FilenameFilter filter = (dir, name) -> name.endsWith("JPEG") || name.endsWith("JPG") || name.endsWith("PNG") || name.endsWith("jpeg") || name.endsWith("jpg") || name.endsWith("png");
    private static final int MAX_IMAGES = 50;
    private static int error_count;

    private static final String[] points = { "nose bottom", "eyebrow left bottom inner", "cheekbone right", "eyebrow right bottom outer",
            "basic eye right", "eyebrow rigth bottom inner", "eye left top outer", "mouth right top", "eye right iris", "eyebrow left top outer",
            "eyebrow right botom", "basic eye left outer", "mouth left bottom", "eye left outer", "eye left bottom outer", "nose right top inner",
            "mouth right top point 1", "temple right 4", "mouth top", "mouth bottom", "eye left top", "mouth inner left top", "basic chin bottom",
            "eyebrow left outer", "basic chin right", "eye right bottom", "mouth left bottom point 1", "eye right bottom outer",
            "eyebrow right top inner", "nose right top outer", "basic eye right outer", "eyebrow right inner", "chin right 1", "forehead 4",
            "eye left inner", "forehead right", "forehead left", "mouth left", "nose bridge middle", "mouth right bottom", "mouth inner bottom",
            "temple left", "basic mouth left", "chin left 5", "basic eye right inner", "chin right 2", "basic eyebrow left outer corner",
            "eyebrow left top inner", "chin bottom", "eyebrow right outer", "eye left bottom", "basic eyebrow right inner corner",
            "mouth right bottom point 1", "temple left 4", "eyebrow left top", "forehead middle", "chin left 4", "basic nose right", "temple right 1",
            "eye right bottom inner", "basic chin left", "forehead 2", "chin right 3", "mouth left top", "eyebrow left bottom", "basic eyebrow left",
            "temple left 3", "chin left 3", "nose left top", "mouth left top point 1", "mouth right", "basic mouth center", "eye right top outer",
            "basic eye left inner", "basic eyebrow right", "forehead 3", "chin ear right", "nose tip", "eyebrow right top outer", "chin right 4",
            "temple right", "eyebrow right top", "eye left bottom inner", "nose right bottom outer", "nose bridge bottom", "eye right top inner",
            "basic eye left", "basic nose tip", "chin left 2", "nose left top inner", "temple left 2", "cheekbone left", "nose right top",
            "basic eyebrow left inner corner", "temple right 3", "eyebrow left inner", "nose left bottom inner", "eyebrow left bottom outer",
            "eye left iris", "nose bridge top", "chin right 5", "mouth inner right", "nose left bottom outer", "mouth inner left bottom",
            "basic eyebrow right outer corner", "basic nose left", "eye right outer", "chin left 1", "eye left top inner", "temple left 1",
            "mouth inner right bottom", "nose left top outer", "basic mouth right", "mouth inner left", "temple right 2", "eye right inner",
            "eye right top", "mouth inner right top", "chin ear left", "forehead 1", "mouth inner top", "nose right bottom inner" };

    public static void main(String[] args) throws IOException {

        if (args.length > 0) {
            String imagePath = args[0];
            String tag = args[1];
            File folder = new File(imagePath);
            File[] listOfFiles = folder.listFiles(filter);
            assert listOfFiles != null;
            StringBuilder sb = new StringBuilder();
            sb.append(createHeader()).append(NEWLINE);
            int counter = 0;
            for (File listOfFile : listOfFiles) {
                StringBuilder s = processImage(listOfFile.getAbsolutePath(), tag);
                if (!s.toString().isEmpty()) {
                    sb.append(s);
                    sb.append(NEWLINE);
                    if ((++counter % 10) == 0) {
                        System.out.println("counter " + counter);
                    }
                    if (counter > MAX_IMAGES) {
                        break;
                    }
                }

            }
            String s = sb.toString();
            if (!s.isEmpty()) {
                Files.write(Paths.get(imagePath).resolve(tag + ".csv"), s.getBytes());
            }
            System.out.println("count: " + counter);
            System.out.println("errors: " + error_count);
        } else {
            System.out.println("Parameter für Image Ordner fehlen");
        }

    }

    private static StringBuilder processImage(String imgFileName, String tag) {
        File imgFile = new File(imgFileName);
        MediaApi apiInstance = new MediaApi();
        apiInstance.getApiClient().setVerifyingSsl(false).setReadTimeout(600000);
        UUID apiKey = UUID.fromString(API_KEY); // UUID | your API key or d45fd466-51e2-4701-8da8-04351c872236
        StringBuilder line = new StringBuilder();
        try {

            MediaUploadResponse result = apiInstance.v2MediaFilePost(apiKey, imgFile, null, null, null, null,
                    null, null, null);
            try {
                List<Point> pointsList = result.getMedia().getFaces().get(0).getPoints();

                line.append(tag);

                for (String pointName : points) {
                    Pair<Double, Double> coordinates = getCoordinatesByPointName(pointsList, pointName);
                    line.append(",").append(coordinates.getLeft()).append(",").append(coordinates.getRight());
                }
            } catch (Exception e) {
                error_count++;
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#v2AdminUsageGet");
            e.printStackTrace();
        }
        return line;
    }

    private static String createHeader() {
        StringBuilder header = new StringBuilder();
        header.append("tag");
        for (String pointName : points) {
            header.append(",")
                    .append(pointName + ".x")
                    .append(",")
                    .append(pointName + ".y");
        }
        return header.toString();
    }

    private static Pair<Double, Double> getCoordinatesByPointName(List<Point> pointsList, String pointName) {

        return pointsList.stream().filter(point -> point.getName().equals(pointName)).map(point -> Pair.of(point.getX(), point.getY())).findFirst()
                .orElse(Pair.of(0d, 0d));
    }
}
