import entities.BaseClass;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;

public class Delete_Post extends BaseClass {

    CloseableHttpClient client;
    CloseableHttpResponse response;

    @BeforeMethod
    public void setup() {
        client = HttpClientBuilder.create().build();
    }

    @AfterMethod
    public void closeResources() throws IOException {
        client.close();
        response.close();
    }
    @Test
    public void createRepasitory() throws IOException {
        HttpPost post = new HttpPost(BASE_ENDPOINT + "/users/Catea13/repositor");
        String auth="email:password";
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
        String authHeader = "Basic " + new String(encodedAuth);
        post.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
        String json = "{\"name\":\"deleteme\"}";//create this repozitory
        post.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));
        response = client.execute(post);

        int actualStatusCode = response.getStatusLine().getStatusCode();

        Assert.assertEquals(201, actualStatusCode);
    }
}
