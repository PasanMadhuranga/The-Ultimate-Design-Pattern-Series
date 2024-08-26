package facade.exercise;

import java.util.List;

public class Main {
  public static void show() {
    var oauth = new OAuth();
    var requestToken = oauth.requestToken("appKey", "secret");
    var accessToken = oauth.getAccessToken(requestToken);

    var twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets(accessToken);
  }

  public static void main(String[] args){
    TwitterAPI twitter_API = new TwitterAPI("APP KEY", "SECRET");
    List<Tweet> tweets = twitter_API.getRecentTweets();
  }
}
