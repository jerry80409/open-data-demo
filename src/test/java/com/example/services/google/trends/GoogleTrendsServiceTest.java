package com.example.services.google.trends;

import com.example.services.google.trends.entities.KeyWordsResponse;
import okhttp3.ResponseBody;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import javax.inject.Inject;

/**
 * Created by jerry on 2017/2/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoogleTrendsServiceTest {

    @Inject
    private GoogleTrendsService googleTrendsService;

    @Test
    public void testGetTrendsOfKeyWords() throws IOException {
        Response<KeyWordsResponse> response = googleTrendsService.trendsOfKeyWords().execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    /**
     * curl 'https://www.google.com.tw/trends/hottrends/hotItems'
     * -H 'Referer: https://www.google.com.tw/trends/hottrends'
     * -H 'Origin: https://www.google.com.tw'
     * -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36'
     * -H 'Content-Type: application/x-www-form-urlencoded;charset=UTF-8'
     * --data 'ajax=1&pn=p12&htd&htv=l' --compressed
     *
     * @throws IOException
     */
    @Test
    public void testGetTrendsOfHotItems() throws IOException {
        Response<ResponseBody> response = googleTrendsService.trendsOfHotItems("1", "p12", "", "l").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
//        Assert.assertEquals(200, responsecode());
    }
}
