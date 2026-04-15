package com.tencent.bugly.beta.utils;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f4459a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f4460b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f4461c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f4462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f4463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f4464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f4465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f4466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BufferedInputStream f4467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f4468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f4469k;

    public a(String str) {
        this.f4462d = new byte[2];
        this.f4463e = new byte[4];
        this.f4464f = new byte[8];
        this.f4465g = f4461c;
        this.f4467i = null;
        this.f4468j = 0L;
        this.f4469k = 0L;
        this.f4466h = str;
        this.f4467i = new BufferedInputStream(new FileInputStream(this.f4466h));
        this.f4468j = 0L;
        this.f4469k = 0L;
    }

    public synchronized void a(long j10) {
        this.f4465g = j10;
    }

    public synchronized boolean b(long j10) {
        if (this.f4467i == null) {
            Log.e("BinaryFileReader", "Please open file first！");
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        long jSkip = j10;
        while (jSkip > 0) {
            try {
                jSkip -= this.f4467i.skip(jSkip);
            } catch (IOException unused) {
                Log.e("BinaryFileReader", "Failed to skip file pointer！");
                return false;
            }
        }
        this.f4468j += j10;
        return true;
    }

    public synchronized int c() {
        BufferedInputStream bufferedInputStream = this.f4467i;
        if (bufferedInputStream == null) {
            Log.e("BinaryFileReader", "Failed to skip file pointer！");
            return 0;
        }
        bufferedInputStream.read(this.f4463e);
        int iA = a(this.f4463e, this.f4465g);
        this.f4468j += 4;
        this.f4469k += 4;
        return iA;
    }

    public synchronized long d() {
        BufferedInputStream bufferedInputStream = this.f4467i;
        if (bufferedInputStream == null) {
            Log.e("BinaryFileReader", "Failed to skip file pointer！");
            return 0L;
        }
        bufferedInputStream.read(this.f4464f);
        long jB = b(this.f4464f, this.f4465g);
        this.f4468j += 8;
        this.f4469k += 8;
        return jB;
    }

    public synchronized short e() {
        BufferedInputStream bufferedInputStream = this.f4467i;
        if (bufferedInputStream == null) {
            Log.e("BinaryFileReader", "Failed to skip file pointer！");
            return (short) 0;
        }
        bufferedInputStream.read(this.f4462d);
        short sC = c(this.f4462d, this.f4465g);
        this.f4468j += 2;
        this.f4469k += 2;
        return sC;
    }

    public synchronized long f() {
        return ((long) b()) & 255;
    }

    public synchronized long g() {
        return ((long) c()) & 4294967295L;
    }

    public synchronized long h() {
        return d();
    }

    public synchronized long i() {
        return ((long) e()) & 65535;
    }

    private static short f(byte[] bArr) {
        if (bArr == null || bArr.length > 2) {
            return (short) -1;
        }
        return (short) b(bArr);
    }

    private static short g(byte[] bArr) {
        if (bArr == null || bArr.length > 2) {
            return (short) -1;
        }
        return (short) c(bArr);
    }

    public synchronized boolean a() {
        try {
            try {
                BufferedInputStream bufferedInputStream = this.f4467i;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                this.f4467i = null;
                this.f4466h = null;
                this.f4468j = 0L;
                this.f4469k = 0L;
            } catch (IOException e10) {
                Log.e("BinaryFileReader", e10.getMessage());
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    public synchronized byte b() {
        BufferedInputStream bufferedInputStream = this.f4467i;
        if (bufferedInputStream == null) {
            Log.e("BinaryFileReader", "Failed to skip file pointer！");
            return (byte) 0;
        }
        byte b10 = (byte) bufferedInputStream.read();
        this.f4468j++;
        this.f4469k++;
        return b10;
    }

    private static int c(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return -1;
        }
        return (int) e(bArr);
    }

    private static long d(byte[] bArr) {
        if (bArr == null || bArr.length > 8) {
            return -1L;
        }
        long j10 = 0;
        for (byte b10 : bArr) {
            j10 = (j10 << 8) | (((long) b10) & 255);
        }
        return j10;
    }

    private static long e(byte[] bArr) {
        if (bArr == null || bArr.length > 8) {
            return -1L;
        }
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            j10 = (j10 << 8) | (((long) bArr[length]) & 255);
        }
        return j10;
    }

    public static short c(byte[] bArr, long j10) {
        if (j10 == f4461c) {
            return g(bArr);
        }
        return f(bArr);
    }

    public synchronized boolean a(byte[] bArr) {
        try {
            this.f4467i.read(bArr);
            this.f4468j += (long) bArr.length;
            this.f4469k += (long) bArr.length;
        } catch (IOException e10) {
            Log.e("BinaryFileReader", e10.getMessage());
            return false;
        }
        return true;
    }

    private static int b(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return -1;
        }
        return (int) d(bArr);
    }

    public a(String str, long j10) {
        this.f4462d = new byte[2];
        this.f4463e = new byte[4];
        this.f4464f = new byte[8];
        this.f4467i = null;
        this.f4468j = 0L;
        this.f4469k = 0L;
        this.f4466h = str;
        this.f4465g = j10;
        this.f4467i = new BufferedInputStream(new FileInputStream(this.f4466h));
        this.f4468j = 0L;
        this.f4469k = 0L;
    }

    public static int a(byte[] bArr, long j10) {
        if (j10 == f4461c) {
            return c(bArr);
        }
        return b(bArr);
    }

    public static long b(byte[] bArr, long j10) {
        if (j10 == f4461c) {
            return e(bArr);
        }
        return d(bArr);
    }
}
