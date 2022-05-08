package Static;
    public class Configs {
        //Cau Hinh So Luong Hinh Hoc
        public static final int So_Luong_Hinh_Toi_Thieu = 0;
        public static final int So_Luong_Hinh_Toi_Da = 5;
        //Cac Cau Hinh Khac
        public static final float PI = 3.14f;
        public static final float Inch_Cm = 2.54f;
        public static final int Don_Vi_Cm = 1; 
        public static final int Don_Vi_Inch = 2; 
        public static int donVi = Don_Vi_Cm; 
    
        //Phuong Thuc Static Chuyen Doi Don Vi Tu CM Sang INCH
        public static float Chuyen_Cm_Sang_Inch(float cm)
        {
            float inch = cm / Inch_Cm;
            return inch;
        }
    
        ///Phuong Thuc Static Chuyen Doi Don Vi Tu INCH Sang CM
        public static float Chuyen_Inch_Sang_Cm(float inch)
        {
            float cm = inch * Inch_Cm;
            return cm;
        }
    }
