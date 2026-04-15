package j6;

import android.util.SparseArray;
import b5.d0;
import b7.m;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.p2;
import j2.h0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import m4.p0;
import o6.j;
import p4.c0;
import p4.s;
import q4.p;
import r5.i0;
import r5.k;
import r5.n;
import r5.o;
import r5.q;
import ya.a1;
import ya.g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f10538f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f10539g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final byte[] f10540h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final byte[] f10541i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final UUID f10542j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Map f10543k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public d2.b F;
    public d2.b G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10544a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f10545a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f10546b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f10547b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f10548c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public byte f10549c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10550d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f10551d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10552e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public q f10553e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f10554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f10555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f10556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f10557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f10558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f10559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f10560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f10561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f10562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f10563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f10564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f10565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f10566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f10567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f10572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10573y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10574z;

    static {
        int i10 = c0.f16548a;
        f10539g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f10540h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f10541i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f10542j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        h0.r(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        h0.r(TinkerReport.KEY_APPLIED_VERSION_CHECK, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f10543k0 = Collections.unmodifiableMap(map);
    }

    public d(j jVar, int i10) {
        b bVar = new b();
        this.f10567s = -1L;
        this.f10568t = -9223372036854775807L;
        this.f10569u = -9223372036854775807L;
        this.f10570v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f10544a = bVar;
        bVar.f10507d = new p2(this);
        this.f10554f = jVar;
        this.f10550d = (i10 & 1) == 0;
        this.f10552e = (i10 & 2) == 0;
        this.f10546b = new e();
        this.f10548c = new SparseArray();
        this.f10557i = new s(4);
        this.f10558j = new s(ByteBuffer.allocate(4).putInt(-1).array());
        this.f10559k = new s(4);
        this.f10555g = new s(p.f17770a);
        this.f10556h = new s(4);
        this.f10560l = new s();
        this.f10561m = new s();
        this.f10562n = new s(8);
        this.f10563o = new s();
        this.f10564p = new s();
        this.O = new int[1];
    }

    public static byte[] k(long j10, long j11, String str) {
        p4.c.c(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        int i13 = c0.f16548a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final void b(int i10) {
        if (this.F == null || this.G == null) {
            throw p0.a(null, "Element " + i10 + " must be in a Cues");
        }
    }

    public final void d(int i10) {
        if (this.f10572x != null) {
            return;
        }
        throw p0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(j6.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.d.e(j6.c, long, int, int, int):void");
    }

    @Override // r5.n
    public final boolean f(o oVar) throws EOFException, InterruptedIOException {
        m mVar = new m((byte) 0, 4);
        s sVar = (s) mVar.f1959c;
        k kVar = (k) oVar;
        long j10 = kVar.f18845c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        kVar.i(sVar.f16611a, 0, 4, false);
        long jW = sVar.w();
        mVar.f1958b = 4;
        while (true) {
            if (jW != 440786851) {
                int i11 = mVar.f1958b + 1;
                mVar.f1958b = i11;
                if (i11 == i10) {
                    break;
                }
                kVar.i(sVar.f16611a, 0, 1, false);
                jW = ((jW << 8) & (-256)) | ((long) (sVar.f16611a[0] & 255));
            } else {
                long jS = mVar.s(kVar);
                long j12 = mVar.f1958b;
                if (jS != Long.MIN_VALUE && (j10 == -1 || j12 + jS < j10)) {
                    while (true) {
                        long j13 = mVar.f1958b;
                        long j14 = j12 + jS;
                        if (j13 < j14) {
                            if (mVar.s(kVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jS2 = mVar.s(kVar);
                            if (jS2 < 0 || jS2 > 2147483647L) {
                                break;
                            }
                            if (jS2 != 0) {
                                int i12 = (int) jS2;
                                kVar.a(i12, false);
                                mVar.f1958b += i12;
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0bb6, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0bb7, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0f43, code lost:
    
        if (r5 == false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0f45, code lost:
    
        r2 = r1.getPosition();
        r0 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0f4d, code lost:
    
        if (r0.B == false) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0f4f, code lost:
    
        r0.D = r2;
        r44.f1169a = r0.C;
        r0.B = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0f5b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0f62, code lost:
    
        if (r0.f10573y == false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0f64, code lost:
    
        r6 = r0.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0f6a, code lost:
    
        if (r6 == (-1)) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0f6c, code lost:
    
        r44.f1169a = r6;
        r0.D = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0f70, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0f71, code lost:
    
        r0 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0f8d, code lost:
    
        if (r5 != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0f8f, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x0f90, code lost:
    
        r1 = r0.f10548c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0f96, code lost:
    
        if (r3 >= r1.size()) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0f98, code lost:
    
        r1 = (j6.c) r1.valueAt(r3);
        r1.Z.getClass();
        r2 = r1.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0fa5, code lost:
    
        if (r2 == null) goto L929;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0fa7, code lost:
    
        r2.a(r1.Z, r1.f10522k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x0fae, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x0fb1, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0fb4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0f77, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
    
        throw m4.p0.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d1  */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v68 */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r43, b0.a r44) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 4840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.d.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(q qVar) {
        if (this.f10552e) {
            qVar = new d0(qVar, this.f10554f);
        }
        this.f10553e0 = qVar;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        this.E = -9223372036854775807L;
        this.J = 0;
        b bVar = this.f10544a;
        bVar.f10508e = 0;
        bVar.f10505b.clear();
        e eVar = bVar.f10506c;
        eVar.f10577b = 0;
        eVar.f10578c = 0;
        e eVar2 = this.f10546b;
        eVar2.f10577b = 0;
        eVar2.f10578c = 0;
        m();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f10548c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            i0 i0Var = ((c) sparseArray.valueAt(i10)).V;
            if (i0Var != null) {
                i0Var.f18828b = false;
                i0Var.f18829c = 0;
            }
            i10++;
        }
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = ya.i0.f25998b;
        return a1.f25946e;
    }

    public final void l(o oVar, int i10) {
        s sVar = this.f10557i;
        if (sVar.f16613c >= i10) {
            return;
        }
        byte[] bArr = sVar.f16611a;
        if (bArr.length < i10) {
            sVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = sVar.f16611a;
        int i11 = sVar.f16613c;
        oVar.readFully(bArr2, i11, i10 - i11);
        sVar.F(i10);
    }

    public final void m() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f10545a0 = false;
        this.f10547b0 = 0;
        this.f10549c0 = (byte) 0;
        this.f10551d0 = false;
        this.f10560l.D(0);
    }

    public final long n(long j10) throws p0 {
        long j11 = this.f10568t;
        if (j11 == -9223372036854775807L) {
            throw p0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i10 = c0.f16548a;
        return c0.V(j10, j11, 1000L, RoundingMode.DOWN);
    }

    public final int o(o oVar, c cVar, int i10, boolean z10) throws p0 {
        int iD;
        int iD2;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f10514c)) {
            p(oVar, f10538f0, i10);
            int i12 = this.W;
            m();
            return i12;
        }
        if ("S_TEXT/ASS".equals(cVar.f10514c)) {
            p(oVar, f10540h0, i10);
            int i13 = this.W;
            m();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f10514c)) {
            p(oVar, f10541i0, i10);
            int i14 = this.W;
            m();
            return i14;
        }
        r5.h0 h0Var = cVar.Z;
        boolean z11 = this.Y;
        s sVar = this.f10560l;
        if (!z11) {
            boolean z12 = cVar.f10520i;
            s sVar2 = this.f10557i;
            if (z12) {
                this.R &= -1073741825;
                if (!this.Z) {
                    oVar.readFully(sVar2.f16611a, 0, 1);
                    this.V++;
                    byte b10 = sVar2.f16611a[0];
                    if ((b10 & 128) == 128) {
                        throw p0.a(null, "Extension bit is set in signal byte");
                    }
                    this.f10549c0 = b10;
                    this.Z = true;
                }
                byte b11 = this.f10549c0;
                if ((b11 & 1) == 1) {
                    boolean z13 = (b11 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.f10551d0) {
                        s sVar3 = this.f10562n;
                        oVar.readFully(sVar3.f16611a, 0, 8);
                        this.V += 8;
                        this.f10551d0 = true;
                        sVar2.f16611a[0] = (byte) ((z13 ? 128 : 0) | 8);
                        sVar2.G(0);
                        h0Var.f(sVar2, 1, 1);
                        this.W++;
                        sVar3.G(0);
                        h0Var.f(sVar3, 8, 1);
                        this.W += 8;
                    }
                    if (z13) {
                        if (!this.f10545a0) {
                            oVar.readFully(sVar2.f16611a, 0, 1);
                            this.V++;
                            sVar2.G(0);
                            this.f10547b0 = sVar2.u();
                            this.f10545a0 = true;
                        }
                        int i15 = this.f10547b0 * 4;
                        sVar2.D(i15);
                        oVar.readFully(sVar2.f16611a, 0, i15);
                        this.V += i15;
                        short s10 = (short) ((this.f10547b0 / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f10565q;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f10565q = ByteBuffer.allocate(i16);
                        }
                        this.f10565q.position(0);
                        this.f10565q.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.f10547b0;
                            if (i17 >= i11) {
                                break;
                            }
                            int iY = sVar2.y();
                            if (i17 % 2 == 0) {
                                this.f10565q.putShort((short) (iY - i18));
                            } else {
                                this.f10565q.putInt(iY - i18);
                            }
                            i17++;
                            i18 = iY;
                        }
                        int i19 = (i10 - this.V) - i18;
                        if (i11 % 2 == 1) {
                            this.f10565q.putInt(i19);
                        } else {
                            this.f10565q.putShort((short) i19);
                            this.f10565q.putInt(0);
                        }
                        byte[] bArrArray = this.f10565q.array();
                        s sVar4 = this.f10563o;
                        sVar4.E(bArrArray, i16);
                        h0Var.f(sVar4, i16, 1);
                        this.W += i16;
                    }
                }
            } else {
                byte[] bArr = cVar.f10521j;
                if (bArr != null) {
                    sVar.E(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(cVar.f10514c) ? z10 : cVar.f10518g > 0) {
                this.R |= 268435456;
                this.f10564p.D(0);
                int i20 = (sVar.f16613c + i10) - this.V;
                sVar2.D(4);
                byte[] bArr2 = sVar2.f16611a;
                bArr2[0] = (byte) ((i20 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
                bArr2[1] = (byte) ((i20 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
                bArr2[2] = (byte) ((i20 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
                bArr2[3] = (byte) (i20 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
                h0Var.f(sVar2, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i21 = i10 + sVar.f16613c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f10514c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f10514c)) {
            if (cVar.V != null) {
                p4.c.i(sVar.f16613c == 0);
                cVar.V.c(oVar);
            }
            while (true) {
                int i22 = this.V;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int iA = sVar.a();
                if (iA > 0) {
                    iD2 = Math.min(i23, iA);
                    h0Var.e(iD2, sVar);
                } else {
                    iD2 = h0Var.d(oVar, i23, false);
                }
                this.V += iD2;
                this.W += iD2;
            }
        } else {
            s sVar5 = this.f10556h;
            byte[] bArr3 = sVar5.f16611a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = cVar.f10512a0;
            int i25 = 4 - i24;
            while (this.V < i21) {
                int i26 = this.X;
                if (i26 == 0) {
                    int iMin = Math.min(i24, sVar.a());
                    oVar.readFully(bArr3, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        sVar.e(bArr3, i25, iMin);
                    }
                    this.V += i24;
                    sVar5.G(0);
                    this.X = sVar5.y();
                    s sVar6 = this.f10555g;
                    sVar6.G(0);
                    h0Var.e(4, sVar6);
                    this.W += 4;
                } else {
                    int iA2 = sVar.a();
                    if (iA2 > 0) {
                        iD = Math.min(i26, iA2);
                        h0Var.e(iD, sVar);
                    } else {
                        iD = h0Var.d(oVar, i26, false);
                    }
                    this.V += iD;
                    this.W += iD;
                    this.X -= iD;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f10514c)) {
            s sVar7 = this.f10558j;
            sVar7.G(0);
            h0Var.e(4, sVar7);
            this.W += 4;
        }
        int i27 = this.W;
        m();
        return i27;
    }

    public final void p(o oVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        s sVar = this.f10561m;
        byte[] bArr2 = sVar.f16611a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            sVar.getClass();
            sVar.E(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        oVar.readFully(sVar.f16611a, bArr.length, i10);
        sVar.G(0);
        sVar.F(length);
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final n c() {
        return this;
    }
}
