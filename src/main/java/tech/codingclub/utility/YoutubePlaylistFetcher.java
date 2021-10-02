package tech.codingclub.utility;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class YoutubePlaylistFetcher implements Runnable{

    private String url;
    public YoutubePlaylistFetcher(String url){
        this.url=url;
    }
    public void run() {
        if(this.url==null || this.url.length()==0){
           return;
        }
        else{
            try {
              String youtubeResponse=  HttpURLConnectionExample.sendGet(this.url);
              Document document= Jsoup.parse(youtubeResponse,"https://cdn-api.co-vin.in");
            //  Elements childElements=document.body().select(".ytd-app >*");
              int state=0;
                System.out.println(document);
//              for(Element childElement:childElements){
//
//                  System.out.println("hi");
//                  System.out.println(childElement.tagName());
////                  if(childElement.tagName().equals("table"))
////                      state=1;
////                  else if(state==1){
////                      if(childElement.tagName().equals("p"))
////                          state=2;
////                  }
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    public static void main(String[] args) {
        ThreadManager threadManager=new ThreadManager(1);
        threadManager.waitTillQueueIsFreeAndAddTask(new YoutubePlaylistFetcher("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByPin?pincode=241204&date=08-05-2021"));
    }
}
