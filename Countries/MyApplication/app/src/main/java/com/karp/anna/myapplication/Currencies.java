package com.karp.anna.myapplication;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Android on 3/13/2018.
 */


public class Currencies {

    private String symbol;

    private String name;

    private String code;

    public Currencies(){}

    public Currencies(JSONObject jsonObj) throws JSONException {
        setSymbol(jsonObj.getString("symbol"));
        setCode(jsonObj.getString("code"));
        setName(jsonObj.getString("name"));
    }

    public String getSymbol ()
    {
        return symbol;
    }

    public void setSymbol (String symbol)
    {
        this.symbol = symbol;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

}