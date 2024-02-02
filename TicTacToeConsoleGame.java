import java.io.IOException;
import java.util.Scanner;

class TicTacToeConsoleGame {

    public static void main(String[] args) throws IOException, InterruptedException {
        int[][][] _AI_Data = {
                {{11, 22, 33, 44, 1, 66, 77, 88, 99}, {11, 2, 33, 44, 1, 66, 77, 88, 99}, {1, 2, 33, 44, 1, 66, 77, 88, 99}, {1, 2, 33, 44, 1, 66, 77, 88, 2}, {1, 2, 33, 1, 1, 66, 77, 88, 2}},
                {{11, 22, 33, 44, 55, 66, 77, 88, 1}, {11, 22, 33, 44, 2, 66, 77, 88, 1}, {1, 22, 33, 44, 2, 66, 77, 88, 1}, {1, 22, 2, 44, 2, 66, 77, 88, 1}, {1, 22, 2, 44, 2, 66, 1, 88, 1}},
                {{11, 22, 33, 44, 1, 66, 77, 88, 99}, {11, 2, 33, 44, 1, 66, 77, 88, 99}, {11, 2, 1, 44, 1, 66, 77, 88, 99}, {11, 2, 1, 44, 1, 66, 2, 88, 99}, {11, 2, 1, 44, 1, 1, 2, 88, 99}},
                {{11, 22, 33, 44, 1, 66, 77, 88, 99}, {11, 2, 33, 44, 1, 66, 77, 88, 99}, {11, 2, 1, 44, 1, 66, 77, 88, 99}, {11, 2, 1, 44, 1, 66, 2, 88, 99}, {11, 2, 1, 44, 1, 66, 2, 88, 1}},
                {{11, 22, 33, 44, 1, 66, 77, 88, 99}, {11, 2, 33, 44, 1, 66, 77, 88, 99}, {1, 2, 33, 44, 1, 66, 77, 88, 99}, {1, 2, 33, 44, 1, 66, 77, 88, 2}, {1, 2, 33, 44, 1, 66, 1, 88, 2}},
                {{11, 22, 33, 44, 55, 66, 77, 88, 1}, {11, 22, 33, 44, 55, 66, 77, 2, 1}, {11, 22, 33, 44, 1, 66, 77, 2, 1}, {2, 22, 33, 44, 1, 66, 77, 2, 1}, {2, 22, 33, 44, 1, 1, 77, 2, 1}},
                {{11, 22, 33, 44, 55, 66, 1, 88, 99}, {11, 22, 33, 44, 55, 66, 1, 2, 99}, {11, 22, 33, 44, 1, 66, 1, 2, 99}, {11, 22, 2, 44, 1, 66, 1, 2, 99}, {11, 22, 2, 1, 1, 66, 1, 2, 99}},
                {{11, 22, 33, 44, 55, 1, 77, 88, 99}, {11, 2, 33, 44, 55, 1, 77, 88, 99}, {11, 2, 1, 44, 55, 1, 77, 88, 99}, {11, 2, 1, 44, 55, 1, 77, 88, 2}, {11, 2, 1, 44, 1, 1, 77, 88, 2}},
                {{11, 22, 33, 44, 55, 66, 1, 88, 99}, {11, 22, 33, 44, 55, 66, 1, 88, 2}, {11, 22, 33, 1, 55, 66, 1, 88, 2}, {2, 22, 33, 1, 55, 66, 1, 88, 2}, {2, 22, 33, 1, 1, 66, 1, 88, 2}},
                {{11, 22, 1, 44, 55, 66, 77, 88, 99}, {11, 22, 1, 2, 55, 66, 77, 88, 99}, {11, 22, 1, 2, 55, 66, 77, 88, 1}, {11, 22, 1, 2, 55, 2, 77, 88, 1}, {11, 22, 1, 2, 1, 2, 77, 88, 1}},
                {{11, 22, 33, 44, 55, 66, 77, 88, 1}, {11, 22, 33, 2, 55, 66, 77, 88, 1}, {11, 22, 1, 2, 55, 66, 77, 88, 1}, {11, 22, 1, 2, 55, 2, 77, 88, 1}, {11, 22, 1, 2, 1, 2, 77, 88, 1}},
                {{1, 22, 33, 44, 55, 66, 77, 88, 99}, {1, 22, 2, 44, 55, 66, 77, 88, 99}, {1, 22, 2, 1, 55, 66, 77, 88, 99}, {1, 22, 2, 1, 55, 66, 2, 88, 99}, {1, 22, 2, 1, 1, 66, 2, 88, 99}},
                {{11, 22, 33, 44, 55, 66, 77, 1, 99}, {11, 22, 33, 2, 55, 66, 77, 1, 99}, {11, 22, 33, 2, 55, 66, 1, 1, 99}, {11, 22, 33, 2, 55, 66, 1, 1, 2}, {11, 22, 33, 2, 1, 66, 1, 1, 2}},
                {{11, 22, 33, 44, 1, 66, 77, 88, 99}, {11, 22, 33, 44, 1, 66, 77, 88, 2}, {1, 22, 33, 44, 1, 66, 77, 88, 2}, {1, 2, 33, 44, 1, 66, 77, 88, 2}, {1, 2, 33, 1, 1, 66, 77, 88, 2}},
                {{11, 22, 33, 44, 1, 66, 77, 88, 99}, {11, 22, 33, 44, 1, 66, 77, 88, 2}, {1, 22, 33, 44, 1, 66, 77, 88, 2}, {1, 22, 33, 2, 1, 66, 77, 88, 2}, {1, 1, 33, 2, 1, 66, 77, 88, 2}},
                {{11, 22, 33, 44, 55, 1, 77, 88, 99}, {11, 22, 33, 44, 55, 1, 77, 88, 2}, {11, 1, 33, 44, 55, 1, 77, 88, 2}, {11, 1, 2, 44, 55, 1, 77, 88, 2}, {11, 1, 2, 44, 1, 1, 77, 88, 2}},
                {{11, 22, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 1, 44, 55, 66, 77, 1, 99}, {11, 2, 1, 2, 55, 66, 77, 1, 99}, {11, 2, 1, 2, 55, 66, 77, 1, 1}},
                {{11, 22, 33, 44, 55, 66, 77, 88, 1}, {2, 22, 33, 44, 55, 66, 77, 88, 1}, {2, 22, 33, 44, 55, 66, 1, 88, 1}, {2, 22, 33, 44, 55, 66, 1, 2, 1}, {2, 22, 1, 44, 55, 66, 1, 2, 1}},
                {{11, 22, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 1, 44, 55, 66, 77, 1, 99}, {2, 2, 1, 44, 55, 66, 77, 1, 99}, {2, 2, 1, 44, 55, 66, 77, 1, 1}},
                {{11, 22, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 33, 44, 55, 66, 77, 1, 99}, {1, 2, 33, 44, 55, 66, 77, 1, 99}, {1, 2, 2, 44, 55, 66, 77, 1, 99}, {1, 2, 2, 44, 55, 66, 1, 1, 99}},
                {{11, 22, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 33, 44, 55, 66, 77, 1, 99}, {1, 2, 33, 44, 55, 66, 77, 1, 99}, {1, 2, 33, 44, 55, 2, 77, 1, 99}, {1, 2, 33, 44, 55, 2, 1, 1, 99}},
                {{11, 22, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 1, 44, 55, 66, 77, 1, 99}, {11, 2, 1, 44, 55, 2, 77, 1, 99}, {11, 2, 1, 44, 55, 2, 1, 1, 99}},
                {{11, 22, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 33, 44, 55, 66, 77, 1, 99}, {1, 2, 33, 44, 55, 66, 77, 1, 99}, {1, 2, 33, 2, 55, 66, 77, 1, 99}, {1, 2, 33, 2, 55, 66, 77, 1, 1}},
                {{11, 22, 33, 44, 55, 66, 77, 1, 99}, {11, 2, 33, 44, 55, 66, 77, 1, 99}, {1, 2, 33, 44, 55, 66, 77, 1, 99}, {1, 2, 33, 44, 2, 66, 77, 1, 99}, {1, 2, 33, 44, 2, 66, 77, 1, 1},}
        };
        System.out.print("\f");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("  Enter your name : >>> ");
        name = sc.nextLine();
        System.out.print("\f");
        System.out.println("\n\n\n\n\n");

        int count_com = 0;
        int count_pla = 0;
        int count_draw = 0;
        int count_total = 0;
        int change = 1, cha = 2, ii, nn, mm;
        int last = 0;
        for (int repl = 1; repl == 1; count_total++) {
            int[][] a = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
            int i, n, zzz = 0, close = 1;

            int[] dd1 = {3, 6, 9, 2, 5, 8, 1, 4, 7};
            int[] dd2 = {7, 4, 1, 8, 5, 2, 9, 6, 3};

            while (close == 1) {
                int exe = 0;
                int p2, p1;
                int[] aaaaa = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                int mmm = 0;
                int[] a1 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                int[] a2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                int[] a3 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                int[] a4 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                if (zzz <= 8 && close == 1) {
                    if (change == 1 || cha == 2) {
                        cha = 1;

                        if (zzz == 0) {
                            int sdf = 0;
                            int zxcv;
                            while (sdf == 0) {
                                sdf = 1;
                                mmm = 1;
                                double asdf = Math.random();
                                double zxcvv = asdf * 10;
                                zxcv = (int) zxcvv;

                                if (last == zxcv) {
                                    sdf = 0;

                                }
                                last = zxcv;

                            }
                            p1 = 1;
                            for (i = 0; i < 3; i++) {
                                for (n = 0; n < 3; n++) {
                                    if (p1 == last)
                                        a[i][n] = 1;
                                    p1++;
                                }

                            }

                        }

                        if (zzz <= 4 && mmm == 0) {
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
                        ///
                        for (ii = 0; (ii <= 23 && mmm == 0 && exe == 0); ii++) {
                            int[] aa1b2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                            int[] aa1b3 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                            int[] aa1b4 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                            int[] aa1b5 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
                            for (nn = 1; nn <= 4; nn++) {
                                for (mm = 0; mm <= 8; mm++) {

                                    if (nn == 1)
                                        aa1b2[mm] = _AI_Data[ii][nn][mm];
                                    else if (nn == 2)
                                        aa1b3[mm] = _AI_Data[ii][nn][mm];
                                    else if (nn == 3)
                                        aa1b4[mm] = _AI_Data[ii][nn][mm];
                                    else if (nn == 4)
                                        aa1b5[mm] = _AI_Data[ii][nn][mm];
                                }
                            }
                            if (zzz == 2 && mmm == 0) {
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
                                        exe = 1;
                                        mmm = 1;
                                    }
                                }
                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b3[dd2[i] - 1];
                                        exe = 1;
                                        mmm = 1;
                                    }
                                }
                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b3[dd1[i] - 1];
                                        exe = 1;
                                        mmm = 1;
                                    }
                                }
                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b3[8 - i];
                                        exe = 1;
                                        mmm = 1;
                                    }
                                }
                            }
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
                                        exe = 1;
                                        mmm = 1;
                                    }
                                }
                                if (t2 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b5[dd2[i] - 1];
                                        exe = 1;
                                        mmm = 1;
                                    }
                                }
                                if (t3 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b5[dd1[i] - 1];
                                        exe = 1;
                                        mmm = 1;
                                    }
                                }
                                if (t4 == 9) {
                                    for (i = 0; i <= 8; i++) {
                                        aaaaa[i] = aa1b5[8 - i];
                                        exe = 1;
                                        mmm = 1;
                                    }
                                }
                            }
                            //
                            if (mmm == 1 && exe == 1) {
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
                        }
                        for (int tim = 1; tim <= 2 && mmm == 0; tim++) {
                            if ((mmm == 0 && zzz >= 1)) {

                                int z1 = a[0][0], z2 = a[0][1], z3 = a[0][2];
                                int z4 = a[1][0], z5 = a[1][1], z6 = a[1][2];
                                int z7 = a[2][0], z8 = a[2][1], z9 = a[2][2];
                                if (z1 == tim && z2 == tim && z3 > 4) {
                                    a[0][2] = 1;
                                    mmm = 1;
                                } else if (z1 == tim && z3 == tim && z2 > 4) {
                                    a[0][1] = 1;
                                    mmm = 1;
                                } else if (z2 == tim && z3 == tim && z1 > 4) {
                                    a[0][0] = 1;
                                    mmm = 1;
                                } else if (z4 == tim && z5 == tim && z6 > 4) {
                                    a[1][2] = 1;
                                    mmm = 1;
                                } else if (z4 == tim && z6 == tim && z5 > 4) {
                                    a[1][1] = 1;
                                    mmm = 1;
                                } else if (z5 == tim && z6 == tim && z4 > 4) {
                                    a[1][0] = 1;
                                    mmm = 1;
                                } else if (z7 == tim && z8 == tim && z9 > 4) {
                                    a[2][2] = 1;
                                    mmm = 1;
                                } else if (z7 == tim && z9 == tim && z8 > 4) {
                                    a[2][1] = 1;
                                    mmm = 1;
                                } else if (z8 == tim && z9 == tim && z7 > 4) {
                                    a[2][0] = 1;
                                    mmm = 1;
                                } else if (z1 == tim && z4 == tim && z7 > 4) {
                                    a[2][0] = 1;
                                    mmm = 1;
                                } else if (z1 == tim && z7 == tim && z4 > 4) {
                                    a[1][0] = 1;
                                    mmm = 1;
                                } else if (z4 == tim && z7 == tim && z1 > 4) {
                                    a[0][0] = 1;
                                    mmm = 1;
                                } else if (z2 == tim && z5 == tim && z8 > 4) {
                                    a[2][1] = 1;
                                    mmm = 1;
                                } else if (z2 == tim && z8 == tim && z5 > 4) {
                                    a[1][1] = 1;
                                    mmm = 1;
                                } else if (z5 == tim && z8 == tim && z2 > 4) {
                                    a[0][1] = 1;
                                    mmm = 1;
                                } else if (z3 == tim && z6 == tim && z9 > 4) {
                                    a[2][2] = 1;
                                    mmm = 1;
                                } else if (z3 == tim && z9 == tim && z6 > 4) {
                                    a[1][2] = 1;
                                    mmm = 1;
                                } else if (z6 == tim && z9 == tim && z3 > 4) {
                                    a[0][2] = 1;
                                    mmm = 1;
                                } else if (z1 == tim && z5 == tim && z9 > 4) {
                                    a[2][2] = 1;
                                    mmm = 1;
                                } else if (z1 == tim && z9 == tim && z5 > 4) {
                                    a[1][1] = 1;
                                    mmm = 1;
                                } else if (z5 == tim && z9 == tim && z1 > 4) {
                                    a[0][0] = 1;
                                    mmm = 1;
                                } else if (z3 == tim && z5 == tim && z7 > 4) {
                                    a[2][0] = 1;
                                    mmm = 1;
                                } else if (z3 == tim && z7 == tim && z5 > 4) {
                                    a[1][1] = 1;
                                    mmm = 1;
                                } else if (z5 == tim && z7 == tim && z3 > 4) {
                                    a[0][2] = 1;
                                    mmm = 1;
                                }

                            }
                        }
                        if (mmm == 0) {
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
                        //

                        System.out.print("\f");
                        System.out.println("                 o--------------------------------------------------------------------o");
                        System.out.println("                 |                     |                       |                      |");
                        System.out.println("                 |                     |                       |                      |");
                        System.out.println("                 |                     |                       |                      |");
                        for (int qwq = 0; qwq <= 2; qwq++) {
                            if (a[qwq][0] == 1 && a[qwq][1] == 1 && a[qwq][2] == 1)
                                System.out.println("                 |          O          |           O           |          O           |");
                            else if (a[qwq][0] == 2 && a[qwq][1] == 2 && a[qwq][2] == 2)
                                System.out.println("                 |          X          |           X           |           X          |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] == 1 && a[qwq][2] == 1)
                                System.out.println("                 |          " + a[qwq][0] + "         |           O           |          O           |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] >= 11 && a[qwq][2] == 1)
                                System.out.println("                 |          " + a[qwq][0] + "         |           " + a[qwq][1] + "          |          O           |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] >= 11 && a[qwq][2] >= 11)
                                System.out.println("                 |          " + a[qwq][0] + "         |           " + a[qwq][1] + "          |          " + a[qwq][2] + "          |");
                            else if (a[qwq][0] == 1 && a[qwq][1] == 1 && a[qwq][2] >= 11)
                                System.out.println("                 |           O         |           O           |          " + a[qwq][2] + "          |");
                            else if (a[qwq][0] == 1 && a[qwq][1] >= 11 && a[qwq][2] >= 11)
                                System.out.println("                 |          O          |           " + a[qwq][1] + "          |          " + a[qwq][2] + "          |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] == 1 && a[qwq][2] >= 11)
                                System.out.println("                 |          " + a[qwq][0] + "         |            O          |          " + a[qwq][2] + "          |");
                            else if (a[qwq][0] == 1 && a[qwq][1] >= 11 && a[qwq][2] == 1)
                                System.out.println("                 |           O         |           " + a[qwq][1] + "          |           O          |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] == 2 && a[qwq][2] == 2)
                                System.out.println("                 |          " + a[qwq][0] + "         |          X           |          X           |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] >= 11 && a[qwq][2] == 2)
                                System.out.println("                 |          " + a[qwq][0] + "         |           " + a[qwq][1] + "          |          X           |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] >= 11 && a[qwq][2] >= 11)
                                System.out.println("                 |          " + a[qwq][0] + "         |           " + a[qwq][1] + "          |          " + a[qwq][2] + "          |");
                            else if (a[qwq][0] == 2 && a[qwq][1] == 2 && a[qwq][2] >= 11)
                                System.out.println("                 |           X         |           X           |          " + a[qwq][2] + "          |");
                            else if (a[qwq][0] == 2 && a[qwq][1] >= 11 && a[qwq][2] >= 11)
                                System.out.println("                 |          X          |           " + a[qwq][1] + "          |          " + a[qwq][2] + "          |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] == 2 && a[qwq][2] >= 11)
                                System.out.println("                 |          " + a[qwq][0] + "         |            X          |          " + a[qwq][2] + "          |");
                            else if (a[qwq][0] == 2 && a[qwq][1] >= 11 && a[qwq][2] == 2)
                                System.out.println("                 |           X         |           " + a[qwq][1] + "          |           X          |");
                            else if (a[qwq][0] == 1 && a[qwq][1] == 2 && a[qwq][2] == 2)
                                System.out.println("                 |          O          |          X           |          X           |");
                            else if (a[qwq][0] == 1 && a[qwq][1] == 1 && a[qwq][2] == 2)
                                System.out.println("                 |          O          |           O           |          X           |");
                            else if (a[qwq][0] == 1 && a[qwq][1] == 1 && a[qwq][2] == 1)
                                System.out.println("                 |          O          |           O           |          O           |");
                            else if (a[qwq][0] == 2 && a[qwq][1] == 2 && a[qwq][2] == 1)
                                System.out.println("                 |           X         |           X           |          O           |");
                            else if (a[qwq][0] == 2 && a[qwq][1] == 1 && a[qwq][2] == 1)
                                System.out.println("                 |          X          |           O           |          O           |");
                            else if (a[qwq][0] == 1 && a[qwq][1] == 2 && a[qwq][2] == 1)
                                System.out.println("                 |          O          |            X          |          O           |");
                            else if (a[qwq][0] == 2 && a[qwq][1] == 1 && a[qwq][2] == 2)
                                System.out.println("                 |           X         |           O           |           X          |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] == 1 && a[qwq][2] == 2)
                                System.out.println("                 |          " + a[qwq][0] + "         |           O           |          X           |");
                            else if (a[qwq][0] == 1 && a[qwq][1] >= 11 && a[qwq][2] == 2)
                                System.out.println("                 |          O          |            " + a[qwq][1] + "         |          X           |");
                            else if (a[qwq][0] == 1 && a[qwq][1] == 2 && a[qwq][2] >= 11)
                                System.out.println("                 |          O          |           X           |           " + a[qwq][2] + "         |");
                            else if (a[qwq][0] >= 11 && a[qwq][1] == 2 && a[qwq][2] == 1)
                                System.out.println("                 |          " + a[qwq][0] + "         |           X           |          O           |");
                            else if (a[qwq][0] == 2 && a[qwq][1] >= 11 && a[qwq][2] == 1)
                                System.out.println("                 |          X          |            " + a[qwq][1] + "         |          O           |");
                            else if (a[qwq][0] == 2 && a[qwq][1] == 1 && a[qwq][2] >= 11)
                                System.out.println("                 |          X          |           O           |           " + a[qwq][2] + "         |");
                            System.out.println("                 |                     |                       |                      |");
                            System.out.println("                 |                     |                       |                      |");
                            System.out.println("                 |                     |                       |                      |");
                            System.out.println("                 o--------------------------------------------------------------------o");
                            if (qwq != 2) {
                                System.out.println("                 |                     |                       |                      |");
                                System.out.println("                 |                     |                       |                      |");
                                System.out.println("                 |                     |                       |                      |");
                            }
                        }
                        for (ii = 0; ii <= 2; ii++) {
                            int tttt = 0;
                            for (nn = 0; nn <= 2; nn++) {
                                if (a[ii][nn] == 1)
                                    tttt++;
                                if (tttt == 3) {
                                    System.out.println("     the  " + (count_total + 1) + "  match won by computer  ");
                                    close = 0;
                                    nn = 5;
                                    ii = 5;
                                    change = 1;
                                    cha = 2;
                                    tttt = 0;
                                    count_com++;
                                }
                            }
                        }

                        for (ii = 0; ii <= 2; ii++) {
                            int tttt = 0;
                            for (nn = 0; nn <= 2; nn++) {
                                if (a[nn][ii] == 1)
                                    tttt++;
                                if (tttt == 3) {
                                    System.out.println("     the  " + (count_total + 1) + "  match won by computer  ");
                                    close = 0;
                                    nn = 5;
                                    ii = 5;
                                    change = 1;
                                    cha = 2;
                                    tttt = 0;
                                    count_com++;
                                }
                            }
                        }
                        if (a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1) {
                            System.out.println("     the  " + (count_total + 1) + "  match won by computer  ");
                            close = 0;
                            change = 1;
                            cha = 2;
                            count_com++;
                        } else if (a[0][2] == 1 && a[1][1] == 1 && a[2][0] == 1) {
                            System.out.println("     the  " + (count_total + 1) + "  match won by computer  ");
                            close = 0;
                            change = 1;
                            cha = 2;
                            count_com++;
                        }
                        zzz++;
                    }
                }

                if (zzz <= 8 && close == 1) {
                    if (change == 2 || cha == 1) {
                        cha = 2;
                        zzz++;
                        int re1 = 0;
                        for (int nnmn = 2; nnmn >= 1; ) {
                            if (change == 1)
                                re1 = 1;
                            if (re1 == 1) {
                                nnmn = nnmn - 2;
                                System.out.print(" \n\n\n\n enter the place number by  " + name + " : >>> ");
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
                            re1 = 1;
                            System.out.print("\f");
                            System.out.println("                 o--------------------------------------------------------------------o");
                            System.out.println("                 |                     |                       |                      |");
                            System.out.println("                 |                     |                       |                      |");
                            System.out.println("                 |                     |                       |                      |");
                            for (int qwq = 0; qwq <= 2; qwq++) {
                                if (a[qwq][0] == 1 && a[qwq][1] == 1 && a[qwq][2] == 1)
                                    System.out.println("                 |          O          |           O           |          O           |");
                                else if (a[qwq][0] == 2 && a[qwq][1] == 2 && a[qwq][2] == 2)
                                    System.out.println("                 |          X          |           X           |           X          |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] == 1 && a[qwq][2] == 1)
                                    System.out.println("                 |          " + a[qwq][0] + "         |           O           |          O           |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] >= 11 && a[qwq][2] == 1)
                                    System.out.println("                 |          " + a[qwq][0] + "         |           " + a[qwq][1] + "          |          O           |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] >= 11 && a[qwq][2] >= 11)
                                    System.out.println("                 |          " + a[qwq][0] + "         |           " + a[qwq][1] + "          |          " + a[qwq][2] + "          |");
                                else if (a[qwq][0] == 1 && a[qwq][1] == 1 && a[qwq][2] >= 11)
                                    System.out.println("                 |           O         |           O           |          " + a[qwq][2] + "          |");
                                else if (a[qwq][0] == 1 && a[qwq][1] >= 11 && a[qwq][2] >= 11)
                                    System.out.println("                 |          O          |           " + a[qwq][1] + "          |          " + a[qwq][2] + "          |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] == 1 && a[qwq][2] >= 11)
                                    System.out.println("                 |          " + a[qwq][0] + "         |            O          |          " + a[qwq][2] + "          |");
                                else if (a[qwq][0] == 1 && a[qwq][1] >= 11 && a[qwq][2] == 1)
                                    System.out.println("                 |           O         |           " + a[qwq][1] + "          |           O          |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] == 2 && a[qwq][2] == 2)
                                    System.out.println("                 |          " + a[qwq][0] + "         |          X           |          X           |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] >= 11 && a[qwq][2] == 2)
                                    System.out.println("                 |          " + a[qwq][0] + "         |           " + a[qwq][1] + "          |          X           |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] >= 11 && a[qwq][2] >= 11)
                                    System.out.println("                 |          " + a[qwq][0] + "         |           " + a[qwq][1] + "          |          " + a[qwq][2] + "          |");
                                else if (a[qwq][0] == 2 && a[qwq][1] == 2 && a[qwq][2] >= 11)
                                    System.out.println("                 |           X         |           X           |          " + a[qwq][2] + "          |");
                                else if (a[qwq][0] == 2 && a[qwq][1] >= 11 && a[qwq][2] >= 11)
                                    System.out.println("                 |          X          |           " + a[qwq][1] + "          |          " + a[qwq][2] + "          |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] == 2 && a[qwq][2] >= 11)
                                    System.out.println("                 |          " + a[qwq][0] + "         |            X          |          " + a[qwq][2] + "          |");
                                else if (a[qwq][0] == 2 && a[qwq][1] >= 11 && a[qwq][2] == 2)
                                    System.out.println("                 |           X         |           " + a[qwq][1] + "          |           X          |");
                                else if (a[qwq][0] == 1 && a[qwq][1] == 2 && a[qwq][2] == 2)
                                    System.out.println("                 |          O          |          X           |          X           |");
                                else if (a[qwq][0] == 1 && a[qwq][1] == 1 && a[qwq][2] == 2)
                                    System.out.println("                 |          O          |           O           |          X           |");
                                else if (a[qwq][0] == 1 && a[qwq][1] == 1 && a[qwq][2] == 1)
                                    System.out.println("                 |          O          |           O           |          O           |");
                                else if (a[qwq][0] == 2 && a[qwq][1] == 2 && a[qwq][2] == 1)
                                    System.out.println("                 |           X         |           X           |          O           |");
                                else if (a[qwq][0] == 2 && a[qwq][1] == 1 && a[qwq][2] == 1)
                                    System.out.println("                 |          X          |           O           |          O           |");
                                else if (a[qwq][0] == 1 && a[qwq][1] == 2 && a[qwq][2] == 1)
                                    System.out.println("                 |          O          |            X          |          O           |");
                                else if (a[qwq][0] == 2 && a[qwq][1] == 1 && a[qwq][2] == 2)
                                    System.out.println("                 |           X         |           O           |           X          |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] == 1 && a[qwq][2] == 2)
                                    System.out.println("                 |          " + a[qwq][0] + "         |           O           |          X           |");
                                else if (a[qwq][0] == 1 && a[qwq][1] >= 11 && a[qwq][2] == 2)
                                    System.out.println("                 |          O          |            " + a[qwq][1] + "         |          X           |");
                                else if (a[qwq][0] == 1 && a[qwq][1] == 2 && a[qwq][2] >= 11)
                                    System.out.println("                 |          O          |           X           |           " + a[qwq][2] + "         |");
                                else if (a[qwq][0] >= 11 && a[qwq][1] == 2 && a[qwq][2] == 1)
                                    System.out.println("                 |          " + a[qwq][0] + "         |           X           |          O           |");
                                else if (a[qwq][0] == 2 && a[qwq][1] >= 11 && a[qwq][2] == 1)
                                    System.out.println("                 |          X          |            " + a[qwq][1] + "         |          O           |");
                                else if (a[qwq][0] == 2 && a[qwq][1] == 1 && a[qwq][2] >= 11)
                                    System.out.println("                 |          X          |           O           |           " + a[qwq][2] + "         |");
                                System.out.println("                 |                     |                       |                      |");
                                System.out.println("                 |                     |                       |                      |");
                                System.out.println("                 |                     |                       |                      |");
                                System.out.println("                 o--------------------------------------------------------------------o");
                                if (qwq != 2) {
                                    System.out.println("                 |                     |                       |                      |");
                                    System.out.println("                 |                     |                       |                      |");
                                    System.out.println("                 |                     |                       |                      |");
                                }
                            }
                        }

                        for (ii = 0; ii <= 2; ii++) {
                            int tttt = 0;
                            for (nn = 0; nn <= 2; nn++) {
                                if (a[ii][nn] == 2)
                                    tttt++;
                                if (tttt == 3) {
                                    System.out.println("     the  " + (count_total + 1) + "  match won by  " + name);
                                    close = 0;
                                    nn = 5;
                                    change = 2;
                                    cha = 1;
                                    ii = 5;
                                    tttt = 0;
                                    count_pla++;
                                }
                            }
                        }
                        for (ii = 0; ii <= 2; ii++) {
                            int tttt = 0;
                            for (nn = 0; nn <= 2; nn++) {
                                if (a[nn][ii] == 2)
                                    tttt++;
                                if (tttt == 3) {
                                    System.out.println("     the  " + (count_total + 1) + "  match won by  " + name);
                                    close = 0;
                                    nn = 5;
                                    change = 2;
                                    cha = 1;
                                    ii = 5;
                                    tttt = 0;
                                    count_pla++;
                                }
                            }
                        }
                        if (a[0][0] == 2 && a[1][1] == 2 && a[2][2] == 2) {
                            System.out.println("     the  " + (count_total + 1) + "  match won by  " + name);
                            close = 0;
                            change = 2;
                            cha = 1;
                            count_pla++;
                        } else if (a[0][2] == 2 && a[1][1] == 2 && a[2][0] == 2) {
                            System.out.println("     the  " + (count_total + 1) + "  match won by  " + name);
                            close = 0;
                            change = 2;
                            cha = 1;
                            count_pla++;
                        }
                    }
                }
                if (zzz == 9) {
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

            for (int ed = 1; ed == 1; ) {
                repl = sc.nextInt();
                if (repl == 1 || repl == 0)
                    ed = 0;
            }
        }
        System.out.println("\f");
        System.out.println("\n \n \n \n \n ");
        System.out.println("     the total matchs played =                       " + count_total);
        System.out.println("     the total matchs won by supper computer =       " + count_com);
        System.out.println("     the total matchs won by " + name + " =              " + count_pla);
        System.out.println("     the total draw  matchs are =                    " + count_draw);

    }
}
