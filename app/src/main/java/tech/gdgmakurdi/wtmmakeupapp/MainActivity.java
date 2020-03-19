package tech.gdgmakurdi.wtmmakeupapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String jsonString = "{\n" +
            "  \"makeups\": [\n" +
            "    {\n" +
            "      \"makeupTitle\": \"Elevated Drugstore Eyeshadow 1\",\n" +
            "      \"summary\": \"When a makeup artist posts a video of them doing a celebrity's glam session, we feel like we've been let in on a big secret (even if millions of other people have access to the video, too). As such, we pause, rewind, take notes, and test the looks out ourselves with a hope and prayer that it'll turn out at least half as good.\",\n" +
            "      \"step\": [\n" +
            "        {\n" +
            "          \"id\": 1,\n" +
            "          \"title\": \"Get everything ready\",\n" +
            "          \"details\": \"get everything in place. Relax and get started\",\n" +
            "          \"photo\": \"ele-step1.jpg\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"id\": 1,\n" +
            "          \"title\": \"Now your are ready\",\n" +
            "          \"details\": \"Goodluck with the rest of the job\",\n" +
            "          \"photo\": \"ele-step2.jpg\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"makeupTitle\": \"Elevated Drugstore Eyeshadow 2\",\n" +
            "      \"summary\": \"When a makeup artist posts a video of them doing a celebrity's glam session, we feel like we've been let in on a big secret (even if millions of other people have access to the video, too). As such, we pause, rewind, take notes, and test the looks out ourselves with a hope and prayer that it'll turn out at least half as good.\",\n" +
            "      \"step\": [\n" +
            "        {\n" +
            "          \"id\": 1,\n" +
            "          \"title\": \"Get everything ready\",\n" +
            "          \"details\": \"get everything in place. Relax and get started\",\n" +
            "          \"photo\": \"ele-step1.jpg\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"id\": 1,\n" +
            "          \"title\": \"Now your are ready\",\n" +
            "          \"details\": \"Goodluck with the rest of the job\",\n" +
            "          \"photo\": \"ele-step2.jpg\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public List<Makeup> makeupList;
    public RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.makeup_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        makeupList = Arrays.asList(JSONUtils.parseMakeupJson(jsonString));
        Toast.makeText(getApplicationContext(), makeupList.get(0).getMakeupTitle(), Toast.LENGTH_LONG).show();
        mRecyclerView.setAdapter(new MakeupAdapter(makeupList));
    }

    public void openMakeup(View view) {
        Intent intent = new Intent(this, MakeupDisplayer.class);

        startActivity(intent);
    }
}
