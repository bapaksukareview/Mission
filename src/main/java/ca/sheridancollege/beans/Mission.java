package ca.sheridancollege.beans;

public class Mission {

    private Long id;
    private String agent;
    private String title;
    private String gadget1;
    private String gadget2;

    // ===== GETTERS =====
    public Long getId() {
        return id;
    }

    public String getAgent() {
        return agent;
    }

    public String getTitle() {
        return title;
    }

    public String getGadget1() {
        return gadget1;
    }

    public String getGadget2() {
        return gadget2;
    }

    // ===== SETTERS =====
    public void setId(Long id) {
        this.id = id;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGadget1(String gadget1) {
        this.gadget1 = gadget1;
    }

    public void setGadget2(String gadget2) {
        this.gadget2 = gadget2;
    }
}
