package com.example.xsd;// // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class JavaSample {

  public static void main(String[] args) {
    HttpClient httpclient = HttpClients.createDefault();

    try {
      URIBuilder builder = new URIBuilder(
          "https://eu-apr-api.vwcloud.org/vehicles/api/registration/vehicle/vehicleUuid?api-version=2020-07-01");

      URI uri = builder.build();
      HttpPost request = new HttpPost(uri);
      request.setHeader("Content-Type", "application/json");
      request.setHeader("Cache-Control", "no-cache");
      request.setHeader("Authorization",
          "bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJhcGk6Ly9naXRjLWFwci12d2Fjdi1mMTgtYXBpbS1iYWNrZW5kLXNwIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvYzVmNmY2ZTAtNGM1OS00YWExLWJjZDctMDMzZjVmMjExYjFjLyIsImlhdCI6MTY3NjQ0NDM3MiwibmJmIjoxNjc2NDQ0MzcyLCJleHAiOjE2NzY0NDg2MDQsImFjciI6IjEiLCJhaW8iOiJBYlFBUy84VEFBQUFJZis2cVZxTytRN1BxN3JIMFppaGdEMFZiTXpMNFdaZXIrTms0N0dtelN5bU92cTBaMGM4K1gzcGh6ZWd4N2NjNEpESmc3bWNzZkFUYzZ5RWlLWDZhZC9adU9VZVhZTnprenNtUXJqTU5DWmo4aFBMdnBEa1ZDLzRCV2lsUnB4V2lhcitkSDd0bktMWVZFU1gyTjNSaUpOS0FMNllia3RUaXl4VHB4OU5jaVA5MHorckhBdnJDV1VkeDVUdEtway9KMjNreWlhUUxOZ2ttSG9MaXVvL2hRT29nTUJMRXhxVGdITDUwVFlJc3pNPSIsImFtciI6WyJwd2QiLCJtZmEiXSwiYXBwaWQiOiIxMDk3YjRkNC0xNTRkLTRhMDgtYjNmMi05Y2YyOTFhMzdhNDEiLCJhcHBpZGFjciI6IjAiLCJlbWFpbCI6ImlzbWFpbC56YWJpdWxsYUB2YWx0ZWNoLmNvbSIsImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzEzOWYwNjY5LWNlYmItNDJkZi1iOWUzLTQxNTAwOWRkYjY5MC8iLCJpcGFkZHIiOiIxNTcuNDUuMjQ3LjI1MyIsIm5hbWUiOiJJc21haWwgWmFiaXVsbGEiLCJvaWQiOiI1NzZjNzNjYi0yZDI3LTQzMmItYTE0ZC01MDg3OGRhZTU3ZTUiLCJyaCI6IjAuQVhRQTRQYjJ4VmxNb1VxODF3TV9YeUViSEwwUTBMQ1NIZ1ZHdWxqb2ZMNWVzalYwQUJzLiIsInJvbGVzIjpbIk1DVlAuQnlwYXNzIiwiVndhYy5SZWdpc3RyYXRpb24uQXBwLlJlYWRXcml0ZSIsIlZ3YWMuUmVnaXN0cmF0aW9uLkFwcC5SZWFkT25seSIsIlZ3YWMuVXNlclNlcnZpY2UuQXBwLlJlYWRXcml0ZSIsIlZ3YWMuTGV2ZWwuMi4qIiwiVndhYy5Nb2R1bGVNYW5hZ2VtZW50LkFwcC5SZWFkV3JpdGUiLCJWd2FjLkxldmVsLjEuVldBRyIsIlZ3YWMuQ29udGFpbmVySW5nZXN0aW9uLkFwcC5SZWFkV3JpdGUiLCJWd2FjLkxldmVsLjMuKiIsIlZ3YWMuU2VydmljZU1hbmFnZW1lbnQuQXBwLlJlYWRXcml0ZSJdLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJTaHVYdDdLSFpGajFjbkRhTTg2Mk5hbVAtZkNHNGZjTHRTQkVJSjNKNEdNIiwidGlkIjoiYzVmNmY2ZTAtNGM1OS00YWExLWJjZDctMDMzZjVmMjExYjFjIiwidW5pcXVlX25hbWUiOiJpc21haWwuemFiaXVsbGFAdmFsdGVjaC5jb20iLCJ1dGkiOiJEczltbWltenlrYTFsMmp5Z0NNcUFBIiwidmVyIjoiMS4wIn0.EQEqUHkMumH1JYVhV74cWjKBdjrEdfVQh3ZDViqBHL50ayeVxB2UXN1UbLBMiVPYRt3PqaWC02Eh6Y4cKatqlJ1xl-x3p5OijAYZxBfgTxzjNh-E2_fZ_kDWYn_t4HWZViy-6zB6rw7QjnEA8D2EEzVZL2-B6ezdEFv2cX_C1p0MmWOy-cK56RPgjcnFeX6_BjvAnG92DXUqQCXFqk4xjFFcC8mWotUhO5z2-b30p66yuaB6Eocvi00n7O3LNcYM7-Vr4hWyOCkZ12jPSehZ1I5p6wMDFIKuZDWxoR8B5gS2GKJNEuOUpqE_szhghMaUsm7MbXfs8DqssZhWCRJuuA");
      String payload = """
          data={
          "VehicleUuid": "BAUCRDGEZ22090601",
          "ResponseType": "Full"
                                  }
          """;
      StringEntity entity = new StringEntity(payload,
          ContentType.APPLICATION_FORM_URLENCODED);
      request.setEntity(entity);

      HttpResponse response = httpclient.execute(request);
      org.apache.http.HttpEntity pop = response.getEntity();
      System.out.println(pop.getContent().read());
      System.out.println(response);
      if (entity != null) {
        System.out.println(EntityUtils.toString(entity));
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}