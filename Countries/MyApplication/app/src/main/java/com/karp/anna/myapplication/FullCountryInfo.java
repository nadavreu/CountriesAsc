package com.karp.anna.myapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.Currency;

/**
 * Created by Android on 3/13/2018.
 */
public class FullCountryInfo extends BasicCountryInfo{



    public FullCountryInfo(){}

    public FullCountryInfo(JSONObject jsonObj) throws JSONException {
        super(jsonObj);
        setCapital(jsonObj.getString("capital"));
        setRegion(jsonObj.getString("region"));
        setPopulation(jsonObj.getString("population"));
        setNativeName(jsonObj.getString("nativeName"));
        setCallingCodes(jsonObj.getString("callingCodes"));
        setTimezones(jsonObj.getString("timezones"));


        JSONArray jsonArr=jsonObj.getJSONArray("currencies");
        Currencies[] currenciesArr=new Currencies[jsonArr.length()];
        for (int i=0; i<jsonArr.length();i++){
            JSONObject j=jsonArr.getJSONObject(i);
            currenciesArr[i]=new Currencies(j);
        }
        setCurrencies(currenciesArr);


        jsonArr=jsonObj.getJSONArray("languages");
        Languages[] languagesArr=new Languages[jsonArr.length()];
        for (int i=0; i<jsonArr.length();i++){
            JSONObject j=jsonArr.getJSONObject(i);
            languagesArr[i]=new Languages(j);
        }
        setLanguages(languagesArr);

    }

    private String cioc;

    private String region;

    private Currencies[] currencies;

    private String numericCode;

    private String callingCodes;

    private String alpha3Code;

    private String nativeName;

    private String[] topLevelDomain;

    private String alpha2Code;

    private String capital;

    private String[] altSpellings;

    private Languages[] languages;

    private String subregion;

    private String timezones;

    private String area;

    private String[] regionalBlocs;

    private Translations translations;

    private String[] latlng;

    private String demonym;

    private String gini;

    private String[] borders;

    private String population;

    public String getCioc ()
    {
        return cioc;
    }

    public void setCioc (String cioc)
    {
        this.cioc = cioc;
    }

    public String getRegion ()
    {
        return region;
    }

    public void setRegion (String region)
    {
        this.region = region;
    }

    public Currencies[] getCurrencies ()
    {
        return currencies;
    }

    public void setCurrencies (Currencies[] currencies)
    {
        this.currencies = currencies;
    }

    public String getNumericCode ()
    {
        return numericCode;
    }

    public void setNumericCode (String numericCode)
    {
        this.numericCode = numericCode;
    }

    public String getCallingCodes ()
    {
        return callingCodes;
    }

    public void setCallingCodes (String callingCodes)
    {
        this.callingCodes = callingCodes;
    }

    public String getAlpha3Code ()
    {
        return alpha3Code;
    }

    public void setAlpha3Code (String alpha3Code)
    {
        this.alpha3Code = alpha3Code;
    }

    public String getNativeName ()
    {
        return nativeName;
    }

    public void setNativeName (String nativeName)
    {
        this.nativeName = nativeName;
    }

    public String[] getTopLevelDomain ()
    {
        return topLevelDomain;
    }

    public void setTopLevelDomain (String[] topLevelDomain)
    {
        this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code ()
    {
        return alpha2Code;
    }

    public void setAlpha2Code (String alpha2Code)
    {
        this.alpha2Code = alpha2Code;
    }

    public String getCapital ()
    {
        return capital;
    }

    public void setCapital (String capital)
    {
        this.capital = capital;
    }

    public String[] getAltSpellings ()
    {
        return altSpellings;
    }

    public void setAltSpellings (String[] altSpellings)
    {
        this.altSpellings = altSpellings;
    }

    public Languages[] getLanguages ()
    {
        return languages;
    }

    public void setLanguages (Languages[] languages)
    {
        this.languages = languages;
    }

    public String getSubregion ()
    {
        return subregion;
    }

    public void setSubregion (String subregion)
    {
        this.subregion = subregion;
    }

    public String getTimezones ()
    {
        return timezones;
    }

    public void setTimezones (String timezones)
    {
        this.timezones = timezones;
    }



    public String getArea ()
    {
        return area;
    }

    public void setArea (String area)
    {
        this.area = area;
    }



    public String[] getRegionalBlocs ()
    {
        return regionalBlocs;
    }

    public void setRegionalBlocs (String[] regionalBlocs)
    {
        this.regionalBlocs = regionalBlocs;
    }

    public Translations getTranslations ()
    {
        return translations;
    }

    public void setTranslations (Translations translations)
    {
        this.translations = translations;
    }

    public String[] getLatlng ()
    {
        return latlng;
    }

    public void setLatlng (String[] latlng)
    {
        this.latlng = latlng;
    }

    public String getDemonym ()
    {
        return demonym;
    }

    public void setDemonym (String demonym)
    {
        this.demonym = demonym;
    }

    public String getGini ()
    {
        return gini;
    }

    public void setGini (String gini)
    {
        this.gini = gini;
    }

    public String[] getBorders ()
    {
        return borders;
    }

    public void setBorders (String[] borders)
    {
        this.borders = borders;
    }

    public String getPopulation ()
    {
        return population;
    }

    public void setPopulation (String population)
    {
        this.population = population;
    }

}