
public class MayBay extends PhuongTienDiChuyen {
		private String loaiNhienLien;

		public MayBay(HangSanXuat hangSanXuat, String loaiNhienLien) {
			super("May Bay", hangSanXuat);
			this.loaiNhienLien = loaiNhienLien;
		}

		public String getLoaiNhienLien() {
			return loaiNhienLien;
		}

		public void setLoaiNhienLien(String loaiNhienLien) {
			this.loaiNhienLien = loaiNhienLien;
		}

		@Override
		public double layVanToc() {
			return 1000; 
		} 
		
}
