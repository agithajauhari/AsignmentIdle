import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
// import java.util.concurrent.TimeUnit;

public class blq {
  public static void main(String[] args) throws ParseException {
    Scanner input = new Scanner(System.in);
		System.out.print("Pilih Soal: ");
		int pilihSoal = input.nextInt();

		Scanner inputSoal = new Scanner(System.in);

		switch (pilihSoal) {
		case 1: {
			nomor1(inputSoal);
			break;
		}
		case 2: {
			nomor2(inputSoal);
			break;
		}
		case 3: {
			nomor3(inputSoal);
			break;
		}
		case 4: {
			nomor4(inputSoal);
			break;
		}
		case 5: {
			nomor5(inputSoal);
			break;
		}
		case 6: {
			nomor6(inputSoal);
			break;
		}
		case 7: {
			nomor7(inputSoal);
			break;
		 }
		case 8: {
			nomor8(inputSoal);
			break;
		}
		case 9: {
			nomor9(inputSoal);
			break;
		}
		case 10: {
			nomor10(inputSoal);
			break;
		}
		case 11: {
			nomor11(inputSoal);
			break;
		}
		case 12: {
			nomor12(inputSoal);
			break;
		}
		case 13: {
			nomor13(inputSoal);
			break;
		}
		case 14: {
			nomor14(inputSoal);
			break;
		}
		case 15: {
			nomor15(inputSoal);
			break;
		}
		case 16: {
			nomor16(inputSoal);
			break;
		}
		case 17: {
			nomor17(inputSoal);
			break;
		}
		case 18: {
			nomor18(inputSoal);
			break;
		}
		case 19: {
			nomor19(inputSoal);
			break;
		}
		case 20: {
			nomor20(inputSoal);
			break;
		}
		case 21: {
			nomor21(inputSoal);
			break;
		}
		case 22: {
			nomor22(inputSoal);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + pilihSoal);
		}

		System.out.println();
	}

  static void nomor1(Scanner inputSoal){
//		initiate harga barang
		int[] kacamata = { 500, 600, 700, 800 }, baju = { 200, 400, 350 }, sepatu = { 400, 350, 200, 300 },
    buku = { 100, 50, 150 };
//		initiate nama barang
    String[] namaBarang = { "Kacamata: ", "Baju: ", "Sepatu: ", "Buku: " };

//		multidimensional array, kiri id kanan harga
    int[][] barangBelanjaan = { { 1, 0 }, { 2, 0 }, { 3, 0 }, { 4, 0 } };

    System.out.print("Uang yang dimiliki: ");
    int uang = inputSoal.nextInt();
    Arrays.sort(kacamata);
    Arrays.sort(baju);
    Arrays.sort(sepatu);
    Arrays.sort(buku);

    for (int i = 0; i < kacamata.length; i++) {
      if (kacamata[i] <= uang+barangBelanjaan[0][1] && barangBelanjaan[0][1] < kacamata[i]) {
        uang += barangBelanjaan[0][1];
        barangBelanjaan[0][1] = kacamata[i];
        uang -= kacamata[i];
      }
      if (sepatu[i] <= uang+barangBelanjaan[2][1] && barangBelanjaan[2][1] < sepatu[i]) {
        uang += barangBelanjaan[2][1];
        barangBelanjaan[2][1] = sepatu[i];
        uang -= sepatu[i];
      }
      if (i >= 3) {
      break;
      }
      if (baju[i] <= uang+barangBelanjaan[1][1] && barangBelanjaan[1][1] < baju[i]) {
        uang += barangBelanjaan[1][1];
        barangBelanjaan[1][1] = baju[i];
        uang -= baju[i];
      }
      if (buku[i] <= uang+barangBelanjaan[3][1] && barangBelanjaan[3][1] < buku[i]) {
        uang += barangBelanjaan[3][1];
        barangBelanjaan[3][1] = buku[i];
        uang -= buku[i];
      }
    }

    System.out.println("Barang yang bisa dibeli: ");
    for (int i = 0; i < barangBelanjaan.length; i++) {
    System.out.print(namaBarang[i]);
    System.out.println(barangBelanjaan[i][1]);
    }


  }
  
  static void nomor2(Scanner inputSoal) throws ParseException{
    String stringFormat = "dd MMMM yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(stringFormat, new Locale("id", "ID"));
		System.out.print("Input tanggal peminjaman (contoh format 17 Desember 2023): ");
		String inputTanggal = inputSoal.nextLine();
		System.out.print("Input tanggal pengembalian (contoh format 23 Desember 2023): ");
		String inputTanggal2 = inputSoal.nextLine();
		System.out.print("Nama Buku: ");
		String inputBuku = inputSoal.nextLine();
		long tanggalDenda, totalDenda;
    // String []ArrayTglAwal = new String[3];
    // String []ArrayTglAkhir = new String[3];
    // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");

		
    Date date = dateFormat.parse(inputTanggal);
		Date date2 = dateFormat.parse(inputTanggal2);
    LocalDate dateLokal = date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    LocalDate dateLokal2 = date2.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    int selisihConverter = (int) ChronoUnit.DAYS.between(dateLokal, dateLokal2);
		switch (inputBuku) {
		case "A": {
			tanggalDenda = selisihConverter - 14;
			totalDenda = tanggalDenda * 100;
			if (totalDenda >= 0) {
				System.out.println("Jumlah denda: " + totalDenda);
			} else {
				System.out.print("Jumlah denda: 0");
			}
			break;
		}
		case "B": {
			tanggalDenda = selisihConverter - 3;
			totalDenda = tanggalDenda * 100;
			if (totalDenda >= 0) {
				System.out.println("Jumlah denda: " + totalDenda);
			} else {
				System.out.print("Jumlah denda: 0");
			}
			break;
		}
		case "C": {
			tanggalDenda = selisihConverter - 7;
			totalDenda = tanggalDenda * 100;
			if (totalDenda >= 0) {
				System.out.println("Jumlah denda: " + totalDenda);
			} else {
				System.out.print("Jumlah denda: 0");
			}
			break;
		}
		case "D": {
			tanggalDenda = selisihConverter - 7;
			totalDenda = tanggalDenda * 100;
			if (totalDenda >= 0) {
				System.out.println("Jumlah denda: " + totalDenda);
			} else {
				System.out.print("Jumlah denda: 0");
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + inputBuku);
		}

  }
  
  static void nomor3(Scanner inputSoal){


  }

  static void nomor4(Scanner inputSoal){
    Scanner prima = new Scanner(System.in);
    System.out.println("Input N : ");
    int n = prima.nextInt();
    int[] a = new int[n];
    int k = 1;
    

    for (int i = 1; i <= n; i++){
      int term = 0;
      

      for (int j = 1; j<=i; j++){
        if(i%j==0){
          term = term + 1;
        }
      }
        if (term==2){
          a[k-1] = i;
          System.out.print(i+ ", ");
          k++;
      }

    }
    System.out.println(a[0]);

  }

  static void nomor5(Scanner inputSoal){

    Scanner fibo = new Scanner(System.in);
    System.out.print("Input N : ");
    int input = fibo.nextInt();
    int[] kiw = new int[input];

    int firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + input + " terms:");

    for (int i = 1; i <= input; ++i) {
      kiw[i-1] = firstTerm;

      if (i == input){
        System.out.println(firstTerm);
      }else
      {
        System.out.print(firstTerm + ", ");
      }
      

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
    System.out.println(kiw[0]);
    // Scanner lanjut = new Scanner(System.in);
    // System.out.println("Pilih soal lagi ? (Y/N)");
    // char jwb = lanjut.next().charAt(0);
    // if (jwb == true) {
      
    // }
  }

  static void nomor6(Scanner inputSoal){
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan kata :");
    String teks = input.nextLine();

    String poli = "";					
    for(int i=teks.length()-1; i>-1; i--){
			char c = teks.charAt(i);			
			poli += String.valueOf(c);
		}
		
		if(teks.equalsIgnoreCase(poli)){
			System.out.println("Ini palindrome");
		}else{
			System.out.println("Ini bukan palindrome");
		}
  }

  static void nomor7(Scanner inputSoal){
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan bilangan : ");
    String bil = input.nextLine();
    String pisah[] = bil.split(" ");
    int angka[] = new int[pisah.length];

    for(int i=0; i<pisah.length; i++){
      angka[i] = Integer.parseInt(pisah[i]);
    }

    Arrays.sort(angka);
    
//MEAN
    double mean = 0;
    for(int j=0; j<angka.length; j++){
      mean += angka[j]; 
    }
    mean = mean/angka.length;
    System.out.println("MEAN = " + mean);
    
//MEDIAN
    int median = 0;
    if (angka.length%2 != 0){
      median = angka.length/2;
      median = angka[median];
    }else{
      median = (angka[(angka.length-1)/2] + angka[((angka.length-1)/2)+1])/2;
      System.out.println(median);
      System.out.println(5/2);
    }

    //MODUS
    int[] valueAngka = new int[10];
        
        for(int k = 0; k < angka.length;k++){
            int index = angka[k];
           valueAngka[index] ++;
        }
        
        int[] sortValueAngka = Arrays.copyOf(valueAngka, 10);
        Arrays.sort(sortValueAngka);
        int nilaiMax = sortValueAngka[9];
        List<Integer> listModus = new ArrayList<>();
        for(int i = 0; i < valueAngka.length;i++){
            if (valueAngka[i] == nilaiMax) {
                listModus.add(i);
            }
        }
        Collections.sort(listModus); 
        System.out.println("Nilai modusnya adalah "+ listModus.get(0));
   }
      
  static void nomor8(Scanner inputSoal){
    System.out.println("Input deret angka: ");
		String deretAngka1 = inputSoal.nextLine();
		String[] deretArray = deretAngka1.split(" ");
		int[] deretAngka = new int[deretArray.length];

//		int[] deretAngka = { 1, 2, 4, 7, 8, 6, 9 };
		for (int i = 0; i < deretArray.length; i++) {
			deretAngka[i] = Integer.parseInt(deretArray[i]);
		}

		int maxNilai = 0, minNilai = 0;
		Arrays.sort(deretAngka);
		int n = 0;
		for (int i = deretAngka.length - 1; i >= 0; i--) {
			if (n < 4) {
				maxNilai += deretAngka[i];
				n++;
			}
			if (i < 4) {
				minNilai += deretAngka[i];
			}
		}

		System.out.println("Nilai min: " + minNilai);
		System.out.println("Nilai min: " + maxNilai);

  }

  static void nomor9(Scanner inputSoal){
    System.out.print("N = ");
		int nilai = inputSoal.nextInt();
		int nilai1 = nilai;
		System.out.print("Hasil: ");
		for (int i = 0; i < nilai; i++) {
			System.out.print(nilai1 + " ");
			nilai1 = nilai + nilai1;
		}  
  }
  
  static void nomor10(Scanner inputSoal){
    System.out.print("Input: ");
		String inputan = inputSoal.nextLine();
		String[] inputanArray = inputan.split(" ");
		for (int i = 0; i < inputanArray.length; i++) {
			String perKata = inputanArray[i];
			for (int j = 0; j < perKata.length(); j++) {
				char[] perKataArray = perKata.toCharArray();
				if (j > 0 && j < perKataArray.length - 1) {
					System.out.print("*");
				} else {
					System.out.print(perKataArray[j]);
				}
			}
			System.out.print(" ");
		}
  }

  static void nomor11(Scanner inputSoal){
    System.out.print("Input: ");
		String inputan = inputSoal.nextLine();
		char[] inputanArray = inputan.toCharArray();
		for (int i = inputanArray.length - 1; i >= 0; i--) {
			for (int j = 0; j < inputanArray.length; j++) {
				if (j == inputanArray.length / 2) {
					System.out.print(inputanArray[i]);
				} else {
					System.out.print("*");
				}
			}
			if (inputan.length() % 2 == 0)
				System.out.print("*");
			System.out.println();
		}
  }

  static void nomor12(Scanner inputSoal){
    System.out.println("Input deret angka: ");
		String deretAngka1 = inputSoal.nextLine();
		String[] deretArray = deretAngka1.split(" ");
		int[] deretAngka = new int[deretArray.length];

//		int[] deretAngka = { 1, 2, 4, 7, 8, 6, 9 };
		for (int i = 0; i < deretArray.length; i++) {
			deretAngka[i] = Integer.parseInt(deretArray[i]);
		}
		int temporary;
		for (int i = 0; i < deretAngka.length; i++) {
			for (int j = i + 1; j < deretAngka.length; j++) {
				if (deretAngka[i] > deretAngka[j]) {
					temporary = deretAngka[i];
					deretAngka[i] = deretAngka[j];
					deretAngka[j] = temporary;
				}
			}
			System.out.print(deretAngka[i] + " ");
		}

  }

  static void nomor13(Scanner inputSoal){
    double jam = 2, menit = 20;

		if (jam < 0 || menit < 0 || jam > 12 || menit > 60)
			System.out.println("Wrong input");

		if (jam == 12)
			jam = 0;
		if (menit == 60) {
			menit = 0;
			jam += 1;
			if (jam > 12)
				jam = jam - 12;
		}

		int derajatMenit = (int) (0.5 * (jam * 60 + menit));
		int derajatJam = (int) (6 * menit);
		int derajatWaktu = Math.abs(derajatJam - derajatMenit);
		derajatWaktu = Math.min(360 - derajatWaktu, derajatWaktu);
		
		System.out.println(derajatWaktu);
  }

  static void nomor14(Scanner inputSoal){
    System.out.println("Bilangan Awaal: 3 9 0 7 1 2 4");
		int[] deretAngka = { 3, 9, 0, 7, 1, 2, 4 };
		System.out.print("Input N: ");
		int inputN = inputSoal.nextInt();
		int[] dummyArray = new int[inputN];
		System.out.print("Hasil:");
		int temporary, counter = 0;

		if (inputN % deretAngka.length == 0) {
			for (int i = 0; i < deretAngka.length; i++) {
				System.out.print(" " + deretAngka[i]);
			}
		} else {
			if (inputN > deretAngka.length)
				inputN = inputN % deretAngka.length;
			for (int i = 0; i < inputN; i++) {
				dummyArray[i] = deretAngka[i];
			}
			for (int i = 0; i < deretAngka.length; i++) {
				if (deretAngka.length - i > inputN) {
					temporary = deretAngka[i];
					deretAngka[i] = deretAngka[i + inputN];
					deretAngka[i + inputN] = temporary;
				} else {
					deretAngka[i] = dummyArray[counter];
					counter++;
				}

				System.out.print(" " + deretAngka[i]);

			}
		}
  }

  static void nomor15(Scanner inputSoal) throws ParseException{
    System.out.println("Input waktu (AM/PM): ");
		String waktu = inputSoal.nextLine();
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
		Date date = parseFormat.parse(waktu);
		System.out.println(displayFormat.format(date));
  }

  static void nomor16(Scanner inputSoal){
    System.out.print("Tuna Sandwich: ");
		int tunaSandwich = inputSoal.nextInt();
		double totalTuna = ((tunaSandwich * 0.15) + tunaSandwich) / 3;
		System.out.print("Spaghetti Carbonara: ");
		int spaghettiCarbonara = inputSoal.nextInt();
		double totalSpaghetti = ((spaghettiCarbonara * 0.15) + spaghettiCarbonara) / 4;
		System.out.print("Tea Pitcher: ");
		int teaPitcher = inputSoal.nextInt();
		double totalTea = ((teaPitcher * 0.15) + teaPitcher) / 4;
		System.out.print("Pizza: ");
		int pizzaMenu = inputSoal.nextInt();
		double totalPizza = ((pizzaMenu * 0.15) + pizzaMenu) / 4;
		System.out.print("Salad: ");
		int saladMenu = inputSoal.nextInt();
		double totalSalad = ((saladMenu * 0.15) + saladMenu) / 4;

		System.out.println(
				"Total harga untuk yang alergi ikan: " + (int) (totalSpaghetti + totalTea + totalPizza + totalSalad));
		System.out.println("Total harga untuk yang lainnya: "
				+ (int) (totalTuna + totalSpaghetti + totalTea + totalPizza + totalSalad));
  }

  static void nomor17(Scanner inputSoal){
    System.out.println("Input N/T: ");
		String inputNT = inputSoal.nextLine().trim();
		String inputNT2 = inputNT.replace(" ", "");
		char[] deretNT = new char[inputNT2.length()];

//		int[] deretAngka = { 1, 2, 4, 7, 8, 6, 9 };
		for (int i = 0; i < inputNT2.length(); i++) {
			deretNT[i] = inputNT2.charAt(i);
		}
//		char[] naikTurun = { 'N', 'N', 'T', 'N', 'N', 'N', 'T', 'T', 'T', 'T', 'T', 'N', 'T', 'T', 'T', 'N', 'T', 'N' };
		int gunungCount = 0, lembahCount = 0;
		for (int i = 0; i < deretNT.length; i++) {
			if (i == deretNT.length - 1) {
				break;
			} else if (deretNT[i] == 'N' && deretNT[i + 1] == 'T') {
				gunungCount++;
			} else if (deretNT[i] == 'T' && deretNT[i + 1] == 'N') {
				lembahCount++;
			}
		}

		System.out.println("Gunung yang Dilewati: " + gunungCount);
		System.out.println("Lembah yang Dilewati: " + lembahCount);
  }

  static void nomor18(Scanner inputSoal){
    int[] jamMakanKue = {9,13,15,17};
        int[] kaloriKue   = {30,20,50,80};
        int waktuTotalBerolahraga = 0;
        int jamMulaiOlahraga = 18;
        int selisihWaktu = 0;
       

        for(int i = 0; i < jamMakanKue.length;i++){
            selisihWaktu = jamMulaiOlahraga - jamMakanKue[i];
            double menitOlahraga = 0.1 * kaloriKue[i] * selisihWaktu;
            waktuTotalBerolahraga += menitOlahraga;
        }
        System.out.println(waktuTotalBerolahraga);

        int totalMinum = waktuTotalBerolahraga / 30;
        int totalCCAir = totalMinum * 100 ; 
        int totalMinumAir = totalCCAir + 500 ;
        
        System.out.println(totalMinumAir +" "+"CC Air Minum");
  }

  static void nomor19(Scanner inputSoal){
    boolean[] alfabet = new boolean[26];
     //   String kalimat = "Check back tomorrow; I will see if the book has arrived";
        String[] beberapaKalimat = {"Sphinx of black quartz, judge my vow",
        "Brawny gods just flocked up to quiz and vex him","Check back tomorrow; I will see if the book has arrived"};
        int index = 0;
        boolean pangram = true;

        for(int i = 0; i < beberapaKalimat.length;i++){
            if(beberapaKalimat[i].length()>26){
                for(int j = 0 ; j < beberapaKalimat[i].length();j++){
                    char huruf = beberapaKalimat[i].charAt(j);
                    if(huruf >= 'A'&& huruf <= 'Z'){
                        index = huruf - 'A';
                    }else if(huruf >= 'a'&& huruf <= 'z'){
                        index = huruf - 'a';
                    }
                    alfabet[index] = true;
                }
            }else{
                pangram = false;
            }
            for(int k = 0 ; k < alfabet.length;k++){
                if(alfabet[k]==false){
                    pangram = false;
                    break;
                }
            }
            if(pangram){
                System.out.println(beberapaKalimat[i]);
                System.out.println("Ini adalah kalimat pangram!");
                System.out.println();
            }else{
                System.out.println(beberapaKalimat[i]);
                System.out.println("Ini bukan kalimat pangram!");
                System.out.println();
            }
            alfabet = new boolean[26];
        }
  }

  static void nomor20(Scanner inputSoal){
    String a ="GGG";
        String b ="KBK";
        int jarak = 4;
        int moveA = 0;
        int moveB = 0;
        for(int i = 0; i < 3;i++){
            if(a.charAt(i) == 'G'&& b.charAt(i) == 'K'||
            a.charAt(i) == 'B'&& b.charAt(i) == 'G'|| a.charAt(i) == 'K'&& b.charAt(i) == 'B'){
                jarak -= 1;
                moveA += 2;
                moveB -=1;
            }else if(b.charAt(i) == 'G'&& a.charAt(i) == 'K'||
            b.charAt(i) == 'B'&& a.charAt(i) == 'G'|| b.charAt(i) == 'K'&& a.charAt(i) == 'B'){
                jarak -= 1;
                moveB += 2;
                moveA -= 1;
            }
            if(jarak == 0){
                break;
            }
        }
        if(jarak == 0 && moveA > moveB){
            System.out.println("A pemenangnya!");
        }else if(jarak == 0 && moveB > moveA){
            System.out.println("B pemenangnya!");
        }else{
            System.out.println("Tidak ada pemenang");
        }
  }

  static void nomor21(Scanner inputSoal){
    
  }

  static void nomor22(Scanner inputSoal){
    int[] lilinMeleleh = {1,1,2,3,5,8,13};
        int[] panjangLilin = {3,3,9,6,7,8,23};  
        int[] sisaLilin = new int[7];
        int stop = 1;
        for(int i = 1; i <= panjangLilin.length;i++){
            for(int j = 0; j<panjangLilin.length;j++){
                sisaLilin[j] = panjangLilin[j]-lilinMeleleh[j];
            }
           for(int k = 0; k < sisaLilin.length;k++){
            if(sisaLilin[k]== 0 ){
                stop = 0;
                break;
            }
           }
           if (stop == 0) {
            break;
           }
        }
        for(int i=0;i<sisaLilin.length;i++){
            if(sisaLilin[i] == 0){
                System.out.println("Lilin yg pertama kali habis Lilin ke- "+ i);
            }
        }
  }
}