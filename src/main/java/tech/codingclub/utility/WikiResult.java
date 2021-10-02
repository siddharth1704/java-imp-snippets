package tech.codingclub.utility;

public class WikiResult {
    private String query;
    private String text_result;
    private String img_url;

    public WikiResult(){

    }
    public WikiResult(String query, String text_result, String img_url) {
        this.query = query;
        this.text_result = text_result;
        this.img_url = img_url;
    }

}
