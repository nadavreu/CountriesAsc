
package com.karp.anna.myapplication;

        import android.app.Activity;
        import android.widget.Toast;
        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

// Class for reading server data:
public class SingleCountryReaderController extends CountryController {


    String countryName="";
    // ctor:
    public SingleCountryReaderController(Activity activity,String countryName) {

        super(activity);
        this.countryName = countryName;

    }

    // Read all countries from the server:
    public void readSingleCountry() {
        HttpRequest httpRequest = new HttpRequest(this);
        httpRequest.execute("https://restcountries.eu/rest/v2/name/"+countryName+"?fullText=true");
    }

    // Got country from the server - update in activity:
    public void onSuccess(String downloadedText) {

        try {

            // Translate all to a JSON array:
            JSONArray jsonArray = new JSONArray(downloadedText);

            if(jsonArray!=null && jsonArray.length()==1){
                JSONObject jsonObj=jsonArray.getJSONObject(0);
                FullCountryInfo countryInfo=new FullCountryInfo(jsonObj);

                Toast.makeText(activity
                        ,"Region: " + countryInfo.getRegion()+" Name: " + countryInfo.getNativeName()
                        , Toast.LENGTH_LONG).show();
            }
          }
        catch (JSONException ex) {
            Toast.makeText(activity, "Error: " + ex.getMessage(), Toast.LENGTH_LONG).show();
        }

        // Dismiss dialog:
        progressDialog.dismiss();
    }
}