package com.company;

import java.util.ArrayList;

public class Browser {
    private String browserName;
    public ArrayList<Tabs> moreTabs;
    public ArrayList<Tabs> getMoreTabs() {
        return moreTabs;
    }

    public void setMoreTabs(ArrayList<Tabs> moreTabs) {
        this.moreTabs = moreTabs;
    }



    public Browser()
    {
        moreTabs = new ArrayList<Tabs>();
    }
//    public ArrayList<Tabs>getmoretabs(){
//       return getmoretabs() ;
//    }
    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }
public void addTabs(Tabs eTabs)
{
    moreTabs.add(eTabs);
}


}
