package tupro2ai;
// @author WELLAEDLI

public class Tupro2AI {

    public static void main(String[] args) {

        //value
        double emosi = 100;
        System.out.println("emosi = "+emosi);
        double provokasi = 18;
        System.out.println("provokasi = "+provokasi);

        // grafik Emosi
        double ELow = 0;
        double EMed = 0;
        double EHigh = 0;
        double EVeryHigh = 0;

        // grafik Provokasi
        double PRendah = 0;
        double PSedang = 0;
        double PTinggi = 0;
        
        double HOAX[] = new double [4]; //membuat banyak if nya sampai 4
        double NoHOAX[] = new double[4];
        int N = 0; // untuk berita tidak hoax
        int Y = 0; // untuk berita Hoax
        
        //EMOSI Low
        
        if (emosi >= 0 && emosi <= 30 ){
            ELow = 1;
        }
        else if (emosi > 30 && emosi < 35) {
            ELow = ((-(emosi - 35))/ (35-30));
        }
        else if (emosi >=35){
            ELow = 0;
        }
        
        //EMOSI Medium
        
        if (emosi > 30 && emosi < 35) {
            EMed = ((emosi - 30)/ (35-30));
        }
        else if (emosi >= 35 && emosi <= 65 ){
            EMed = 1;
        }
        else if (emosi > 65 && emosi < 70) {
            EMed = ((-(emosi - 70))/ (70-65));
        }
        else if (emosi >=70){
            EMed = 0;
        }
       
        //EMOSI High
        
        if (emosi > 65 && emosi < 70) {
            EHigh = ((emosi - 65)/ (70-65));
        }
        else if (emosi >= 70 && emosi <= 85 ){
            EHigh = 1;
        }
        else if (emosi > 85 && emosi < 90) {
            EMed = ((-(emosi - 90))/ (90-85));
        }
        else if (emosi >=90){
            EMed = 0;
        }
        
        // EMOSI Very High
        if (emosi >= 90 && emosi <= 100 ){
            EVeryHigh = 1;
        }
        else if (emosi < 90 && emosi > 85) {
            EVeryHigh = ((emosi - 85)/(90-85));
        }
        else if (emosi >=90){
            EVeryHigh = 0;
        }
        
        //Provokasi 
        
        //Rendah
        if (provokasi >= 0 && provokasi <= 40 ){
            PRendah = 1;
        }
        else if (provokasi > 40 && provokasi < 50) {
            PRendah = ((-(provokasi - 50))/ (50-40));
        }
        else if (emosi >=40){
            PRendah = 0;
        }
        
        //Sedang
        if (provokasi > 40 && provokasi < 50) {
            PSedang = ((provokasi - 40)/ (50-40));
        }
        else if (provokasi >= 50 && provokasi <= 80 ){
            PSedang = 1;
        }
        else if (provokasi > 80 && provokasi < 90){
            PSedang = ((-(provokasi - 90))/ (90-80));
        }
        else if (provokasi >=90){
            PSedang = 0;
        }
        
        //Tinggi
        if (provokasi >= 90 && provokasi <= 100 ){
            PTinggi = 1;
        }
        else if (provokasi < 90 && provokasi > 80) {
            PTinggi = ((provokasi - 80)/(90-80));
        }
        else if (provokasi > 90){
            PTinggi = 0;
        }
        
     // perbandingan untuk data percobaan dan acuan untuk mencari data testing
     
     //Low
     
     if (ELow > 0 && PRendah > 0){
         if (ELow <= PRendah){
             NoHOAX[N] = ELow;
         }
         else {
             NoHOAX[N] = PRendah;
         }
         N++;
     }
     if (ELow > 0 && PSedang > 0){
         if (ELow <= PSedang){
             HOAX[Y] = ELow;
         }
         else {
             HOAX[Y] = PSedang;
         }
         Y++; 
    }
    if (ELow > 0 && PTinggi > 0){
         if (ELow <= PTinggi){
             HOAX[Y] = ELow;
         }
         else {
             HOAX[Y] = PTinggi;
         }
         Y++;
    }
    
    //Medium
    
    if (EMed > 0 && PRendah > 0){
         if (EMed <= PRendah){
             NoHOAX[N] = EMed;
         }
         else {
             NoHOAX[N] = PRendah;
         }
         N++;
    }
     if (EMed > 0 && PSedang > 0){
         if (EMed <= PSedang){
             NoHOAX[N] = EMed;
         }
         else {
             NoHOAX[N] = PSedang;
         }
         N++;
     }
     if (EMed > 0 && PTinggi > 0){
         if (EMed <= PTinggi){
             HOAX[Y] = EMed;
         }
         else {
             HOAX[Y] = PTinggi;
         }
         Y++;
     }
     
     //High 
     
     if (EHigh > 0 && PRendah > 0){
         if (EHigh <= PRendah){
             NoHOAX[N] = EHigh;
         }
         else {
             NoHOAX[N] = PRendah;
         }
         N++;
     }
     if (EHigh > 0 && PSedang > 0){
         if (EHigh <= PSedang){
             HOAX[Y] = EHigh;
         }
         else {
             HOAX[Y] = PSedang;
         }
         Y++;
     }
     if (EHigh > 0 && PTinggi > 0){
         if (EHigh <= PTinggi){
             HOAX[Y] = EHigh;
         }
         else {
             HOAX[Y] = PTinggi;
         }
         Y++;
     }
     
     //Very High
     if (EVeryHigh > 0 && PRendah > 0){
         if (EVeryHigh <= PRendah){
             NoHOAX[N] = EVeryHigh;
         }
         else {
             NoHOAX[N] = PRendah;
         }
         N++;
     }
     if (EVeryHigh > 0 && PSedang > 0){
         if (EVeryHigh <= PSedang){
             HOAX[Y] = EVeryHigh;
         }
         else {
             HOAX[Y] = PSedang;
         }
         Y++;
     }
     if (EVeryHigh > 0 && PTinggi > 0){
         if (EVeryHigh <= PTinggi){
             HOAX[Y] = EVeryHigh;
         }
         else {
             HOAX[Y] = PTinggi;
         }
         Y++;
     }
        /*System.out.println("Emosi: ");
        System.out.println(" ");
        System.out.println("Low = "+ELow);
        System.out.println("Medium = "+EMed);
        System.out.println("High = "+EHigh);
        System.out.println("Very High = "+EVeryHigh);
        
        System.out.println(" ");*/
        
        /*System.out.println("Provokasi: ");
        System.out.println(" ");
        System.out.println("Rendah = "+PRendah);
        System.out.println("Sedang = "+PSedang);
        System.out.println("Tinggi = "+PTinggi);
        
        System.out.println("");
        
        //Array penampung
        System.out.println("HOAX");*/
        for (int i=0; i<4;i++){
            //System.out.println(" "+HOAX[i]);
        }
        //System.out.println("No HOAX");
        for(int i=0; i<4;i++){
           // System.out.println(" "+NoHOAX[i]);
        }
        System.out.println(" ");
        double t = 0;
        for (int i=0; i<4;i++){
            if(t<=NoHOAX[i]){
                t = NoHOAX[i];
            }
        }
       // System.out.println("No HOAX: "+x);
        
        double h = 0;
        for(int i=0; i<4;i++){
            if(h<=HOAX[i]){
                h = HOAX[i];
             }
        }
        //System.out.println("HOAX: "+h);
            
       //Defuzzy SUGENO
       double ystar;
       ystar = ((h*70)+(t*55)/(h+t));
           // System.out.println("Y* = "+ystar);
            
       if (ystar <= 55){
                System.out.println("Berita Tidak HOAX");
        }
       else{
           System.out.println("Berita HOAX");
       }
    }     
}
    
