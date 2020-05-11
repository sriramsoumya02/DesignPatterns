package command.exercise;

public class VideoEditor {
    private String label;
    private float contrast = 0.5f;

    public String getLabel() {
        return label;
    }

    public void removeLabel() {
        this.label = "";
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "label='" + label + '\'' +
                ", contrast=" + contrast +
                '}';
    }
}
