package data;

public class DragonHead {

    private Long size; //Поле может быть null
    private double eyesCount;
    private Float toothCount; //Поле не может быть null

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public double getEyesCount() {
        return eyesCount;
    }

    public void setEyesCount(double eyesCount) {
        this.eyesCount = eyesCount;
    }

    public Float getToothCount() {
        return toothCount;
    }

    public void setToothCount(Float toothCount) {
        this.toothCount = toothCount;
    }

    public DragonHead(Long size, double eyesCount, Float toothCount) {
        this.size = size;
        this.eyesCount = eyesCount;
        this.toothCount = toothCount;
    }

    @Override
    public String toString() {
        return "DragonHead{" +
                "size=" + size +
                ", eyesCount=" + eyesCount +
                ", toothCount=" + toothCount +
                '}';
    }
}