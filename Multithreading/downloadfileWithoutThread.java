class DownloadFile{
    public static void File(String file) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(file + " downloading..." +(i*20) + "%");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
        System.out.println(file + "Downloaded");
    }
}
public class downloadfileWithoutThread {
    public static void main(String[] args) {
        DownloadFile obj = new DownloadFile();
        obj.File("Reel");
    }
}
