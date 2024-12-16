import java.util.*;

public class ibmno2 {
    public static List<String> getSpamEmails(List<String> subjects, List<String> spam_words) {

        Set<String> spamWordsSet = new HashSet<>();
        for (String word : spam_words) {
            spamWordsSet.add(word.toLowerCase());
        }

        List<String> r = new ArrayList<>();

        for (String subject : subjects) {
            String[] subjectWords = subject.toLowerCase().split(" ");
            int sc = 0;
            for (String word : subjectWords) {
                if (spamWordsSet.contains(word)) {
                    sc++;
                }
            }
            if (sc >= 2) {
                r.add("spam");
            } else {
                r.add("not_spam");
            }
        }

        return r;
    }

    public static void main(String[] args) {
        List<String> subjects = Arrays.asList(
                "Win a free iPhone now",
                "Your account has been compromised",
                "Exclusive offer just for you",
                "Congratulations! You have won a lottery",
                "Meeting rescheduled to next week"
        );

        List<String> spam_words = Arrays.asList("free", "win", "lottery", "offer", "compromised");

        List<String> output = getSpamEmails(subjects, spam_words);
        for (String res : output) {
            System.out.println(res);
        }
    }
}

