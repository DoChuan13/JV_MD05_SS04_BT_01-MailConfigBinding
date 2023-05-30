package backend.model;

public class MailConfig {
    private int id;
    private String language;
    private int page;
    private boolean spamFilter;
    private String signature;

    public MailConfig() {
    }

    public MailConfig(int id, String language, int page, boolean spamFilter, String signature) {
        this.id = id;
        this.language = language;
        this.page = page;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", page=" + page +
                ", spamFilter=" + spamFilter +
                ", signature='" + signature + '\'' +
                '}';
    }
}
