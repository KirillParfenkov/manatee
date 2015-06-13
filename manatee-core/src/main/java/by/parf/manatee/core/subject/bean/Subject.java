package by.parf.manatee.core.subject.bean;

/**
 * Created by parf on 13.6.15.
 */
public class Subject {

    private MetaData metaData;
    private String representation;

    public Subject() {
    }

    public Subject(MetaData metaData, String representation) {
        this.metaData = metaData;
        this.representation = representation;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }
}
