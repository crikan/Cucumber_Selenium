package components;

public class WebElement {

    public WebElement(String name,String type, String locator, boolean visible){
        this.name = name;
        this.type = type;
        this.locator = locator;
        this.visible = visible;
    }
    // Without a default constructor, Jackson will throw an exception
    public WebElement() {}

    private String name;
    private String type;
    private String locator;
    private boolean visible;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
