//System.out.println("\f");new  ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
package com.thippeswamy.app.projectCompleted.comp;

import java.io.IOException;
import java.util.Scanner;

class TicTacToeConsoleGame {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("\f");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("  Enter the name : >>> ");
        name = sc.nextLine();
        System.out.println("\f");
        System.out.println("\n \n \n \n ");
        int count_com = 0;
        int count_pla = 0;
        int count_draw = 0;
        int count_total = 0;

        int[] aa1b2 = {11, 2, 33, 44, 1, 66, 77, 88, 99};
        int[] aa1b3 = {1, 2, 33, 44, 1, 66, 77, 88, 99};
        int[] aa1b4 = {1, 2, 33, 44, 1, 66, 77, 88, 2};
        int[] aa1b5 = {1, 2, 33, 1, 1, 66, 77, 88, 2};

        int[] aa2b2 = {11, 22, 33, 44, 2, 66, 77, 88, 1};
        int[] aa2b3 = {1, 22, 33, 44, 2, 66, 77, 88, 1};
        int[] aa2b4 = {1, 22, 2, 44, 2, 66, 77, 88, 1};
        int[] aa2b5 = {1, 22, 2, 44, 2, 66, 1, 88, 1};

        int[] aa3b2 = {11, 2, 33, 44, 1, 66, 77, 88, 99};
        int[] aa3b3 = {11, 2, 1, 44, 1, 66, 77, 88, 99};
        int[] aa3b4 = {11, 2, 1, 44, 1, 66, 2, 88, 99};
        int[] aa3b5 = {11, 2, 1, 44, 1, 1, 2, 88, 99};

        int[] aa4b2 = {11, 2, 33, 44, 1, 66, 77, 88, 99};
        int[] aa4b3 = {11, 2, 1, 44, 1, 66, 77, 88, 99};
        int[] aa4b4 = {11, 2, 1, 44, 1, 66, 2, 88, 99};
        int[] aa4b5 = {11, 2, 1, 44, 1, 66, 2, 88, 1};

        int[] aa5b2 = {11, 2, 33, 44, 1, 66, 77, 88, 99};
        int[] aa5b3 = {1, 2, 33, 44, 1, 66, 77, 88, 99};
        int[] aa5b4 = {1, 2, 33, 44, 1, 66, 77, 88, 2};
        int[] aa5b5 = {1, 2, 33, 44, 1, 66, 1, 88, 2};

        int[] aa6b2 = {11, 22, 33, 44, 55, 66, 77, 2, 1};
        int[] aa6b3 = {11, 22, 33, 44, 1, 66, 77, 2, 1};
        int[] aa6b4 = {2, 22, 33, 44, 1, 66, 77, 2, 1};
        int[] aa6b5 = {2, 22, 33, 44, 1, 1, 77, 2, 1};

        int[] aa7b2 = {11, 22, 33, 44, 55, 66, 1, 2, 99};
        int[] aa7b3 = {11, 22, 33, 44, 1, 66, 1, 2, 99};
        int[] aa7b4 = {11, 22, 2, 44, 1, 66, 1, 2, 99};
        int[] aa7b5 = {11, 22, 2, 1, 1, 66, 1, 2, 99};

        int[] aa8b2 = {11, 2, 33, 44, 55, 1, 77, 88, 99};
        int[] aa8b3 = {11, 2, 1, 44, 55, 1, 77, 88, 99};
        int[] aa8b4 = {11, 2, 1, 44, 55, 1, 77, 88, 2};
        int[] aa8b5 = {11, 2, 1, 44, 1, 1, 77, 88, 2};

        int[] aa9b2 = {11, 22, 33, 44, 55, 66, 1, 88, 2};
        int[] aa9b3 = {11, 22, 33, 1, 55, 66, 1, 88, 2};
        int[] aa9b4 = {2, 22, 33, 1, 55, 66, 1, 88, 2};
        int[] aa9b5 = {2, 22, 33, 1, 1, 66, 1, 88, 2};

        int[] aa10b2 = {11, 22, 1, 2, 55, 66, 77, 88, 99};
        int[] aa10b3 = {11, 22, 1, 2, 55, 66, 77, 88, 1};
        int[] aa10b4 = {11, 22, 1, 2, 55, 2, 77, 88, 1};
        int[] aa10b5 = {11, 22, 1, 2, 1, 2, 77, 88, 1};

        int[] aa11b2 = {11, 22, 33, 2, 55, 66, 77, 88, 1};
        int[] aa11b3 = {11, 22, 1, 2, 55, 66, 77, 88, 1};
        int[] aa11b4 = {11, 22, 1, 2, 55, 2, 77, 88, 1};
        int[] aa11b5 = {11, 22, 1, 2, 1, 2, 77, 88, 1};

        int[] aa12b2 = {1, 22, 2, 44, 55, 66, 77, 88, 99};
        int[] aa12b3 = {1, 22, 2, 1, 55, 66, 77, 88, 99};
        int[] aa12b4 = {1, 22, 2, 1, 55, 66, 2, 88, 99};
        int[] aa12b5 = {1, 22, 2, 1, 1, 66, 2, 88, 99};

        int[] aa13b2 = {11, 22, 33, 2, 55, 66, 77, 1, 99};
        int[] aa13b3 = {11, 22, 33, 2, 55, 66, 1, 1, 99};
        int[] aa13b4 = {11, 22, 33, 2, 55, 66, 1, 1, 2};
        int[] aa13b5 = {11, 22, 33, 2, 1, 66, 1, 1, 2};

        int[] aa14b2 = {11, 22, 33, 44, 1, 66, 77, 88, 2};
        int[] aa14b3 = {1, 22, 33, 44, 1, 66, 77, 88, 2};
        int[] aa14b4 = {1, 2, 33, 44, 1, 66, 77, 88, 2};
        int[] aa14b5 = {1, 2, 33, 1, 1, 66, 77, 88, 2};

        int[] aa15b2 = {11, 22, 33, 44, 1, 66, 77, 88, 2};
        int[] aa15b3 = {1, 22, 33, 44, 1, 66, 77, 88, 2};
        int[] aa15b4 = {1, 22, 33, 2, 1, 66, 77, 88, 2};
        int[] aa15b5 = {1, 1, 33, 2, 1, 66, 77, 88, 2};

        int[] aa16b2 = {11, 22, 33, 44, 55, 1, 77, 88, 2};
        int[] aa16b3 = {11, 1, 33, 44, 55, 1, 77, 88, 2};
        int[] aa16b4 = {11, 1, 2, 44, 55, 1, 77, 88, 2};
        int[] aa16b5 = {11, 1, 2, 44, 1, 1, 77, 88, 2};

        int[] aa17b2 = {11, 2, 33, 44, 55, 66, 77, 1, 99};
        int[] aa17b3 = {11, 2, 1, 44, 55, 66, 77, 1, 99};
        int[] aa17b4 = {11, 2, 1, 2, 55, 66, 77, 1, 99};
        int[] aa17b5 = {11, 2, 1, 2, 55, 66, 77, 1, 1};

        int[] aa18b2 = {2, 22, 33, 44, 55, 66, 77, 88, 1};
        int[] aa18b3 = {2, 22, 33, 44, 55, 66, 1, 88, 1};
        int[] aa18b4 = {2, 22, 33, 44, 55, 66, 1, 2, 1};
        int[] aa18b5 = {2, 22, 1, 44, 55, 66, 1, 2, 1};

        int[] aa19b2 = {11, 2, 33, 44, 55, 66, 77, 1, 99};
        int[] aa19b3 = {11, 2, 1, 44, 55, 66, 77, 1, 99};
        int[] aa19b4 = {2, 2, 1, 44, 55, 66, 77, 1, 99};
        int[] aa19b5 = {2, 2, 1, 44, 55, 66, 77, 1, 1};

        int[] aa20b2 = {11, 2, 33, 44, 55, 66, 77, 1, 99};
        int[] aa20b3 = {1, 2, 33, 44, 55, 66, 77, 1, 99};
        int[] aa20b4 = {1, 2, 2, 44, 55, 66, 77, 1, 99};
        int[] aa20b5 = {1, 2, 2, 44, 55, 66, 1, 1, 99};

        int[] aa21b2 = {11, 2, 33, 44, 55, 66, 77, 1, 99};
        int[] aa21b3 = {1, 2, 33, 44, 55, 66, 77, 1, 99};
        int[] aa21b4 = {1, 2, 33, 44, 55, 2, 77, 1, 99};
        int[] aa21b5 = {1, 2, 33, 44, 55, 2, 1, 1, 99};

        int[] aa22b2 = {11, 2, 33, 44, 55, 66, 77, 1, 99,};
        int[] aa22b3 = {11, 2, 1, 44, 55, 66, 77, 1, 99};
        int[] aa22b4 = {11, 2, 1, 44, 55, 2, 77, 1, 99};
        int[] aa22b5 = {11, 2, 1, 44, 55, 2, 1, 1, 99};

        int[] aa23b2 = {11, 2, 33, 44, 55, 66, 77, 1, 99,};
        int[] aa23b3 = {1, 2, 33, 44, 55, 66, 77, 1, 99};
        int[] aa23b4 = {1, 2, 33, 2, 55, 66, 77, 1, 99};
        int[] aa23b5 = {1, 2, 33, 2, 55, 66, 77, 1, 1};

        int change = 1, cha = 2;

        for (int rre = 1; rre == 1; count_total++) {

            int[][] a = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
            int i, n, zzz = 0, close = 1;

            int[] dd1 = {3, 6, 9, 2, 5, 8, 1, 4, 7};
            int[] dd2 = {7, 4, 1, 8, 5, 2, 9, 6, 3};

            int[] a1 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
            int[] a2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
            int[] a3 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
            int[] a4 = {11, 22, 33, 44, 55, 66, 77, 88, 99};

            for (; close == 1; ) {
                rre = 0;
                int p2, p1;
                int[] aaaaa = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                int mmm = 0;
                if (zzz <= 8 && close == 1) {
                    if (change == 1 || cha == 2) {
                        cha = 1;
                        /*
                        System.out.println("\f");;
                        System.out.println("\n \n \n \n \n ");

                        System.out.print("                 o-");
                        for(int iii=0;iii<=64;iii++)
                        {
                        System.out.print("-");
                        }
                        System.out.print("o");
                        System.out.println();
                        for(i=0;i<3;i++)
                        {
                        for(int iii1=1;iii1<=3;iii1++)
                        System.out.println("                 |                   |                         |                    |");

                        for(n=0;n<3;n++)
                        {
                        if(n==0)
                        System.out.print("                 |");
                        else if(n==1)
                        System.out.print("          |      ");
                        else
                        System.out.print("          |    ");

                        if(a[i][n]>=11)
                        System.out.print("       "+a[i][n]);
                        else if(a[i][n]==1)
                        System.out.print("       O ");
                        else if(a[i][n]==2)
                        System.out.print("       x ");
                        }
                        System.out.println("       |");
                        if(i!=2&&n!=2)
                        {
                        for(int iii1=1;iii1<=4;iii1++) {
                        System.out.println("                 |                   |                         |                    |");
                        if(iii1==4)
                        System.out.println("                 |-------------------|-------------------------|--------------------|");
                        }
                        }
                        else
                        {   for(int iii1=1;iii1<=4;iii1++) {
                        System.out.println("                 |                   |                         |                    |");
                        if(iii1==4)
                        System.out.println("                 o------------------------------------------------------------------o");
                        }
                        }

                        }
                         */

                        if (zzz == 0) {
                            mmm = 1;
                            double asdf = Math.random();
                            double zxcvv = asdf * 10;
                            int zxcv = (int) zxcvv;
                            p1 = 1;

                            for (i = 0; i < 3; i++) {
                                for (n = 0; n < 3; n++) {
                                    if (p1 == zxcv)
                                        a[i][n] = 1;
                                    p1++;
                                }
                            }

                        }

                        if (zzz <= 4) {
                            int a1a1a1 = 0;
                            for (i = 0; i < 3; i++) {
                                for (n = 0; n < 3; n++) {
                                    aaaaa[a1a1a1] = a[i][n];
                                    a1a1a1++;
                                }
                            }

                            for (i = 0; i <= 8; i++) {
                                {
                                    a1[i] = aaaaa[i];
                                }

                                if (aaaaa[dd1[i] - 1] <= 2) {
                                    a2[i] = aaaaa[dd1[i] - 1];
                                }

                                if (aaaaa[dd2[i] - 1] <= 2) {
                                    a3[i] = aaaaa[dd2[i] - 1];
                                }

                                if (aaaaa[8 - i] <= 2) {
                                    a4[i] = aaaaa[8 - i];
                                }
                            }
                        }

                        //aaaaaaaaaaaaaa1111111111
                        if (zzz == 2) {
                            if (zzz == 2) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa1b2[n])
                                        t1++;
                                    if (a2[n] == aa1b2[n])
                                        t2++;
                                    if (a3[n] == aa1b2[n])
                                        t3++;
                                    if (a4[n] == aa1b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaaaaaaaaaaaaaa2222222222222222222

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa2b2[n])
                                        t1++;
                                    if (a2[n] == aa2b2[n])
                                        t2++;
                                    if (a3[n] == aa2b2[n])
                                        t3++;
                                    if (a4[n] == aa2b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa2b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa2b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa2b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa2b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaaaaaaa33333333333333

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa3b2[n])
                                        t1++;
                                    if (a2[n] == aa3b2[n])
                                        t2++;
                                    if (a3[n] == aa3b2[n])
                                        t3++;
                                    if (a4[n] == aa3b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa3b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa3b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa3b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa3b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaaaaaaaaaaaaaaaa4444444444444444
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa4b2[n])
                                        t1++;
                                    if (a2[n] == aa4b2[n])
                                        t2++;
                                    if (a3[n] == aa4b2[n])
                                        t3++;
                                    if (a4[n] == aa4b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa4b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa4b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa4b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa4b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaaa5555555555555

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa5b2[n])
                                        t1++;
                                    if (a2[n] == aa5b2[n])
                                        t2++;
                                    if (a3[n] == aa5b2[n])
                                        t3++;
                                    if (a4[n] == aa5b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa5b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa5b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa5b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa5b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaaaaaaaaaa666666666

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa6b2[n])
                                        t1++;
                                    if (a2[n] == aa6b2[n])
                                        t2++;
                                    if (a3[n] == aa6b2[n])
                                        t3++;
                                    if (a4[n] == aa6b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa6b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa6b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa6b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa6b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaaaaaa77777777777

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa7b2[n])
                                        t1++;
                                    if (a2[n] == aa7b2[n])
                                        t2++;
                                    if (a3[n] == aa7b2[n])
                                        t3++;
                                    if (a4[n] == aa7b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa7b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa7b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa7b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa7b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaaaa8888888888888

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa8b2[n])
                                        t1++;
                                    if (a2[n] == aa8b2[n])
                                        t2++;
                                    if (a3[n] == aa8b2[n])
                                        t3++;
                                    if (a4[n] == aa8b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa8b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa8b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa8b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa8b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaaaaaa99999999999999

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa9b2[n])
                                        t1++;
                                    if (a2[n] == aa9b2[n])
                                        t2++;
                                    if (a3[n] == aa9b2[n])
                                        t3++;
                                    if (a4[n] == aa9b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa9b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa9b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa9b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa9b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaaaaaaaaaaaaaa100

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa10b2[n])
                                        t1++;
                                    if (a2[n] == aa10b2[n])
                                        t2++;
                                    if (a3[n] == aa10b2[n])
                                        t3++;
                                    if (a4[n] == aa10b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa10b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa10b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa10b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa10b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaaaaaaaa11

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa11b2[n])
                                        t1++;
                                    if (a2[n] == aa11b2[n])
                                        t2++;
                                    if (a3[n] == aa11b2[n])
                                        t3++;
                                    if (a4[n] == aa11b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa11b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa11b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa11b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa11b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaa12
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa12b2[n])
                                        t1++;
                                    if (a2[n] == aa12b2[n])
                                        t2++;
                                    if (a3[n] == aa12b2[n])
                                        t3++;
                                    if (a4[n] == aa12b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa12b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa12b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa12b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa12b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaaa13
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa13b2[n])
                                        t1++;
                                    if (a2[n] == aa13b2[n])
                                        t2++;
                                    if (a3[n] == aa13b2[n])
                                        t3++;
                                    if (a4[n] == aa13b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa13b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa13b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa13b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa13b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaaaaaaaa14
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa14b2[n])
                                        t1++;
                                    if (a2[n] == aa14b2[n])
                                        t2++;
                                    if (a3[n] == aa14b2[n])
                                        t3++;
                                    if (a4[n] == aa14b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa14b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa14b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa14b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa14b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            ///aaaaaaaaaaaaaa15
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa15b2[n])
                                        t1++;
                                    if (a2[n] == aa15b2[n])
                                        t2++;
                                    if (a3[n] == aa15b2[n])
                                        t3++;
                                    if (a4[n] == aa15b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa15b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa15b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa15b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa15b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }

                            //aaaaaaa16
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa16b2[n])
                                        t1++;
                                    if (a2[n] == aa16b2[n])
                                        t2++;
                                    if (a3[n] == aa16b2[n])
                                        t3++;
                                    if (a4[n] == aa16b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa16b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa16b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa16b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa16b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaaaa17
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa17b2[n])
                                        t1++;
                                    if (a2[n] == aa17b2[n])
                                        t2++;
                                    if (a3[n] == aa17b2[n])
                                        t3++;
                                    if (a4[n] == aa17b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa17b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa17b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa17b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa17b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaaaaaaaaaaa18

                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa18b2[n])
                                        t1++;
                                    if (a2[n] == aa18b2[n])
                                        t2++;
                                    if (a3[n] == aa18b2[n])
                                        t3++;
                                    if (a4[n] == aa18b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa18b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa18b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa18b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa18b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaa19
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa19b2[n])
                                        t1++;
                                    if (a2[n] == aa19b2[n])
                                        t2++;
                                    if (a3[n] == aa19b2[n])
                                        t3++;
                                    if (a4[n] == aa19b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa19b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa19b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa19b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa19b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaaaaaa20
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa20b2[n])
                                        t1++;
                                    if (a2[n] == aa20b2[n])
                                        t2++;
                                    if (a3[n] == aa20b2[n])
                                        t3++;
                                    if (a4[n] == aa20b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa20b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa20b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa20b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa20b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            ///aaaaaaaaaaaaaaaaaa21
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa21b2[n])
                                        t1++;
                                    if (a2[n] == aa21b2[n])
                                        t2++;
                                    if (a3[n] == aa21b2[n])
                                        t3++;
                                    if (a4[n] == aa21b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa21b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa21b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa21b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa21b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaa22
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa22b2[n])
                                        t1++;
                                    if (a2[n] == aa22b2[n])
                                        t2++;
                                    if (a3[n] == aa22b2[n])
                                        t3++;
                                    if (a4[n] == aa22b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa22b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa22b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa22b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa22b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                            //aaaaaaaaaaaa23
                            if (zzz == 2 && mmm == 0) {

                                int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                for (n = 0; n <= 8; n++) {
                                    if (a1[n] == aa23b2[n])
                                        t1++;
                                    if (a2[n] == aa23b2[n])
                                        t2++;
                                    if (a3[n] == aa23b2[n])
                                        t3++;
                                    if (a4[n] == aa23b2[n])
                                        t4++;
                                }

                                if (t1 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa23b3[i];
                                        mmm = 1;
                                    }
                                }

                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa23b3[dd2[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa23b3[dd1[i] - 1];
                                        mmm = 1;
                                    }
                                }

                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa23b3[8 - i];
                                        mmm = 1;
                                    }
                                }
                            }
                        } else
                            //aaaaaaaaaaaa1bbbbbbb4
                            if (zzz == 4 && mmm == 0) {
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa1b4[n])
                                            t1++;
                                        if (a2[n] == aa1b4[n])
                                            t2++;
                                        if (a3[n] == aa1b4[n])
                                            t3++;
                                        if (a4[n] == aa1b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa1b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa1b5[dd2[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa1b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa1b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaaaa2bbbb4

                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa2b4[n])
                                            t1++;
                                        if (a2[n] == aa2b4[n])
                                            t2++;
                                        if (a3[n] == aa2b4[n])
                                            t3++;
                                        if (a4[n] == aa2b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa2b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa2b5[dd2[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa2b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa2b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaaa3bbbbbb4

                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa3b4[n])
                                            t1++;
                                        if (a2[n] == aa3b4[n])
                                            t2++;
                                        if (a3[n] == aa3b4[n])
                                            t3++;
                                        if (a4[n] == aa3b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa3b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa3b5[dd2[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa3b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa3b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaa4bbbb4

                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa4b4[n])
                                            t1++;
                                        if (a2[n] == aa4b4[n])
                                            t2++;
                                        if (a3[n] == aa4b4[n])
                                            t3++;
                                        if (a4[n] == aa4b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa4b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa4b5[dd2[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa4b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa4b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaa5bbbbbb4

                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa5b4[n])
                                            t1++;
                                        if (a2[n] == aa5b4[n])
                                            t2++;
                                        if (a3[n] == aa5b4[n])
                                            t3++;
                                        if (a4[n] == aa5b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa5b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa5b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa5b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa5b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaaaaa6666bbbbb4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa6b4[n])
                                            t1++;
                                        if (a2[n] == aa6b4[n])
                                            t2++;
                                        if (a3[n] == aa6b4[n])
                                            t3++;
                                        if (a4[n] == aa6b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa6b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa6b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa6b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa6b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaaaaaaaaa777bbbb4

                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa7b4[n])
                                            t1++;
                                        if (a2[n] == aa7b4[n])
                                            t2++;
                                        if (a3[n] == aa7b4[n])
                                            t3++;
                                        if (a4[n] == aa7b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa7b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa7b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa7b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa7b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaaaaaaa8888888888888bbbbbb44444

                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa8b4[n])
                                            t1++;
                                        if (a2[n] == aa8b4[n])
                                            t2++;
                                        if (a3[n] == aa8b4[n])
                                            t3++;
                                        if (a4[n] == aa8b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa8b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa8b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa8b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa8b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaaaaaaaaa99b4444444
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa9b4[n])
                                            t1++;
                                        if (a2[n] == aa9b4[n])
                                            t2++;
                                        if (a3[n] == aa9b4[n])
                                            t3++;
                                        if (a4[n] == aa9b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa9b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa9b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa9b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa9b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaaaa10b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa10b4[n])
                                            t1++;
                                        if (a2[n] == aa10b4[n])
                                            t2++;
                                        if (a3[n] == aa10b4[n])
                                            t3++;
                                        if (a4[n] == aa10b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa10b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa10b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa10b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa10b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaa11b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa11b4[n])
                                            t1++;
                                        if (a2[n] == aa11b4[n])
                                            t2++;
                                        if (a3[n] == aa11b4[n])
                                            t3++;
                                        if (a4[n] == aa11b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa11b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa11b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa11b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa11b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaaaaaaaaaaaaaaaa12b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa12b4[n])
                                            t1++;
                                        if (a2[n] == aa12b4[n])
                                            t2++;
                                        if (a3[n] == aa12b4[n])
                                            t3++;
                                        if (a4[n] == aa12b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa12b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa12b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa12b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa12b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaaaaaaa13bbb4

                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa13b4[n])
                                            t1++;
                                        if (a2[n] == aa13b4[n])
                                            t2++;
                                        if (a3[n] == aa13b4[n])
                                            t3++;
                                        if (a4[n] == aa13b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa13b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa13b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa13b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa13b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaaaaaa14 b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa14b4[n])
                                            t1++;
                                        if (a2[n] == aa14b4[n])
                                            t2++;
                                        if (a3[n] == aa14b4[n])
                                            t3++;
                                        if (a4[n] == aa14b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa14b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa14b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa14b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa14b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }

                                //aaaaa15bbb4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa15b4[n])
                                            t1++;
                                        if (a2[n] == aa15b4[n])
                                            t2++;
                                        if (a3[n] == aa15b4[n])
                                            t3++;
                                        if (a4[n] == aa15b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa15b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa15b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa15b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa15b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaaaaa16

                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa16b4[n])
                                            t1++;
                                        if (a2[n] == aa16b4[n])
                                            t2++;
                                        if (a3[n] == aa16b4[n])
                                            t3++;
                                        if (a4[n] == aa16b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa16b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa16b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa16b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa16b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                ///aaaaaaaa17b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa17b4[n])
                                            t1++;
                                        if (a2[n] == aa17b4[n])
                                            t2++;
                                        if (a3[n] == aa17b4[n])
                                            t3++;
                                        if (a4[n] == aa17b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa17b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa17b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa17b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa17b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaaa18b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa18b4[n])
                                            t1++;
                                        if (a2[n] == aa18b4[n])
                                            t2++;
                                        if (a3[n] == aa18b4[n])
                                            t3++;
                                        if (a4[n] == aa18b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa18b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa18b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa18b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa18b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaa19b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa19b4[n])
                                            t1++;
                                        if (a2[n] == aa19b4[n])
                                            t2++;
                                        if (a3[n] == aa19b4[n])
                                            t3++;
                                        if (a4[n] == aa19b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa19b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa19b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa19b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa19b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaa20b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa20b4[n])
                                            t1++;
                                        if (a2[n] == aa20b4[n])
                                            t2++;
                                        if (a3[n] == aa20b4[n])
                                            t3++;
                                        if (a4[n] == aa20b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa20b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa20b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa20b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa20b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaaa21b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa21b4[n])
                                            t1++;
                                        if (a2[n] == aa21b4[n])
                                            t2++;
                                        if (a3[n] == aa21b4[n])
                                            t3++;
                                        if (a4[n] == aa21b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa21b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa21b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa21b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa21b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaaa22b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa22b4[n])
                                            t1++;
                                        if (a2[n] == aa22b4[n])
                                            t2++;
                                        if (a3[n] == aa22b4[n])
                                            t3++;
                                        if (a4[n] == aa22b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa22b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa22b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa22b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa22b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                                //aaaaaaaaaaaa23b4
                                if (zzz == 4 && mmm == 0) {

                                    int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
                                    for (n = 0; n <= 8; n++) {
                                        if (a1[n] == aa23b4[n])
                                            t1++;
                                        if (a2[n] == aa23b4[n])
                                            t2++;
                                        if (a3[n] == aa23b4[n])
                                            t3++;
                                        if (a4[n] == aa23b4[n])
                                            t4++;
                                    }

                                    if (t1 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa23b5[i];
                                            mmm = 1;
                                        }
                                    }

                                    if (t2 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa23b5[dd2[i] - 1];
                                            mmm = 1;

                                        }
                                    }

                                    if (t3 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa23b5[dd1[i] - 1];
                                            mmm = 1;
                                        }
                                    }

                                    if (t4 == 9) {
                                        for (i = 0; i <= 8; i++) {
                                            aaaaa[i] = aa23b5[8 - i];
                                            mmm = 1;
                                        }
                                    }
                                }
                            }

                        if (mmm == 1) {
                            int zz3 = 0;

                            for (i = 0; i < 3; i++) {
                                for (n = 0; n < 3; n++) {
                                    if (aaaaa[zz3] <= 2)
                                        a[i][n] = aaaaa[zz3];
                                    else
                                        a[i][n] = (zz3 + 1) * 10 + (zz3 + 1);
                                    zz3++;
                                }
                            }
                        }

                        //coun

                        if (mmm == 0 && zzz >= 1) {

                            int z1 = a[0][0], z2 = a[0][1], z3 = a[0][2];
                            int z4 = a[1][0], z5 = a[1][1], z6 = a[1][2];
                            int z7 = a[2][0], z8 = a[2][1], z9 = a[2][2];
                            if (z1 == 1 && z2 == 1 && z3 > 4) {
                                a[0][2] = 1;
                                mmm = 1;
                            } else if (z1 == 1 && z3 == 1 && z2 > 4) {
                                a[0][1] = 1;
                                mmm = 1;
                            } else if (z2 == 1 && z3 == 1 && z1 > 4) {
                                a[0][0] = 1;
                                mmm = 1;
                            } else if (z4 == 1 && z5 == 1 && z6 > 4) {
                                a[1][2] = 1;
                                mmm = 1;
                            } else if (z4 == 1 && z6 == 1 && z5 > 4) {
                                a[1][1] = 1;
                                mmm = 1;
                            } else if (z5 == 1 && z6 == 1 && z4 > 4) {
                                a[1][0] = 1;
                                mmm = 1;
                            } else if (z7 == 1 && z8 == 1 && z9 > 4) {
                                a[2][2] = 1;
                                mmm = 1;
                            } else if (z7 == 1 && z9 == 1 && z8 > 4) {
                                a[2][1] = 1;
                                mmm = 1;
                            } else if (z8 == 1 && z9 == 1 && z7 > 4) {
                                a[2][0] = 1;
                                mmm = 1;
                            } else if (z1 == 1 && z4 == 1 && z7 > 4) {
                                a[2][0] = 1;
                                mmm = 1;
                            } else if (z1 == 1 && z7 == 1 && z4 > 4) {
                                a[1][0] = 1;
                                mmm = 1;
                            } else if (z4 == 1 && z7 == 1 && z1 > 4) {
                                a[0][0] = 1;
                                mmm = 1;
                            } else if (z2 == 1 && z5 == 1 && z8 > 4) {
                                a[2][1] = 1;
                                mmm = 1;
                            } else if (z2 == 1 && z8 == 1 && z5 > 4) {
                                a[1][1] = 1;
                                mmm = 1;
                            } else if (z5 == 1 && z8 == 1 && z2 > 4) {
                                a[0][1] = 1;
                                mmm = 1;
                            } else if (z3 == 1 && z6 == 1 && z9 > 4) {
                                a[2][2] = 1;
                                mmm = 1;
                            } else if (z3 == 1 && z9 == 1 && z6 > 4) {
                                a[1][2] = 1;
                                mmm = 1;
                            } else if (z6 == 1 && z9 == 1 && z3 > 4) {
                                a[0][2] = 1;
                                mmm = 1;
                            } else if (z1 == 1 && z5 == 1 && z9 > 4) {
                                a[2][2] = 1;
                                mmm = 1;
                            } else if (z1 == 1 && z9 == 1 && z5 > 4) {
                                a[1][1] = 1;
                                mmm = 1;
                            } else if (z5 == 1 && z9 == 1 && z1 > 4) {
                                a[0][0] = 1;
                                mmm = 1;
                            } else if (z3 == 1 && z5 == 1 && z7 > 4) {
                                a[2][0] = 1;
                                mmm = 1;
                            } else if (z3 == 1 && z7 == 1 && z5 > 4) {
                                a[1][1] = 1;
                                mmm = 1;
                            } else if (z5 == 1 && z7 == 1 && z3 > 4) {
                                a[0][2] = 1;
                                mmm = 1;
                            }

                        }

                        if (mmm == 0 && zzz >= 1) {

                            int z1 = a[0][0], z2 = a[0][1], z3 = a[0][2];
                            int z4 = a[1][0], z5 = a[1][1], z6 = a[1][2];
                            int z7 = a[2][0], z8 = a[2][1], z9 = a[2][2];
                            if (z1 == 2 && z2 == 2 && z3 > 4) {
                                a[0][2] = 1;
                                mmm = 1;
                            } else if (z1 == 2 && z3 == 2 && z2 > 4) {
                                a[0][1] = 1;
                                mmm = 1;
                            } else if (z2 == 2 && z3 == 2 && z1 > 4) {
                                a[0][0] = 1;
                                mmm = 1;
                            } else if (z4 == 2 && z5 == 2 && z6 > 4) {
                                a[1][2] = 1;
                                mmm = 1;
                            } else if (z4 == 2 && z6 == 2 && z5 > 4) {
                                a[1][1] = 1;
                                mmm = 1;
                            } else if (z5 == 2 && z6 == 2 && z4 > 4) {
                                a[1][0] = 1;
                                mmm = 1;
                            } else if (z7 == 2 && z8 == 2 && z9 > 4) {
                                a[2][2] = 1;
                                mmm = 1;
                            } else if (z7 == 2 && z9 == 2 && z8 > 4) {
                                a[2][1] = 1;
                                mmm = 1;
                            } else if (z8 == 2 && z9 == 2 && z7 > 4) {
                                a[2][0] = 1;
                                mmm = 1;
                            } else if (z1 == 2 && z4 == 2 && z7 > 4) {
                                a[2][0] = 1;
                                mmm = 1;
                            } else if (z1 == 2 && z7 == 2 && z4 > 4) {
                                a[1][0] = 1;
                                mmm = 1;
                            } else if (z4 == 2 && z7 == 2 && z1 > 4) {
                                a[0][0] = 1;
                                mmm = 1;
                            } else if (z2 == 2 && z5 == 2 && z8 > 4) {
                                a[2][1] = 1;
                                mmm = 1;
                            } else if (z2 == 2 && z8 == 2 && z5 > 4) {
                                a[1][1] = 1;
                                mmm = 1;
                            } else if (z5 == 2 && z8 == 2 && z2 > 4) {
                                a[0][1] = 1;
                                mmm = 1;
                            } else if (z3 == 2 && z6 == 2 && z9 > 4) {
                                a[2][2] = 1;
                                mmm = 1;
                            } else if (z3 == 2 && z9 == 2 && z6 > 4) {
                                a[1][2] = 1;
                                mmm = 1;
                            } else if (z6 == 2 && z9 == 2 && z3 > 4) {
                                a[0][2] = 1;
                                mmm = 1;
                            } else if (z1 == 2 && z5 == 2 && z9 > 4) {
                                a[2][2] = 1;
                                mmm = 1;
                            } else if (z1 == 2 && z9 == 2 && z5 > 4) {
                                a[1][1] = 1;
                                mmm = 1;
                            } else if (z5 == 2 && z9 == 2 && z1 > 4) {
                                a[0][0] = 1;
                                mmm = 1;
                            } else if (z3 == 2 && z5 == 2 && z7 > 4) {
                                a[2][0] = 1;
                                mmm = 1;
                            } else if (z3 == 2 && z7 == 2 && z5 > 4) {
                                a[1][1] = 1;
                                mmm = 1;
                            } else if (z5 == 2 && z7 == 2 && z3 > 4) {
                                a[0][2] = 1;
                                mmm = 1;
                            }

                        }

                        if (mmm == 0 && zzz <= 6) {
                            mmm = 1;
                            for (int bnm = 1; bnm == 1; ) {

                                double asdf = Math.random();
                                double zxcvv = asdf * 10;
                                int zxcv = (int) zxcvv;
                                int p11 = 1;

                                for (i = 0; i < 3; i++) {
                                    for (n = 0; n < 3; n++) {
                                        if (p11 == zxcv) {
                                            if (a[i][n] >= 3) {
                                                a[i][n] = 1;
                                                bnm = 0;
                                            } else

                                                bnm = 1;
                                        }
                                        p11++;
                                    }

                                }

                            }

                        }

                        if (mmm == 0 && zzz >= 7) {
                            for (i = 0; i < 3 && mmm == 0; i++) {
                                for (n = 0; n < 3 && mmm == 0; n++) {
                                    if (a[i][n] >= 11) {
                                        a[i][n] = 1;
                                        mmm = 1;

                                    }
                                }
                            }
                        }
                        mmm = 0;

                        if (zzz >= 4) {
                            for (i = 0; i < 3; i++) {
                                int y1 = 0;
                                for (n = 0; n < 3; n++) {
                                    if (a[i][n] == 1)
                                        y1++;
                                }

                                if (y1 == 3) {
                                    System.out.println("\f");
                                    System.out.println("\n \n \n \n \n ");
                                    System.out.print("                 o-");
                                    for (int iii = 0; iii <= 64; iii++) {
                                        System.out.print("-");
                                    }
                                    System.out.print("o");
                                    System.out.println();
                                    for (i = 0; i < 3; i++) {
                                        for (int iii1 = 1; iii1 <= 3; iii1++)
                                            System.out.println("                 |                   |                         |                    |");

                                        for (n = 0; n < 3; n++) {
                                            if (n == 0)
                                                System.out.print("                 |");
                                            else if (n == 1)
                                                System.out.print("          |      ");
                                            else
                                                System.out.print("          |    ");

                                            if (a[i][n] >= 11)
                                                System.out.print("       " + a[i][n]);
                                            else if (a[i][n] == 1)
                                                System.out.print("       O ");
                                            else if (a[i][n] == 2)
                                                System.out.print("       x ");
                                        }
                                        System.out.println("       |");
                                        if (i != 2 && n != 2) {
                                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                                System.out.println("                 |                   |                         |                    |");
                                                if (iii1 == 4)
                                                    System.out.println("                 |-------------------|-------------------------|--------------------|");
                                            }
                                        } else {
                                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                                System.out.println("                 |                   |                         |                    |");
                                                if (iii1 == 4)
                                                    System.out.println("                 o------------------------------------------------------------------o");
                                            }
                                        }

                                    }
                                    System.out.print("                        the computer is won");
                                    close = 0;
                                    change = 1;
                                    cha = 2;
                                    count_com++;
                                }

                            }

                            for (i = 0; i < 3; i++) {
                                int y1 = 0;
                                for (n = 0; n < 3; n++) {
                                    if (a[n][i] == 1)
                                        y1++;
                                }

                                if (y1 == 3) {
                                    System.out.println("\f");
                                    System.out.println("\n \n \n \n \n ");
                                    System.out.print("                 o-");
                                    for (int iii = 0; iii <= 64; iii++) {
                                        System.out.print("-");
                                    }
                                    System.out.print("o");
                                    System.out.println();
                                    for (i = 0; i < 3; i++) {
                                        for (int iii1 = 1; iii1 <= 3; iii1++)
                                            System.out.println("                 |                   |                         |                    |");

                                        for (n = 0; n < 3; n++) {
                                            if (n == 0)
                                                System.out.print("                 |");
                                            else if (n == 1)
                                                System.out.print("          |      ");
                                            else
                                                System.out.print("          |    ");

                                            if (a[i][n] >= 11)
                                                System.out.print("       " + a[i][n]);
                                            else if (a[i][n] == 1)
                                                System.out.print("       O ");
                                            else if (a[i][n] == 2)
                                                System.out.print("       x ");
                                        }
                                        System.out.println("       |");
                                        if (i != 2 && n != 2) {
                                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                                System.out.println("                 |                   |                         |                    |");
                                                if (iii1 == 4)
                                                    System.out.println("                 |-------------------|-------------------------|--------------------|");
                                            }
                                        } else {
                                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                                System.out.println("                 |                   |                         |                    |");
                                                if (iii1 == 4)
                                                    System.out.println("                 o------------------------------------------------------------------o");
                                            }
                                        }

                                    }
                                    System.out.print("                        The computer is won MATCH");
                                    close = 0;
                                    change = 1;
                                    cha = 2;
                                    count_com++;
                                }

                            }

                            if (a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1) {
                                System.out.println("\f");
                                System.out.println("\n \n \n \n \n ");
                                System.out.print("                 o-");
                                for (int iii = 0; iii <= 64; iii++) {
                                    System.out.print("-");
                                }
                                System.out.print("o");
                                System.out.println();
                                for (i = 0; i < 3; i++) {
                                    for (int iii1 = 1; iii1 <= 3; iii1++)
                                        System.out.println("                 |                   |                         |                    |");

                                    for (n = 0; n < 3; n++) {
                                        if (n == 0)
                                            System.out.print("                 |");
                                        else if (n == 1)
                                            System.out.print("          |      ");
                                        else
                                            System.out.print("          |    ");

                                        if (a[i][n] >= 11)
                                            System.out.print("       " + a[i][n]);
                                        else if (a[i][n] == 1)
                                            System.out.print("       O ");
                                        else if (a[i][n] == 2)
                                            System.out.print("       x ");
                                    }
                                    System.out.println("       |");
                                    if (i != 2 && n != 2) {
                                        for (int iii1 = 1; iii1 <= 4; iii1++) {
                                            System.out.println("                 |                   |                         |                    |");
                                            if (iii1 == 4)
                                                System.out.println("                 |-------------------|-------------------------|--------------------|");
                                        }
                                    } else {
                                        for (int iii1 = 1; iii1 <= 4; iii1++) {
                                            System.out.println("                 |                   |                         |                    |");
                                            if (iii1 == 4)
                                                System.out.println("                 o------------------------------------------------------------------o");
                                        }
                                    }

                                }
                                System.out.print("                         the computer is won");
                                close = 0;
                                change = 1;
                                cha = 2;
                                count_com++;
                            } else if (a[0][2] == 1 && a[1][1] == 1 && a[2][0] == 1) {
                                System.out.println("\f");
                                System.out.println("\n \n \n \n \n ");
                                System.out.print("                 o-");
                                for (int iii = 0; iii <= 64; iii++) {
                                    System.out.print("-");
                                }
                                System.out.print("o");
                                System.out.println();
                                for (i = 0; i < 3; i++) {
                                    for (int iii1 = 1; iii1 <= 3; iii1++)
                                        System.out.println("                 |                   |                         |                    |");

                                    for (n = 0; n < 3; n++) {
                                        if (n == 0)
                                            System.out.print("                 |");
                                        else if (n == 1)
                                            System.out.print("          |      ");
                                        else
                                            System.out.print("          |    ");

                                        if (a[i][n] >= 11)
                                            System.out.print("       " + a[i][n]);
                                        else if (a[i][n] == 1)
                                            System.out.print("       O ");
                                        else if (a[i][n] == 2)
                                            System.out.print("       x ");
                                    }
                                    System.out.println("       |");
                                    if (i != 2 && n != 2) {
                                        for (int iii1 = 1; iii1 <= 4; iii1++) {
                                            System.out.println("                 |                   |                         |                    |");
                                            if (iii1 == 4)
                                                System.out.println("                 |-------------------|-------------------------|--------------------|");
                                        }
                                    } else {
                                        for (int iii1 = 1; iii1 <= 4; iii1++) {
                                            System.out.println("                 |                   |                         |                    |");
                                            if (iii1 == 4)
                                                System.out.println("                 o------------------------------------------------------------------o");
                                        }
                                    }

                                }
                                System.out.print("                        the computer is won");
                                close = 0;
                                change = 1;
                                cha = 2;
                                count_com++;
                            }
                        }
                        zzz++;
                    }
                }

                if (zzz <= 8 && close == 1) {
                    zzz++;
                    if (change == 2 || cha == 1) {
                        cha = 2;

                        for (int nnmn = 1; nnmn == 1; ) {
                            nnmn = 0;
                            System.out.println("\f");
                            System.out.println("\n \n \n \n ");
                            System.out.println();
                            System.out.print("                 o-");
                            for (int iii = 0; iii <= 64; iii++) {
                                System.out.print("-");
                            }
                            System.out.print("o");
                            System.out.println();
                            for (i = 0; i < 3; i++) {
                                for (int iii1 = 1; iii1 <= 3; iii1++)
                                    System.out.println("                 |                   |                         |                    |");

                                for (n = 0; n < 3; n++) {
                                    if (n == 0)
                                        System.out.print("                 |");
                                    else if (n == 1)
                                        System.out.print("          |      ");
                                    else
                                        System.out.print("          |    ");

                                    if (a[i][n] >= 11)
                                        System.out.print("       " + a[i][n]);
                                    else if (a[i][n] == 1)
                                        System.out.print("       O ");
                                    else if (a[i][n] == 2)
                                        System.out.print("       x ");
                                }
                                System.out.println("       |");
                                if (i != 2 && n != 2) {
                                    for (int iii1 = 1; iii1 <= 4; iii1++) {
                                        System.out.println("                 |                   |                         |                    |");
                                        if (iii1 == 4)
                                            System.out.println("                 |-------------------|-------------------------|--------------------|");
                                    }
                                } else {
                                    for (int iii1 = 1; iii1 <= 4; iii1++) {
                                        System.out.println("                 |                   |                         |                    |");
                                        if (iii1 == 4)
                                            System.out.println("                 o------------------------------------------------------------------o");
                                    }
                                }

                            }

                            System.out.print("                   Enter place number by 2 player >>> ");
                            p2 = sc.nextInt();
                            System.out.println();
                            if (p2 >= 10 || p2 <= 0)
                                nnmn = 1;

                            int hjjk = 1;
                            for (i = 0; i < 3; i++) {
                                for (n = 0; n < 3; n++) {
                                    if (p2 == hjjk) {
                                        if (a[i][n] >= 4 && nnmn == 0)
                                            a[i][n] = 2;
                                        else
                                            nnmn = 1;
                                    }
                                    hjjk++;
                                }
                            }
                        }

                        if (zzz >= 5) {
                            for (i = 0; i < 3; i++) {
                                int y1 = 0;
                                for (n = 0; n < 3; n++) {
                                    if (a[i][n] == 2)
                                        y1++;
                                }

                                if (y1 == 3) {
                                    System.out.println("\f");
                                    System.out.println("\n \n \n \n \n ");
                                    System.out.print("                 o-");
                                    for (int iii = 0; iii <= 64; iii++) {
                                        System.out.print("-");
                                    }
                                    System.out.print("o");
                                    System.out.println();
                                    for (i = 0; i < 3; i++) {
                                        for (int iii1 = 1; iii1 <= 3; iii1++)
                                            System.out.println("                 |                   |                         |                    |");

                                        for (n = 0; n < 3; n++) {
                                            if (n == 0)
                                                System.out.print("                 |");
                                            else if (n == 1)
                                                System.out.print("          |      ");
                                            else
                                                System.out.print("          |    ");

                                            if (a[i][n] >= 11)
                                                System.out.print("       " + a[i][n]);
                                            else if (a[i][n] == 1)
                                                System.out.print("       O ");
                                            else if (a[i][n] == 2)
                                                System.out.print("       x ");
                                        }
                                        System.out.println("       |");
                                        if (i != 2 && n != 2) {
                                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                                System.out.println("                 |                   |                         |                    |");
                                                if (iii1 == 4)
                                                    System.out.println("                 |-------------------|-------------------------|--------------------|");
                                            }
                                        } else {
                                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                                System.out.println("                 |                   |                         |                    |");
                                                if (iii1 == 4)
                                                    System.out.println("                 o------------------------------------------------------------------o");
                                            }
                                        }

                                    }
                                    System.out.print("                        the " + name + "is won");
                                    close = 0;
                                    zzz = 0;
                                    change = 2;
                                    cha = 1;
                                    count_pla++;
                                }

                            }

                            for (i = 0; i < 3; i++) {
                                int y1 = 0;
                                for (n = 0; n < 3; n++) {
                                    if (a[n][i] == 2)
                                        y1++;
                                }

                                if (y1 == 3) {
                                    System.out.println("\f");
                                    System.out.println("\n \n \n \n \n ");
                                    System.out.print("                 o-");
                                    for (int iii = 0; iii <= 64; iii++) {
                                        System.out.print("-");
                                    }
                                    System.out.print("o");
                                    System.out.println();
                                    for (i = 0; i < 3; i++) {
                                        for (int iii1 = 1; iii1 <= 3; iii1++)
                                            System.out.println("                 |                   |                         |                    |");

                                        for (n = 0; n < 3; n++) {
                                            if (n == 0)
                                                System.out.print("                 |");
                                            else if (n == 1)
                                                System.out.print("          |      ");
                                            else
                                                System.out.print("          |    ");

                                            if (a[i][n] >= 11)
                                                System.out.print("       " + a[i][n]);
                                            else if (a[i][n] == 1)
                                                System.out.print("       O ");
                                            else if (a[i][n] == 2)
                                                System.out.print("       x ");
                                        }
                                        System.out.println("       |");
                                        if (i != 2 && n != 2) {
                                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                                System.out.println("                 |                   |                         |                    |");
                                                if (iii1 == 4)
                                                    System.out.println("                 |-------------------|-------------------------|--------------------|");
                                            }
                                        } else {
                                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                                System.out.println("                 |                   |                         |                    |");
                                                if (iii1 == 4)
                                                    System.out.println("                 o------------------------------------------------------------------o");
                                            }
                                        }

                                    }
                                    System.out.print("                        the " + name + "is won");
                                    close = 0;
                                    change = 2;
                                    cha = 1;
                                    count_pla++;
                                }

                            }

                            if (a[0][0] == 2 && a[1][1] == 2 && a[2][2] == 2) {
                                System.out.println("\f");
                                System.out.println("\n \n \n \n \n ");
                                System.out.print("                 o-");
                                for (int iii = 0; iii <= 64; iii++) {
                                    System.out.print("-");
                                }
                                System.out.print("o");
                                System.out.println();
                                for (i = 0; i < 3; i++) {
                                    for (int iii1 = 1; iii1 <= 3; iii1++)
                                        System.out.println("                 |                   |                         |                    |");

                                    for (n = 0; n < 3; n++) {
                                        if (n == 0)
                                            System.out.print("                 |");
                                        else if (n == 1)
                                            System.out.print("          |      ");
                                        else
                                            System.out.print("          |    ");

                                        if (a[i][n] >= 11)
                                            System.out.print("       " + a[i][n]);
                                        else if (a[i][n] == 1)
                                            System.out.print("       O ");
                                        else if (a[i][n] == 2)
                                            System.out.print("       x ");
                                    }
                                    System.out.println("       |");
                                    if (i != 2 && n != 2) {
                                        for (int iii1 = 1; iii1 <= 4; iii1++) {
                                            System.out.println("                 |                   |                         |                    |");
                                            if (iii1 == 4)
                                                System.out.println("                 |-------------------|-------------------------|--------------------|");
                                        }
                                    } else {
                                        for (int iii1 = 1; iii1 <= 4; iii1++) {
                                            System.out.println("                 |                   |                         |                    |");
                                            if (iii1 == 4)
                                                System.out.println("                 o------------------------------------------------------------------o");
                                        }
                                    }

                                }
                                System.out.print("                        the " + name + "is won");
                                change = 2;
                                cha = 1;
                                close = 0;
                                count_pla++;
                            } else if (a[0][2] == 2 && a[1][1] == 2 && a[2][0] == 2) {
                                System.out.println("\f");
                                System.out.println("\n \n \n \n \n ");
                                System.out.print("                 o-");
                                for (int iii = 0; iii <= 64; iii++) {
                                    System.out.print("-");
                                }
                                System.out.print("o");
                                System.out.println();
                                for (i = 0; i < 3; i++) {
                                    for (int iii1 = 1; iii1 <= 3; iii1++)
                                        System.out.println("                 |                   |                         |                    |");

                                    for (n = 0; n < 3; n++) {
                                        if (n == 0)
                                            System.out.print("                 |");
                                        else if (n == 1)
                                            System.out.print("          |      ");
                                        else
                                            System.out.print("          |    ");

                                        if (a[i][n] >= 11)
                                            System.out.print("       " + a[i][n]);
                                        else if (a[i][n] == 1)
                                            System.out.print("       O ");
                                        else if (a[i][n] == 2)
                                            System.out.print("       x ");
                                    }
                                    System.out.println("       |");
                                    if (i != 2 && n != 2) {
                                        for (int iii1 = 1; iii1 <= 4; iii1++) {
                                            System.out.println("                 |                   |                         |                    |");
                                            if (iii1 == 4)
                                                System.out.println("                 |-------------------|-------------------------|--------------------|");
                                        }
                                    } else {
                                        for (int iii1 = 1; iii1 <= 4; iii1++) {
                                            System.out.println("                 |                   |                         |                    |");
                                            if (iii1 == 4)
                                                System.out.println("                 o------------------------------------------------------------------o");
                                        }
                                    }

                                }
                                System.out.print("                         the " + name + "is won");
                                change = 2;
                                cha = 1;
                                close = 0;
                                count_pla++;
                            }
                        }
                    }
                }

                if (zzz == 9 && close == 1) {
                    System.out.println("\f");
                    System.out.println("\n \n \n \n \n ");
                    System.out.print("                 o-");
                    for (int iii = 0; iii <= 64; iii++) {
                        System.out.print("-");
                    }
                    System.out.print("o");
                    System.out.println();
                    for (i = 0; i < 3; i++) {
                        for (int iii1 = 1; iii1 <= 3; iii1++)
                            System.out.println("                 |                   |                         |                    |");

                        for (n = 0; n < 3; n++) {
                            if (n == 0)
                                System.out.print("                 |");
                            else if (n == 1)
                                System.out.print("          |      ");
                            else
                                System.out.print("          |    ");

                            if (a[i][n] >= 11)
                                System.out.print("       " + a[i][n]);
                            else if (a[i][n] == 1)
                                System.out.print("       O ");
                            else if (a[i][n] == 2)
                                System.out.print("       x ");
                        }
                        System.out.println("       |");
                        if (i != 2 && n != 2) {
                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                System.out.println("                 |                   |                         |                    |");
                                if (iii1 == 4)
                                    System.out.println("                 |-------------------|-------------------------|--------------------|");
                            }
                        } else {
                            for (int iii1 = 1; iii1 <= 4; iii1++) {
                                System.out.println("                 |                   |                         |                    |");
                                if (iii1 == 4)
                                    System.out.println("                 o------------------------------------------------------------------o");
                            }
                        }

                    }
                    System.out.println("    it is draw match");
                    close = 0;
                    if (change == 1) {
                        change = 2;
                        cha = 1;
                    } else {
                        change = 1;
                        cha = 2;
                    }
                    count_draw++;
                }

            }

            for (int wer = 1; wer == 1; ) {
                rre = sc.nextInt();
                if (rre == 0 || rre == 1)
                    wer = 0;
            }

        }

        System.out.println("\f");
        System.out.println("\n \n \n \n \n ");
        System.out.println("     the total matchs played =                       " + count_total);
        System.out.println("     the total matchs won by supper computer =       " + count_com);
        System.out.println("     the total matchs won by " + name + " =              " + count_pla);
        System.out.println("     the total draw  matchs are =                    " + count_draw);

    }


    public void main() {
        System.out.print("                 o-");
        for (int iii = 0; iii <= 64; iii++) {
            System.out.print("-");
        }
        int i, n;
        int[][] a = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        System.out.print("o");
        System.out.println();
        for (i = 0; i < 3; i++) {
            for (int iii1 = 1; iii1 <= 3; iii1++)
                System.out.println("                 |                   |                         |                    |");

            for (n = 0; n < 3; n++) {
                if (n == 0)
                    System.out.print("                 |");
                else if (n == 1)
                    System.out.print("          |      ");
                else
                    System.out.print("          |    ");

                if (a[i][n] >= 11)
                    System.out.print("       " + a[i][n]);
                else if (a[i][n] == 1)
                    System.out.print("       O ");
                else if (a[i][n] == 2)
                    System.out.print("       x ");
            }
            System.out.print("       |");
            if (i != 2 && n != 2) {
                for (int iii1 = 1; iii1 <= 4; iii1++) {
                    System.out.println("                 |                   |                         |                    |");
                    if (iii1 == 4)
                        System.out.println("                 |-------------------|-------------------------|--------------------|");
                }
            } else {
                for (int iii1 = 1; iii1 <= 4; iii1++) {
                    System.out.println("                 |                   |                         |                    |");
                    if (iii1 == 4)
                        System.out.println("                 o------------------------------------------------------------------o");
                }
            }
        }
    }
}                  
