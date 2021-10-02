package tech.codingclub.utility;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.*;

public class TopKeywordAnalyzer implements Runnable{
    private final String filepath;

    public TopKeywordAnalyzer(String filepath){
        this.filepath = filepath;
    }
    public void run() {
        ArrayList<String> data=FileUtility.readAndPrintFile(filepath);
        HashMap<String,Integer> keyWordCounter=new HashMap<String,Integer>();
        for(String row:data){
            String[] keywords=row.split(" ");
            for(String keyword:keywords){
                String str=keyword.toLowerCase();
                if(!keyWordCounter.containsKey(str)){
                    keyWordCounter.put(str,1);
                }else{
                    Integer value=keyWordCounter.get(str);
                    keyWordCounter.put(str,value+1);
                }
            }
        }
        ArrayList<KeywordCount> keywordCountArrayList=new ArrayList<KeywordCount>();
        for(String keyword:keyWordCounter.keySet()){
            keywordCountArrayList.add(new KeywordCount(keyword,keyWordCounter.get(keyword)));
        }
        Collections.sort(keywordCountArrayList, new Comparator<KeywordCount>() {
            @Override
            public int compare(KeywordCount o1, KeywordCount o2) {
                if(o2.count==o1.count){
                    return o1.keyword.compareTo(o2.keyword);
                }
                return o2.count- o1.count;
            }
        });
//        for(KeywordCount keywordCount:keywordCountArrayList){
//            System.out.println(keywordCount.keyword+" "+keywordCount.count);
//        }
        String json =new Gson().toJson(keywordCountArrayList);
        System.out.println(json);
        String convert="{\"keyword\":\"Hello\",\"count\":100}";
        KeywordCount keyword=new Gson().fromJson(convert,KeywordCount.class);
        System.out.println("Converted back"+keyword.count +keyword.keyword);
        String convertArray="[ {\"keyword\":\"Hello\",\"count\":100},{\"keyword\":\"Last\",\"count\":100} ]";
        ArrayList <KeywordCount> converted=new Gson().fromJson(convertArray, new TypeToken<ArrayList<KeywordCount>>(){}.getType());
        for(KeywordCount temp:converted){
            System.out.println(temp.keyword+":"+temp.count);
        }
    }
    public static void main(String[] args) {
        ThreadManager threadManager=new ThreadManager(3);
        threadManager.waitTillQueueIsFreeAndAddTask(new TopKeywordAnalyzer("C:\\Users\\sid17\\Desktop\\a.txt"));
        //threadManager.waitTillQueueIsFreeAndAddTask(new TopKeywordAnalyzer("C:\\Users\\sid17\\Desktop\\wikepedia.txt"));
        //threadManager.waitTillQueueIsFreeAndAddTask(new TopKeywordAnalyzer("C:\\Users\\sid17\\Desktop\\lsdf.txt"));
    }


}
