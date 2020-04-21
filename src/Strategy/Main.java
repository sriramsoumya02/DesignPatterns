package Strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageStore imgStore= new ImageStore();
		PNGCompressor png= new PNGCompressor();
		JPEGCompressor jpeg= new JPEGCompressor();
		BWFilter bw= new BWFilter();
		HighContrastFilter hcFilter= new HighContrastFilter();
		imgStore.store("1234",png,bw);
		imgStore.store("2344",jpeg,hcFilter);
		imgStore.store("7657",png,hcFilter);
	}

}
