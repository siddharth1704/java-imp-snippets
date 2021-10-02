package tech.codingclub.utility;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WikepediaDownloader implements Runnable{

    private String keyword;
    public WikepediaDownloader(String keyword){
        this.keyword=keyword;
    }
    public void run() {
        if(this.keyword==null || this.keyword.length()==0){
           return;
        }
        else{
            this.keyword=keyword.trim().replaceAll("[ ]","_");
            String url=getUrlQuery(this.keyword);
            String response="";
            String imgUrl="";
            try {
              String wekipediaResponse=  HttpURLConnectionExample.sendGet(url);
              Document document= Jsoup.parse(wekipediaResponse,"https://en.wikipedia.org");
              Elements childElements=document.body().select(".mw-parser-output >*");
              int state=0;
              for(Element childElement:childElements){
                  //System.out.println(childElement.tagName());
                  if(childElement.tagName().equals("table"))
                      state=1;
                  else if(state==1){
                      if(childElement.tagName().equals("p"))
                          state=2;
                          response=childElement.text();
                          break;
                  }
                }
              try {
                  imgUrl=document.body().select(".infobox img").get(0).attr("src");

              }catch (Exception e){
                  e.printStackTrace();
              }

            } catch (Exception e) {
                e.printStackTrace();
            }
            WikiResult wikiResult=new WikiResult(this.keyword,response,imgUrl);
            Gson gson=new GsonBuilder().setPrettyPrinting().create();
            String json=gson.toJson(wikiResult);
            System.out.println(json);
        }
    }

    private String getUrlQuery(String keyword) {
        return "https://en.wikipedia.org/wiki/"+keyword;
    }


    public static void main(String[] args) {
        ThreadManager threadManager=new ThreadManager(1);
        threadManager.waitTillQueueIsFreeAndAddTask(new WikepediaDownloader("Albert Einstein"));
        threadManager.waitTillQueueIsFreeAndAddTask(new WikepediaDownloader("India"));
        threadManager.waitTillQueueIsFreeAndAddTask(new WikepediaDownloader("United States"));
        threadManager.waitTillQueueIsFreeAndAddTask(new WikepediaDownloader("Dubai"));

    }
}
