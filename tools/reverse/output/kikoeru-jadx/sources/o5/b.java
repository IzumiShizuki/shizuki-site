package o5;

import android.os.SystemClock;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16238a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f16239b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f16240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f16241d;

    public static long a() {
        SocketTimeoutException socketTimeoutException;
        char c3;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            synchronized (f16239b) {
            }
            datagramSocket.setSoTimeout(1000);
            c();
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b10 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i10], TinkerReport.KEY_APPLIED_DEXOPT_FORMAT);
                bArr2[b10] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b10);
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                    c3 = 0;
                } else {
                    long j10 = jCurrentTimeMillis / 1000;
                    Long.signum(j10);
                    long j11 = jCurrentTimeMillis - (j10 * 1000);
                    socketTimeoutException = socketTimeoutException2;
                    c3 = 0;
                    long j12 = j10 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j12 >> 24);
                    bArr[41] = (byte) (j12 >> 16);
                    bArr[42] = (byte) (j12 >> 8);
                    bArr[43] = (byte) j12;
                    long j13 = (j11 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j13 >> 24);
                    bArr[45] = (byte) (j13 >> 16);
                    bArr[46] = (byte) (j13 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j14 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b11 = bArr3[c3];
                    int i12 = bArr3[1] & 255;
                    long jE = e(bArr3, 24);
                    long jE2 = e(bArr3, 32);
                    long jE3 = e(bArr3, 40);
                    b((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i12, jE3);
                    long j15 = (j14 + (((jE3 - j14) + (jE2 - jE)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j15;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e10;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e10);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        socketTimeoutException2.getClass();
                        throw socketTimeoutException2;
                    }
                    i10++;
                    i11 = i13;
                    b10 = 0;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(t0.B(b11, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(t0.B(i10, "SNTP: Untrusted stratum: "));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void c() {
        synchronized (f16239b) {
        }
    }

    public static long d(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long e(byte[] bArr, int i10) {
        long jD = d(bArr, i10);
        long jD2 = d(bArr, i10 + 4);
        if (jD == 0 && jD2 == 0) {
            return 0L;
        }
        return ((jD2 * 1000) / 4294967296L) + ((jD - 2208988800L) * 1000);
    }
}
