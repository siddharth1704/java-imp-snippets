package tech.codingclub;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Set Class running at" + new Date().toString() + "sharp");
        ArrayList<String> emails = new ArrayList<>();
        emails.add("Sid17singh@gamil.com");
        emails.add("admin@gamil.com");
        emails.add("google@gamil.com");
        emails.add("xyz@gamil.com");
        emails.add("Sid17singh@gamil.com");
        emails.add("hr@tiktok.com");
        emails.add("admin@titok.com");

        ArrayList<String> blacklist = new ArrayList<>();
        blacklist.add("hr@tiktok.com");
        blacklist.add("admin@titok.com");

        Set<String> uniqueEmails = new HashSet<String>();
        uniqueEmails.add("abc@gmail.com");
        uniqueEmails.addAll(emails);

        Iterator<String> itr = uniqueEmails.iterator();
        while (itr.hasNext()) {
            System.out.println("Itr showing: " + itr.next());
        }
        System.out.println("################");
        for (String x : uniqueEmails) {
            System.out.println("For looping showing:" + x);
        }
        System.out.println("Size of set" + uniqueEmails.size());
        uniqueEmails.remove("xyz@gamil.com");
        System.out.println("Removed xyz mail");
        System.out.println("################");
        for (String x : uniqueEmails) {
            System.out.println("For looping showing:" + x);
        }
        uniqueEmails.removeAll(blacklist);
        System.out.println("################");
        for (String x : uniqueEmails) {
            System.out.println("For looping showing:" + x);
        }
        if (uniqueEmails.contains("Sid17singh@gamil.com")) {
            System.out.println("Mail exists");
        }
    }
}
