package tech.gdgmakurdi.wtmmakeupapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

public class JSONUtils {

    private static final String TAG = "JsonUtils";

    public static final String MAKEUPS_FIELD = "makeups";
    public static final String MAKEUP_TITLE_FIELD = "makeupTitle";
    public static final String  SUMMARY_FIELD = "summary";


    public static Makeup[] parseMakeupJson(String json) {
        if (json==null) {
            return null;
        }

        try {
            JSONObject jsonObject = new JSONObject(json);

            JSONArray makeupJsonArray = jsonObject.optJSONArray(MAKEUPS_FIELD);
            Makeup[] makeupArray = new Makeup[makeupJsonArray.length()];
            for (int i = 0; i < makeupJsonArray.length(); i++) {
                String originalTitle = makeupJsonArray.optJSONObject(i).optString(MAKEUP_TITLE_FIELD);
                String id = makeupJsonArray.optJSONObject(i).optString(SUMMARY_FIELD);
                makeupArray[i] = new Makeup(originalTitle, id);
            }

            return makeupArray;

        }catch (JSONException e) {
            Log.e(TAG, "JSON error: " + e);
            return null;
        }
    }
}
