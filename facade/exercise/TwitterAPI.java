package facade.exercise;

import java.util.List;

public class TwitterAPI {
    private String app_key;
    private String secret;

    public TwitterAPI(String appKey, String secret) {
        app_key = appKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweets(){
        return new TwitterClient().getRecentTweets(getAccessToken());
    }

    private String getAccessToken(){
        OAuth oAuth = new OAuth();
        return oAuth.getAccessToken(oAuth.requestToken(app_key, secret));
    }
}
