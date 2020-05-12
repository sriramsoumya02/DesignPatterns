package visitor.Exercise;

public class Demo {
    public static void main(String[] args) {
        WavFile x = WavFile.read("testing.txt");
        x.applyFilter(new ReduceNoise());
        x.applyFilter(new AddReverb());
        x.applyFilter(new NormalizeFilter());
    }
}
