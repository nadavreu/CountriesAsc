package com.karp.anna.myapplication;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Android on 3/13/2018.
 */


public class Languages{



    public Languages(){}

    public Languages(JSONObject jsonObj) throws JSONException {
        setIso639_2(jsonObj.getString("iso639_2"));
        setIso639_1(jsonObj.getString("iso639_1"));
        setName(jsonObj.getString("name"));
        setNativeName(jsonObj.getString("nativeName"));
    }
    private String iso639_2;

    private String iso639_1;

    private String name;

    private String nativeName;

    public String getIso639_2 ()
    {
        return iso639_2;
    }

    public void setIso639_2 (String iso639_2)
    {
        this.iso639_2 = iso639_2;
    }

    public String getIso639_1 ()
    {
        return iso639_1;
    }

    public void setIso639_1 (String iso639_1)
    {
        this.iso639_1 = iso639_1;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getNativeName ()
    {
        return nativeName;
    }

    public void setNativeName (String nativeName)
    {
        this.nativeName = nativeName;
    }


}