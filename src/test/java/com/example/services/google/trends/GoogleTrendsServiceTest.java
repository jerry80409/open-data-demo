package com.example.services.google.trends;

import com.example.services.google.trends.entities.KeyWordsResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
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

}
