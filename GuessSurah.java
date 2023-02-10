import java.util.Scanner;
public class GuessSurah {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int randsurah, ans, CorrectGuess=0, WrongGuess = 0;
        int[] delete = new int[115];
        System.out.println("\t~~~ WELCOME TO A GAME CALLED THE SURAHS IN THE QURAN ~~~");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------");
        System.out.println("You need to guess the correct sequence numbers of each of the 114 surahs in the Quran.");
        System.out.println("The game terminates when you made 3 wrong answers OR when you has answered ALL of the surah numbers correctly");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        
        do{
            do{
            randsurah=randomsurah();
            }
                 while(randsurah==delete[1] ||  randsurah==delete[2] ||  randsurah==delete[3] ||  randsurah==delete[4] ||  randsurah==delete[5] ||  randsurah==delete[6] || randsurah==delete[7]
                    || randsurah==delete[8] ||  randsurah==delete[9] ||  randsurah==delete[10] || randsurah==delete[11] || randsurah==delete[12] || randsurah==delete[13]
                    || randsurah==delete[14] || randsurah==delete[15] || randsurah==delete[16] || randsurah==delete[17] || randsurah==delete[18] || randsurah==delete[19]
                    || randsurah==delete[20] || randsurah==delete[21] || randsurah==delete[22] || randsurah==delete[23] || randsurah==delete[24] || randsurah==delete[25]
                    || randsurah==delete[26] || randsurah==delete[27] || randsurah==delete[28] || randsurah==delete[29] || randsurah==delete[30] || randsurah==delete[31]
                    || randsurah==delete[32] || randsurah==delete[33] || randsurah==delete[34] || randsurah==delete[35] || randsurah==delete[36] || randsurah==delete[37]
                    || randsurah==delete[38] || randsurah==delete[39] || randsurah==delete[40] || randsurah==delete[41] || randsurah==delete[42] || randsurah==delete[43]
                    || randsurah==delete[44] || randsurah==delete[45] || randsurah==delete[46] || randsurah==delete[47] || randsurah==delete[48] || randsurah==delete[49]
                    || randsurah==delete[50] || randsurah==delete[51] || randsurah==delete[52] || randsurah==delete[53] || randsurah==delete[54] || randsurah==delete[55]
                    || randsurah==delete[56] || randsurah==delete[57] || randsurah==delete[58] || randsurah==delete[59] || randsurah==delete[60] || randsurah==delete[61]
                    || randsurah==delete[62] || randsurah==delete[63] || randsurah==delete[64] || randsurah==delete[65] || randsurah==delete[66] || randsurah==delete[67]
                    || randsurah==delete[68] || randsurah==delete[69] || randsurah==delete[70] || randsurah==delete[71] || randsurah==delete[72] || randsurah==delete[73]
                    || randsurah==delete[74] || randsurah==delete[75] || randsurah==delete[76] || randsurah==delete[77] || randsurah==delete[78] || randsurah==delete[79]
                    || randsurah==delete[80] || randsurah==delete[81] || randsurah==delete[82] || randsurah==delete[83] || randsurah==delete[84] || randsurah==delete[85]
                    || randsurah==delete[86] || randsurah==delete[87] || randsurah==delete[88] || randsurah==delete[89] || randsurah==delete[90] || randsurah==delete[91]
                    || randsurah==delete[92] || randsurah==delete[93] || randsurah==delete[94] || randsurah==delete[95] || randsurah==delete[96] || randsurah==delete[97]
                    || randsurah==delete[98] || randsurah==delete[99] || randsurah==delete[100] || randsurah==delete[101] || randsurah==delete[102] || randsurah==delete[103]
                    || randsurah==delete[104] || randsurah==delete[105] || randsurah==delete[106] || randsurah==delete[107] || randsurah==delete[108] || randsurah==delete[109]
                    || randsurah==delete[110] || randsurah==delete[111] || randsurah==delete[112] || randsurah==delete[113] || randsurah==delete[114]);
            //loop when the deleted surah's number is same with random number
                            
            printsurah(randsurah);
            System.out.print("Surah number in Al-Quran : "); // get the answer from user
            ans = input.nextInt();               
                 if(ans == randsurah)
                 {
                    System.out.println("CORRECT!");  
                    CorrectGuess++;
                    deletesurah(ans,delete,randsurah);
                 }
                 
                else
                 {
                    System.out.println("WRONG!");
                    WrongGuess++;
                 }
        }
        while(WrongGuess<3 && CorrectGuess<114); // loop until user guess all the answers correctly or wrongly guess more than 3
        System.out.println("\nWELL DONE! TRY AGAIN AND AGAIN \nCorrect answers : " +CorrectGuess+ " \nWrong answers : " +WrongGuess); 
        }
  
    public static int randomsurah()
    {
       int randsurah = ((int) (Math.random() * (114) +1)); //get random number for surah
       return randsurah;
    }
    public static void printsurah(int surah)
    {
        switch(surah){              
               case 1 :System.out.println("\nAl- Fatihah");break; 
               case 2 :System.out.println("\nAl- Baqarah");;break; 
               case 3 :System.out.println("\nAl- Imran");break;
               case 4 :System.out.println("\nAn- Nisa'"); break;
               case 5 :System.out.println("\nAl- Ma'idah");break;
               case 6 : System.out.println("\nAl-An'am");break;
               case 7 :System.out.println("\nAl-A'raf");break;
               case 8 : System.out.println("\nAl- Anfal"); break;
               case 9 :System.out.println("\nAt-Tawbah"); break;                case 10 : System.out.println("\nYunus"); break;
               case 11 : System.out.println("\nHud"); break;                    case 12 : System.out.println("\nYusuf"); break;
               case 13 : System.out.println("\nAr-Ra'd"); break;                case 14 : System.out.println("\nIbrahim"); break;
               case 15 : System.out.println("\nAl-Hijr"); break;                case 16 : System.out.println("\nAn-Nahl"); break;
               case 17 : System.out.println("\nAl-Isra"); break;                case 18 : System.out.println("\nAl-Kahf"); break;
               case 19 : System.out.println("\nMaryam"); break;                 case 20 : System.out.println("\nTa-Ha"); break;
               case 21 : System.out.println("\nAl-Anbiya"); break;              case 22 : System.out.println("\nAl-Hajj"); break;
               case 23 : System.out.println("\nAl-Mu'minun"); break;            case 24 : System.out.println("\nAn-Nur"); break;
               case 25 : System.out.println("\nAl-Furqan"); break;              case 26 : System.out.println("\nAsh-Shu'ara"); break;
               case 27 : System.out.println("\nAn-Naml"); break;                case 28 : System.out.println("\nAl-Qasas"); break;
               case 29 : System.out.println("\nAl-Ankabut"); break;             case 30 : System.out.println("\nAr-Rum"); break;
               case 31 : System.out.println("\nLuqmaan"); break;                case 32 : System.out.println("\nAs-Sajdah"); break;
               case 33 : System.out.println("\nAl-Ahzaab"); break;              case 34 : System.out.println("\nSaba"); break;
               case 35 : System.out.println("\nFaatir"); break;                 case 36 : System.out.println("\nYa-Sin"); break;
               case 37 : System.out.println("\nAs-Saaffaat"); break;            case 38 : System.out.println("\nSaad"); break;
               case 39 : System.out.println("\nAz-Zumar"); break;               case 40 : System.out.println("\nGhafir"); break;
               case 41 : System.out.println("\nFussilat"); break;               case 42 : System.out.println("\nAsh-Shura"); break;
               case 43 : System.out.println("\nAz-Zukhruf"); break;             case 44 : System.out.println("\nAd-Dukhaan"); break;
               case 45 : System.out.println("\nAl-Jaathiyah"); break;           case 46 : System.out.println("\nAl-Ahqaaf"); break;
               case 47 : System.out.println("\nMuhammad"); break;               case 48 : System.out.println("\nAl-Fath"); break;
               case 49 : System.out.println("\nAl-Hujuraat"); break;            case 50 : System.out.println("\nQaaf"); break;
               case 51 : System.out.println("\n	Adh-Dhaariyaat"); break;        case 52 : System.out.println("\nAt-Toor"); break;
               case 53 : System.out.println("\nAn-Najm"); break;                case 54 : System.out.println("\nAl-Qamar"); break;
               case 55 : System.out.println("\nAr-Rahman"); break;              case 56 : System.out.println("\nAl-Waqi'ah"); break;
               case 57 : System.out.println("\nAl-Hadeed"); break;              case 58 : System.out.println("\nAl-Mujadila"); break;
               case 59 : System.out.println("\nAl-Hashr"); break;               case 60 : System.out.println("\nAl-Mumtahanah"); break;
               case 61 : System.out.println("\nAs-Saff"); break;                case 62 : System.out.println("\nAl-Jumu'ah"); break;
               case 63 : System.out.println("\nAl-Munafiqoon"); break;          case 64 : System.out.println("\nAt-Taghabun"); break;
               case 65 : System.out.println("\nAt-Talaq"); break;               case 66 : System.out.println("\nAt-Tahreem"); break;
               case 67 : System.out.println("\nAl-Mulk"); break;                case 68 : System.out.println("\nAl-Qalam"); break;
               case 69 : System.out.println("\nAl-Haaqqa"); break;              case 70 : System.out.println("\nAl-Ma'aarij"); break;
               case 71 : System.out.println("\nNuh"); break;                    case 72 : System.out.println("\nAl-Jinn"); break;
               case 73 : System.out.println("\nAl-Muzzammil"); break;           case 74 : System.out.println("\nAl-Muddaththir"); break;
               case 75 : System.out.println("\nAl-Qiyamah"); break;             case 76 : System.out.println("\nAl-Insaan"); break;
               case 77 : System.out.println("\nAl-Mursalaat"); break;           case 78 : System.out.println("\nAn-Naba'"); break;
               case 79 : System.out.println("\n	Al-Nazi'at"); break;            case 80 : System.out.println("\nAbasa"); break;
               case 81 : System.out.println("\nAt-Takweer"); break;             case 82 : System.out.println("\nAl-Infitar"); break;
               case 83 : System.out.println("\n	Al-Mutaffifeen"); break;        case 84 : System.out.println("\nAl-Inshiqaaq"); break;
               case 85 : System.out.println("\nAl-Burooj"); break;              case 86 : System.out.println("\nAt-Taariq"); break;
               case 87 : System.out.println("\nAl-A'la"); break;                case 88 : System.out.println("\nAl-Ghaashiyah"); break;
               case 89 : System.out.println("\n	Al-Fajr"); break;               case 90 : System.out.println("\nAl-Balad"); break;
               case 91 : System.out.println("\nAsh-Shams"); break;              case 92 : System.out.println("\nAl-Layl"); break;
               case 93 : System.out.println("\n	Ad-Dhuha"); break;              case 94 : System.out.println("\nAl-Inshirah"); break;
               case 95 : System.out.println("\nAt-Tin"); break;                 case 96 : System.out.println("\nAl-Alaq"); break;
               case 97 : System.out.println("\nAl-Qadr"); break;                case 98 : System.out.println("\nAl-Bayyinah"); break;
               case 99 : System.out.println("\nAz-Zalzalah"); break;            case 100 : System.out.println("\nAl-'Aadiyat"); break;
               case 101 : System.out.println("\nAl-Qaari'ah"); break;           case 102 : System.out.println("\nAt-Takaathur"); break;
               case 103 : System.out.println("\nAl-'Asr"); break;               case 104 : System.out.println("\nAl-Humazah"); break;
               case 105 : System.out.println("\nAl-Feel"); break;               case 106 : System.out.println("\nQuraish"); break;
               case 107 : System.out.println("\nAl-Maa'oon"); break;            case 108 : System.out.println("\nAl-Kawthar"); break;
               case 109 : System.out.println("\nAl-Kaafiroon"); break;          case 110 : System.out.println("\nAn-Nasr"); break;
               case 111 : System.out.println("\nAl-Masad"); break;              case 112 : System.out.println("\nAl-Ikhlas"); break;
               case 113 : System.out.println("\nAl-Falaq"); break;              case 114 : System.out.println("\nAn-Naas"); break;} 
    }
    public static void deletesurah(int ans,int[] delete,int randsurah)
    {
        switch(ans){
                        case 1: delete[1]=randsurah;break;
                        case 2: delete[2]=randsurah;break;
                        case 3: delete[3]=randsurah;break;
                        case 4: delete[4]=randsurah;break;
                        case 5: delete[5]=randsurah;break;
                        case 6: delete[6]=randsurah;break;
                        case 7: delete[7]=randsurah;break;
                        case 8: delete[8]=randsurah;break;
                        case 9: delete[9]=randsurah;break;
                        case 10: delete[10]=randsurah;break;
                        case 11: delete[11]=randsurah;break;
                        case 12: delete[12]=randsurah;break;
                        case 13: delete[13]=randsurah;break;
                        case 14: delete[14]=randsurah;break;
                        case 15: delete[15]=randsurah;break;
                        case 16: delete[16]=randsurah;break;
                        case 17: delete[17]=randsurah;break;
                        case 18: delete[18]=randsurah;break;
                        case 19: delete[19]=randsurah;break;
                        case 20: delete[20]=randsurah;break;
                        case 21: delete[21]=randsurah;break;
                        case 22: delete[22]=randsurah;break;
                        case 23: delete[23]=randsurah;break;
                        case 24: delete[24]=randsurah;break;
                        case 25: delete[25]=randsurah;break;
                        case 26: delete[26]=randsurah;break;
                        case 27: delete[27]=randsurah;break;
                        case 28: delete[28]=randsurah;break;
                        case 29: delete[29]=randsurah;break;
                        case 30: delete[30]=randsurah;break;
                        case 31: delete[31]=randsurah;break;
                        case 32: delete[32]=randsurah;break;
                        case 33: delete[33]=randsurah;break;
                        case 34: delete[34]=randsurah;break;
                        case 35: delete[35]=randsurah;break;
                        case 36: delete[36]=randsurah;break;
                        case 37: delete[37]=randsurah;break;
                        case 38: delete[38]=randsurah;break;
                        case 39: delete[39]=randsurah;break;
                        case 40: delete[40]=randsurah;break;
                        case 41: delete[41]=randsurah;break;
                        case 42: delete[42]=randsurah;break;
                        case 43: delete[43]=randsurah;break;
                        case 44: delete[44]=randsurah;break;
                        case 45: delete[45]=randsurah;break;
                        case 46: delete[46]=randsurah;break;
                        case 47: delete[47]=randsurah;break;
                        case 48: delete[48]=randsurah;break;
                        case 49: delete[49]=randsurah;break;
                        case 50: delete[50]=randsurah;break;
                        case 51: delete[51]=randsurah;break;
                        case 52: delete[52]=randsurah;break;
                        case 53: delete[53]=randsurah;break;
                        case 54: delete[54]=randsurah;break;
                        case 55: delete[55]=randsurah;break;
                        case 56: delete[56]=randsurah;break;
                        case 57: delete[57]=randsurah;break;
                        case 58: delete[58]=randsurah;break;
                        case 59: delete[59]=randsurah;break;
                        case 60: delete[60]=randsurah;break;
                        case 61: delete[61]=randsurah;break;
                        case 62: delete[62]=randsurah;break;
                        case 63: delete[63]=randsurah;break;
                        case 64: delete[64]=randsurah;break;
                        case 65: delete[65]=randsurah;break;
                        case 66: delete[66]=randsurah;break;
                        case 67: delete[67]=randsurah;break;
                        case 68: delete[68]=randsurah;break;
                        case 69: delete[69]=randsurah;break;
                        case 70: delete[70]=randsurah;break;
                        case 71: delete[71]=randsurah;break;
                        case 72: delete[72]=randsurah;break;
                        case 73: delete[73]=randsurah;break;
                        case 74: delete[74]=randsurah;break;
                        case 75: delete[75]=randsurah;break;
                        case 76: delete[76]=randsurah;break;
                        case 77: delete[77]=randsurah;break;
                        case 78: delete[78]=randsurah;break;
                        case 79: delete[79]=randsurah;break;
                        case 80: delete[80]=randsurah;break;
                        case 81: delete[81]=randsurah;break;
                        case 82: delete[82]=randsurah;break;
                        case 83: delete[83]=randsurah;break;
                        case 84: delete[84]=randsurah;break;
                        case 85: delete[85]=randsurah;break;
                        case 86: delete[86]=randsurah;break;
                        case 87: delete[87]=randsurah;break;
                        case 88: delete[88]=randsurah;break;
                        case 89: delete[89]=randsurah;break;
                        case 90: delete[90]=randsurah;break;
                        case 91: delete[91]=randsurah;break;
                        case 92: delete[92]=randsurah;break;
                        case 93: delete[93]=randsurah;break;
                        case 94: delete[94]=randsurah;break;
                        case 95: delete[95]=randsurah;break;
                        case 96: delete[96]=randsurah;break;
                        case 97: delete[97]=randsurah;break;
                        case 98: delete[98]=randsurah;break;
                        case 99: delete[99]=randsurah;break;
                        case 100: delete[100]=randsurah;break;
                        case 101: delete[101]=randsurah;break;
                        case 102: delete[102]=randsurah;break;
                        case 103: delete[103]=randsurah;break;
                        case 104: delete[104]=randsurah;break;
                        case 105: delete[105]=randsurah;break;
                        case 106: delete[106]=randsurah;break;
                        case 107: delete[107]=randsurah;break;
                        case 108: delete[108]=randsurah;break;
                        case 109: delete[109]=randsurah;break;
                        case 110: delete[110]=randsurah;break;
                        case 111: delete[111]=randsurah;break;
                        case 112: delete[112]=randsurah;break;
                        case 113: delete[113]=randsurah;break;
                        case 114: delete[114]=randsurah;break;
        }                   
    }
}


    
