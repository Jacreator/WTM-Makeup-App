package tech.gdgmakurdi.wtmmakeupapp;

public class Makeup {
    private String makeupTitle;
    private String summary;

    public Makeup(String makeupTitle, String summary) {
        this.makeupTitle = makeupTitle;
        this.summary = summary;
    }

    public String getMakeupTitle() {
        return makeupTitle;
    }

    public void setMakeupTitle(String makeupTitle) {
        this.makeupTitle = makeupTitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
