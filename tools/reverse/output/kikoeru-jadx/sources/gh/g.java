package gh;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.o1;
import b5.b0;
import ce.j0;
import cg.d0;
import cg.e0;
import cg.k0;
import cg.m0;
import cg.o0;
import cg.v;
import cg.x;
import cg.y;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.a0;
import g2.n1;
import j2.h0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import l0.q1;
import l0.r1;
import ld.p;
import m0.b1;
import m0.b4;
import m0.c1;
import m0.d9;
import m0.e9;
import m0.h1;
import m0.l5;
import m0.m5;
import m0.y5;
import m0.z5;
import q.l0;
import q.t0;
import q1.q;
import se.f0;
import se.n0;
import se.p0;
import se.t;
import se.x0;
import t2.c0;
import w1.g0;
import x0.a1;
import x0.j1;
import x0.m1;
import x0.n2;
import x0.o2;
import x0.p1;
import x0.r0;
import x0.w0;
import x0.y1;
import x0.z;
import y.s;
import yc.e1;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w1.f f7560a;

    public static int A(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (-2147483647 <= i13 && i13 < i11) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int B(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.g.B(java.lang.String):int");
    }

    public static int C(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final boolean D(String str) {
        jc.l.e(str, "method");
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean E(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    public static final int F(int[] iArr, long j10) {
        int i10 = (int) (j10 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            iMax = Math.max(iMax, iArr[i11]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x038d, code lost:
    
        r12 = A(r3);
        r13 = z(r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0395, code lost:
    
        if (r12 == r13) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0397, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x039d, code lost:
    
        if (r3[r12] != r3[r13]) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039f, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a1, code lost:
    
        r27 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a4, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a6, code lost:
    
        r2 = r42[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a9, code lost:
    
        if (r2 != (-1)) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ab, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ac, code lost:
    
        r2 = r5.o(r2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03b0, code lost:
    
        if (r2 >= 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b2, code lost:
    
        r14 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03b4, code lost:
    
        if (r27 != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03ba, code lost:
    
        if (H(r14, r54, r3, r12) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03c0, code lost:
    
        if (r58 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03c2, code lost:
    
        r5.I();
        r1 = r14.length;
        r2 = new int[r1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03c9, code lost:
    
        if (r4 >= r1) goto L701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03cb, code lost:
    
        r2[r4] = -1;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03d2, code lost:
    
        r1 = r3.length;
        r4 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03d6, code lost:
    
        if (r5 >= r1) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03d8, code lost:
    
        r4[r5] = r3[r12];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03e6, code lost:
    
        return G(r54, r41, r2, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03e7, code lost:
    
        r43 = r8;
        r8 = r41;
        r44 = r6;
        r46 = r7;
        r41 = r9;
        r2 = r27;
        r7 = r39;
        r9 = r45;
        r39 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03fa, code lost:
    
        r14 = r42;
        r42 = r41;
        r41 = r9;
        r9 = r45;
        r12 = r54.b(r9, r2, r12);
        r46 = r7;
        r43 = r8;
        r8 = (int) (r12 & 4294967295L);
        r44 = r6;
        r7 = (int) (r12 >> 32);
        r6 = r8 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0417, code lost:
    
        if (r6 == 1) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0419, code lost:
    
        r7 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x041b, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x041d, code lost:
    
        r5.K(r2, r7);
        r7 = r39;
        r39 = r1;
        r1 = r7.l(r2, r12);
        r12 = F(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x042d, code lost:
    
        if (r6 == 1) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x042f, code lost:
    
        r6 = r5.r(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0434, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0436, code lost:
    
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0438, code lost:
    
        if (r13 >= r8) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x043a, code lost:
    
        r45 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x043e, code lost:
    
        if (r3[r13] == r12) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0440, code lost:
    
        r27 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0442, code lost:
    
        r37[r13].addFirst(r1);
        r14[r13] = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0449, code lost:
    
        if (r6 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044b, code lost:
    
        r47 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x044e, code lost:
    
        r47 = r6[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0452, code lost:
    
        r3[r13] = (r1.f3148n + r12) + r47;
        r13 = r13 + 1;
        r2 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        r1 = z(r2);
        r6 = r2[r1];
        r9 = r3.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        if (r15 >= r9) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        r27 = r9;
        r38 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x079c, code lost:
    
        r10 = (c0.r) r11.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        if (r2[r15] == r2[r1]) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        r9 = r3[r38];
        r15 = r3[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
    
        if (r9 >= r15) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
    
        r3[r38] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        r15 = r38 + 1;
        r9 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0102, code lost:
    
        r6 = r5.o(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        if (r6 >= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0111, code lost:
    
        r27 = r10;
        r9 = r54.b(r8, r6, r1);
        r1 = r7;
        r39 = r8;
        r8 = (int) (r9 & 4294967295L);
        r7 = r14;
        r15 = (int) (r9 >> 32);
        r14 = r8 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
    
        if (r14 == 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0128, code lost:
    
        r1 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012b, code lost:
    
        r5.K(r6, r1);
        r1 = r13.l(r6, r9);
        r9 = F(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r14 == 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
    
        r24 = r5.r(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r10 = r56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
    
        if (r15 >= r8) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
    
        r2[r15] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0143, code lost:
    
        if (r24 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0146, code lost:
    
        r38 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        r14 = r24[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        r6 = (r1.f3148n + r9) + r14;
        r3[r15] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0153, code lost:
    
        if ((r6 + r11) > 0) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0155, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
    
        r15 = r15 + 1;
        r6 = r38;
     */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0860 A[LOOP:31: B:381:0x07c2->B:422:0x0860, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0870 A[EDGE_INSN: B:675:0x0870->B:424:0x0870 BREAK  A[LOOP:31: B:381:0x07c2->B:422:0x0860], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final c0.o G(c0.k r54, int r55, int[] r56, int[] r57, boolean r58) {
        /*
            Method dump skipped, instruction units count: 3177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.g.G(c0.k, int, int[], int[], boolean):c0.o");
    }

    public static final boolean H(int[] iArr, c0.k kVar, int[] iArr2, int i10) {
        ah.j jVar = kVar.f3097r;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (jVar.o(iArr[i11], i11) == -1 && iArr2[i11] != iArr2[i10]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (jVar.o(iArr[i12], i12) != -1 && iArr2[i12] >= iArr2[i10]) {
                return true;
            }
        }
        int iU = jVar.u(0);
        return (iU == 0 || iU == -1 || iU == -2) ? false : true;
    }

    public static final long I(float f10, long j10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : q.b(q.d(j10) * f10, j10);
    }

    public static final void J(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }

    public static final boolean K(String str) {
        jc.l.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static d4.b L(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j10;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j10 = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j10 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j10 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i13 = 0; i13 < j11; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j12 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j12 + j10));
                    d4.b bVar = new d4.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f5473d = byteBufferDuplicate;
                    bVar.f5470a = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f5471b = i15;
                    bVar.f5472c = ((ByteBuffer) bVar.f5473d).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final long N(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final ld.o Q(e1 e1Var) {
        jc.l.e(e1Var, "<this>");
        ld.o oVar = (ld.o) p.f12241d.get(e1Var);
        return oVar == null ? yc.o.f(e1Var) : oVar;
    }

    public static final long R(long j10) {
        return (((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32);
    }

    public static String S(long j10) {
        int i10 = (int) (j10 / ((long) 1000));
        int i11 = i10 / 60;
        int i12 = i10 % 60;
        return (i11 >= 10 ? Integer.valueOf(i11) : t0.B(i11, "0")) + ":" + (i12 >= 10 ? Integer.valueOf(i12) : t0.B(i12, "0"));
    }

    public static de.i T(ic.k kVar) {
        jc.l.e(kVar, "changeOptions");
        de.m mVar = new de.m();
        kVar.a(mVar);
        mVar.f5931a = true;
        return new de.i(mVar);
    }

    public static p0 U(p0 p0Var) {
        if (!(p0Var instanceof t)) {
            return new fe.d(p0Var, 0);
        }
        t tVar = (t) p0Var;
        q0[] q0VarArr = tVar.f19987b;
        ArrayList<ub.k> arrayListP0 = vb.l.P0(tVar.f19988c, q0VarArr);
        ArrayList arrayList = new ArrayList(vb.n.K(arrayListP0, 10));
        for (ub.k kVar : arrayListP0) {
            arrayList.add(p((n0) kVar.f21543a, (q0) kVar.f21544b));
        }
        return new t(q0VarArr, (n0[]) arrayList.toArray(new n0[0]), true);
    }

    public static final void a(o0 o0Var, x0.o oVar, int i10) {
        int i11;
        w1.f fVarB;
        jc.l.e(o0Var, "<this>");
        w0 w0Var = o0Var.f4091b;
        oVar.Y(-1336445072);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = 0;
        if ((i11 & 11) == 2 && oVar.z()) {
            oVar.Q();
        } else {
            boolean zBooleanValue = ((Boolean) w0Var.getValue()).booleanValue();
            oVar.X(-562731644);
            boolean zG = oVar.g(zBooleanValue);
            Object objK = oVar.K();
            int i13 = 1;
            if (zG || objK == x0.k.f24334a) {
                int iOrdinal = ((x) o0Var.f4092c.getValue()).ordinal();
                if (iOrdinal == 0) {
                    fVarB = n7.d.f15446h;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Filled.LightMode", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = g0.f23208a;
                        q1.n0 n0Var = new q1.n0(q.f17569b);
                        hd.q0 q0VarH = h0.h(12.0f, 7.0f);
                        q0VarH.n(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
                        q0VarH.w(2.24f, 5.0f, 5.0f, 5.0f);
                        q0VarH.w(5.0f, -2.24f, 5.0f, -5.0f);
                        q0VarH.v(14.76f, 7.0f, 12.0f, 7.0f);
                        q0VarH.s(12.0f, 7.0f);
                        q0VarH.l();
                        q0VarH.u(2.0f, 13.0f);
                        q0VarH.t(2.0f, 0.0f);
                        q0VarH.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        q0VarH.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        q0VarH.t(-2.0f, 0.0f);
                        q0VarH.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        q0VarH.v(1.45f, 13.0f, 2.0f, 13.0f);
                        q0VarH.l();
                        q0VarH.u(20.0f, 13.0f);
                        q0VarH.t(2.0f, 0.0f);
                        q0VarH.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        q0VarH.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        q0VarH.t(-2.0f, 0.0f);
                        q0VarH.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        q0VarH.v(19.45f, 13.0f, 20.0f, 13.0f);
                        q0VarH.l();
                        q0VarH.u(11.0f, 2.0f);
                        q0VarH.z(2.0f);
                        q0VarH.n(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        q0VarH.w(1.0f, -0.45f, 1.0f, -1.0f);
                        q0VarH.y(2.0f);
                        q0VarH.n(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        q0VarH.v(11.0f, 1.45f, 11.0f, 2.0f);
                        q0VarH.l();
                        q0VarH.u(11.0f, 20.0f);
                        q0VarH.z(2.0f);
                        q0VarH.n(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        q0VarH.w(1.0f, -0.45f, 1.0f, -1.0f);
                        q0VarH.z(-2.0f);
                        q0VarH.n(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        q0VarH.m(11.45f, 19.0f, 11.0f, 19.45f, 11.0f, 20.0f);
                        q0VarH.l();
                        q0VarH.u(5.99f, 4.58f);
                        q0VarH.n(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
                        q0VarH.n(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
                        q0VarH.t(1.06f, 1.06f);
                        q0VarH.n(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0.0f);
                        q0VarH.w(0.39f, -1.03f, 0.0f, -1.41f);
                        q0VarH.s(5.99f, 4.58f);
                        q0VarH.l();
                        q0VarH.u(18.36f, 16.95f);
                        q0VarH.n(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
                        q0VarH.n(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
                        q0VarH.t(1.06f, 1.06f);
                        q0VarH.n(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0.0f);
                        q0VarH.n(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
                        q0VarH.s(18.36f, 16.95f);
                        q0VarH.l();
                        q0VarH.u(19.42f, 5.99f);
                        q0VarH.n(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
                        q0VarH.n(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
                        q0VarH.t(-1.06f, 1.06f);
                        q0VarH.n(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
                        q0VarH.w(1.03f, 0.39f, 1.41f, 0.0f);
                        q0VarH.s(19.42f, 5.99f);
                        q0VarH.l();
                        q0VarH.u(7.05f, 18.36f);
                        q0VarH.n(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
                        q0VarH.n(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
                        q0VarH.t(-1.06f, 1.06f);
                        q0VarH.n(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
                        q0VarH.w(1.03f, 0.39f, 1.41f, 0.0f);
                        q0VarH.s(7.05f, 18.36f);
                        q0VarH.l();
                        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
                        fVarB = eVar.b();
                        n7.d.f15446h = fVarB;
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new j0();
                    }
                    fVarB = n7.e.f15471m;
                    if (fVarB == null) {
                        w1.e eVar2 = new w1.e("Filled.VolumeUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i15 = g0.f23208a;
                        q1.n0 n0Var2 = new q1.n0(q.f17569b);
                        hd.q0 q0Var = new hd.q0((byte) 0, 6);
                        q0Var.u(3.0f, 9.0f);
                        q0Var.z(6.0f);
                        q0Var.r(4.0f);
                        q0Var.t(5.0f, 5.0f);
                        q0Var.s(12.0f, 4.0f);
                        q0Var.s(7.0f, 9.0f);
                        q0Var.s(3.0f, 9.0f);
                        q0Var.l();
                        q0Var.u(16.5f, 12.0f);
                        q0Var.n(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
                        q0Var.z(8.05f);
                        q0Var.n(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
                        q0Var.l();
                        q0Var.u(14.0f, 3.23f);
                        q0Var.z(2.06f);
                        q0Var.n(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
                        q0Var.w(-2.11f, 5.85f, -5.0f, 6.71f);
                        q0Var.z(2.06f);
                        q0Var.n(4.01f, -0.91f, 7.0f, -4.49f, 7.0f, -8.77f);
                        q0Var.w(-2.99f, -7.86f, -7.0f, -8.77f);
                        q0Var.l();
                        w1.e.a(eVar2, q0Var.f8447b, 0, n0Var2);
                        fVarB = eVar2.b();
                        n7.e.f15471m = fVarB;
                    }
                }
                objK = fVarB;
                oVar.h0(objK);
            }
            oVar.p(false);
            androidx.compose.animation.b.b(((Boolean) w0Var.getValue()).booleanValue(), o0Var.a(j1.n.f9689a, j1.c.f9666e), l0.b(null, 3), l0.c(null, 3), null, f1.g.b(oVar, 1649419848, new d0(i13, (w1.f) objK, o0Var)), oVar, 200064);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.j0(o0Var, i10, i12);
        }
    }

    public static final void b(v vVar, j1.q qVar, f1.f fVar, x0.o oVar, int i10) {
        jc.l.e(vVar, "vm");
        oVar.Y(-1946972408);
        Object objJ = oVar.j(AndroidCompositionLocals_androidKt.f721b);
        jc.l.c(objJ, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) objJ;
        oVar.X(-856539346);
        Object objK = oVar.K();
        r0 r0Var = x0.k.f24334a;
        if (objK == r0Var) {
            objK = x0.v.v(new f3.l(0L));
            oVar.h0(objK);
        }
        w0 w0Var = (w0) objK;
        oVar.p(false);
        oVar.X(-856539273);
        Object objK2 = oVar.K();
        if (objK2 == r0Var) {
            objK2 = x0.v.v(Boolean.FALSE);
            oVar.h0(objK2);
        }
        w0 w0Var2 = (w0) objK2;
        oVar.p(false);
        oVar.X(-856539202);
        Object objK3 = oVar.K();
        if (objK3 == r0Var) {
            objK3 = x0.v.v(x.f4137b);
            oVar.h0(objK3);
        }
        w0 w0Var3 = (w0) objK3;
        oVar.p(false);
        oVar.X(-856539106);
        Object objK4 = oVar.K();
        if (objK4 == r0Var) {
            objK4 = x0.v.v(0);
            oVar.h0(objK4);
        }
        w0 w0Var4 = (w0) objK4;
        oVar.p(false);
        oVar.X(-856539051);
        Object objK5 = oVar.K();
        if (objK5 == r0Var) {
            objK5 = x0.v.o(new y(vVar, 7));
            oVar.h0(objK5);
        }
        n2 n2Var = (n2) objK5;
        oVar.p(false);
        j1.q qVarE = androidx.compose.foundation.layout.c.f557c.e(qVar);
        oVar.X(-856538792);
        Object objK6 = oVar.K();
        if (objK6 == r0Var) {
            objK6 = new cg.c(w0Var, 2);
            oVar.h0(objK6);
        }
        oVar.p(false);
        yb.c cVar = null;
        j1.q qVarP = android.support.v4.media.session.b.P(android.support.v4.media.session.b.P(android.support.v4.media.session.b.P(androidx.compose.ui.layout.a.e(qVarE, (ic.k) objK6), "单机双击", true, new k0(vVar, w0Var, cVar, 0)), "长按倍速", true, new cg.q(vVar, cVar, 2)), "横向滑动", ((Boolean) n2Var.getValue()).booleanValue(), new k0(vVar, w0Var, cVar, 1));
        boolean zBooleanValue = ((Boolean) n2Var.getValue()).booleanValue();
        o1 o1Var = new o1(4, w0Var4, activity);
        jc.l.e(qVarP, "<this>");
        jc.l.e(w0Var2, "showUi");
        jc.l.e(w0Var3, "type");
        if (zBooleanValue) {
            int i11 = 0;
            qVarP = j1.a.a(qVarP, new cg.h(new cg.b(w0Var3, w0Var2, o1Var, 0), new cg.c(w0Var2, 0), new cg.d(i11, o1Var), i11));
        }
        oVar.X(733328855);
        s sVarE = y.p.e(j1.c.f9662a, oVar, 0);
        oVar.X(-1323940314);
        int iQ = x0.v.q(oVar);
        j1 j1VarL = oVar.l();
        i2.k.f8771g0.getClass();
        i2.i iVar = i2.j.f8733b;
        f1.f fVarK = n1.k(qVarP);
        oVar.a0();
        if (oVar.S) {
            oVar.k(iVar);
        } else {
            oVar.k0();
        }
        x0.v.A(i2.j.f8738g, sVarE, oVar);
        x0.v.A(i2.j.f8737f, j1VarL, oVar);
        i2.h hVar = i2.j.f8741j;
        if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
            h0.s(iQ, oVar, iQ, hVar);
        }
        fVarK.g(new y1(oVar), oVar, 0);
        oVar.X(2058660585);
        oVar.X(-1218818911);
        boolean zF = oVar.f(vVar);
        Object objK7 = oVar.K();
        if (zF || objK7 == r0Var) {
            objK7 = new o0(vVar, w0Var2, w0Var3, w0Var4);
            oVar.h0(objK7);
        }
        oVar.p(false);
        fVar.l((o0) objK7, vVar, oVar, Integer.valueOf(((i10 >> 9) & 896) | 64));
        oVar.p(false);
        oVar.p(true);
        oVar.p(false);
        oVar.p(false);
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l0(vVar, qVar, fVar, i10, 0);
        }
    }

    public static final long c(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final void d(o0 o0Var, String str, x0.o oVar, int i10) {
        int i11;
        x0.o oVar2;
        jc.l.e(o0Var, "<this>");
        oVar.Y(-1717446644);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= oVar.f(str) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && oVar.z()) {
            oVar.Q();
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            androidx.compose.animation.b.b(((Boolean) o0Var.f4090a.f4125n.getValue()).booleanValue(), o0Var.a(j1.n.f9689a, j1.c.f9663b), l0.b(null, 3), l0.c(null, 3), null, f1.g.b(oVar, 1411684916, new m0(0, str)), oVar2, 200064);
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0.l0(o0Var, str, i10, 3);
        }
    }

    public static final void e(b1 b1Var, d9 d9Var, y5 y5Var, x0.o oVar, int i10) {
        char c3;
        char c10;
        char c11;
        Object obj = a9.b.f210a;
        oVar.Y(53836214);
        int i11 = (i10 & 6) == 0 ? (oVar.f(b1Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(d9Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(y5Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(obj) ? 2048 : 1024;
        }
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            Object objK = oVar.K();
            Object obj2 = x0.k.f24334a;
            if (objK == obj2) {
                c3 = 4;
                c10 = 1;
                c11 = 2;
                Object b1Var2 = new b1(b1Var.f(), b1Var.g(), b1Var.h(), ((q) b1Var.f12708d.getValue()).f17577a, b1Var.a(), b1Var.i(), b1Var.b(), b1Var.d(), ((q) b1Var.f12713i.getValue()).f17577a, b1Var.c(), b1Var.e(), ((q) b1Var.f12716l.getValue()).f17577a, b1Var.j());
                oVar.h0(b1Var2);
                objK = b1Var2;
            } else {
                c3 = 4;
                c10 = 1;
                c11 = 2;
            }
            b1 b1Var3 = (b1) objK;
            o2 o2Var = c1.f12773a;
            b1Var3.f12705a.setValue(new q(b1Var.f()));
            b1Var3.f12706b.setValue(new q(b1Var.g()));
            b1Var3.f12707c.setValue(new q(b1Var.h()));
            b1Var3.f12708d.setValue(new q(((q) b1Var.f12708d.getValue()).f17577a));
            b1Var3.f12709e.setValue(new q(b1Var.a()));
            b1Var3.f12710f.setValue(new q(b1Var.i()));
            b1Var3.f12711g.setValue(new q(b1Var.b()));
            b1Var3.f12712h.setValue(new q(b1Var.d()));
            b1Var3.f12713i.setValue(new q(((q) b1Var.f12713i.getValue()).f17577a));
            b1Var3.f12714j.setValue(new q(b1Var.c()));
            b1Var3.f12715k.setValue(new q(b1Var.e()));
            b1Var3.f12716l.setValue(new q(((q) b1Var.f12716l.getValue()).f17577a));
            b1Var3.f12717m.setValue(Boolean.valueOf(b1Var.j()));
            m5 m5VarA = l5.a(0.0f, 7, 0L, false);
            long jF = b1Var3.f();
            long jA = b1Var3.a();
            oVar.W(-2060761573);
            long jA2 = c1.a(b1Var3, jA);
            long j10 = jA2 != 16 ? jA2 : ((q) oVar.j(m0.j1.f13125a)).f17577a;
            oVar.p(false);
            long j11 = ((q) oVar.j(m0.j1.f13125a)).f17577a;
            long jB = q.b((!((b1) oVar.j(c1.f12773a)).j() ? ((double) q1.h0.r(j11)) < 0.5d : ((double) q1.h0.r(j11)) > 0.5d) ? 0.6f : 0.74f, j10);
            boolean zE = oVar.e(jF) | oVar.e(jA) | oVar.e(jB);
            Object objK2 = oVar.K();
            float f10 = 1.0f;
            if (zE || objK2 == obj2) {
                long jF2 = b1Var3.f();
                float fM = g8.a.m(jF, 0.4f, jB, jA);
                float fM2 = g8.a.m(jF, 0.2f, jB, jA);
                float f11 = 0.4f;
                if (fM < 4.5f) {
                    float f12 = 0.2f;
                    if (fM2 >= 4.5f) {
                        float f13 = 0.4f;
                        for (int i12 = 0; i12 < 7; i12++) {
                            float fM3 = (g8.a.m(jF, f11, jB, jA) / 4.5f) - 1.0f;
                            if (0.0f <= fM3 && fM3 <= 0.01f) {
                                break;
                            }
                            if (fM3 < 0.0f) {
                                f13 = f11;
                            } else {
                                f12 = f11;
                            }
                            f11 = (f13 + f12) / 2.0f;
                        }
                    } else {
                        f11 = 0.2f;
                    }
                }
                objK2 = new q1(jF2, q.b(f11, jF));
                oVar.h0(objK2);
            }
            q1 q1Var = (q1) objK2;
            m1 m1Var = c1.f12773a;
            x0.n1 n1VarA = m1Var.a(b1Var3);
            z zVar = h1.f13043a;
            long j12 = ((q) oVar.j(m0.j1.f13125a)).f17577a;
            if (!((b1) oVar.j(m1Var)).j() ? q1.h0.r(j12) >= 0.5d : q1.h0.r(j12) <= 0.5d) {
                f10 = 0.87f;
            }
            x0.n1 n1VarA2 = zVar.a(Float.valueOf(f10));
            x0.n1 n1VarA3 = androidx.compose.foundation.f.f507a.a(m5VarA);
            x0.n1 n1VarA4 = z5.f13997a.a(y5Var);
            x0.n1 n1VarA5 = r1.f11608a.a(q1Var);
            x0.n1 n1VarA6 = e9.f12960b.a(d9Var);
            x0.n1[] n1VarArr = new x0.n1[6];
            n1VarArr[0] = n1VarA;
            n1VarArr[c10] = n1VarA2;
            n1VarArr[c11] = n1VarA3;
            n1VarArr[3] = n1VarA4;
            n1VarArr[c3] = n1VarA5;
            n1VarArr[5] = n1VarA6;
            x0.v.b(n1VarArr, f1.g.f(496803446, new b4(0, d9Var), oVar), oVar, 56);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(i10, 6, b1Var, d9Var, y5Var);
        }
    }

    public static final void f(v vVar, j1.q qVar, x0.o oVar, int i10) {
        jc.l.e(vVar, "vm");
        oVar.Y(-927868879);
        b(vVar, qVar, f1.g.b(oVar, 489949074, new cg.n0(4)), oVar, (i10 & 112) | 196616 | (i10 & 896));
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new e0(vVar, qVar, i10, 2);
        }
    }

    public static final void g(o0 o0Var, x0.o oVar, int i10) {
        int i11;
        x0.o oVar2;
        jc.l.e(o0Var, "<this>");
        oVar.Y(1802996651);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && oVar.z()) {
            oVar.Q();
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            androidx.compose.animation.b.b(o0Var.f4090a.w() == cg.o.f4087c, o0Var.a(j1.n.f9689a, j1.c.f9666e), l0.b(null, 3), l0.c(null, 3), null, f1.g.b(oVar, 284647379, new m0(1, o0Var)), oVar2, 200064);
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.j0(o0Var, i10, 1);
        }
    }

    public static void h(long j10, lh.f fVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        ArrayList arrayList3;
        long j11;
        int i15;
        int i16 = i10;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i11 >= i12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i17 = i11; i17 < i12; i17++) {
            if (((lh.i) arrayList4.get(i17)).d() < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        lh.i iVar = (lh.i) arrayList.get(i11);
        lh.i iVar2 = (lh.i) arrayList4.get(i12 - 1);
        if (i16 == iVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i11)).intValue();
            int i18 = i11 + 1;
            lh.i iVar3 = (lh.i) arrayList4.get(i18);
            i13 = i18;
            i14 = iIntValue;
            iVar = iVar3;
        } else {
            i13 = i11;
            i14 = -1;
        }
        if (iVar.i(i16) == iVar2.i(i16)) {
            int iMin = Math.min(iVar.d(), iVar2.d());
            int i19 = 0;
            for (int i20 = i16; i20 < iMin && iVar.i(i20) == iVar2.i(i20); i20++) {
                i19++;
            }
            long j12 = 4;
            long j13 = (fVar.f12571b / j12) + j10 + ((long) 2) + ((long) i19) + 1;
            fVar.h0(-i19);
            fVar.h0(i14);
            int i21 = i16 + i19;
            while (i16 < i21) {
                fVar.h0(iVar.i(i16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i21 != ((lh.i) arrayList4.get(i13)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.h0(((Number) arrayList5.get(i13)).intValue());
                return;
            } else {
                lh.f fVar2 = new lh.f();
                fVar.h0(((int) ((fVar2.f12571b / j12) + j13)) * (-1));
                h(j13, fVar2, i21, arrayList4, i13, i12, arrayList5);
                fVar.c0(fVar2);
                return;
            }
        }
        int i22 = 1;
        for (int i23 = i13 + 1; i23 < i12; i23++) {
            if (((lh.i) arrayList4.get(i23 - 1)).i(i16) != ((lh.i) arrayList4.get(i23)).i(i16)) {
                i22++;
            }
        }
        long j14 = 4;
        long j15 = (fVar.f12571b / j14) + j10 + ((long) 2) + ((long) (i22 * 2));
        fVar.h0(i22);
        fVar.h0(i14);
        for (int i24 = i13; i24 < i12; i24++) {
            int i25 = ((lh.i) arrayList4.get(i24)).i(i16);
            if (i24 == i13 || i25 != ((lh.i) arrayList4.get(i24 - 1)).i(i16)) {
                fVar.h0(i25 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
            }
        }
        lh.f fVar3 = new lh.f();
        int i26 = i13;
        while (i26 < i12) {
            byte bI = ((lh.i) arrayList4.get(i26)).i(i16);
            int i27 = i26 + 1;
            int i28 = i27;
            while (true) {
                if (i28 >= i12) {
                    i28 = i12;
                    break;
                } else if (bI != ((lh.i) arrayList4.get(i28)).i(i16)) {
                    break;
                } else {
                    i28++;
                }
            }
            if (i27 == i28 && i16 + 1 == ((lh.i) arrayList4.get(i26)).d()) {
                fVar.h0(((Number) arrayList5.get(i26)).intValue());
                arrayList3 = arrayList5;
                j11 = j15;
                i15 = i28;
            } else {
                fVar.h0(((int) ((fVar3.f12571b / j14) + j15)) * (-1));
                arrayList3 = arrayList5;
                j11 = j15;
                i15 = i28;
                h(j11, fVar3, i16 + 1, arrayList, i26, i15, arrayList3);
                arrayList4 = arrayList;
            }
            j15 = j11;
            i26 = i15;
            arrayList5 = arrayList3;
        }
        fVar.c0(fVar3);
    }

    public static void j(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbO = h0.o(i10, "radix ", " was not in valid range ");
            sbO.append(new oc.d(2, 36, 1));
            throw new IllegalArgumentException(sbO.toString());
        }
    }

    public static final j1.q k(j1.q qVar, q1.l0 l0Var) {
        return androidx.compose.ui.graphics.a.c(qVar, 0.0f, 0.0f, l0Var, 518143);
    }

    public static final j1.q l(j1.q qVar) {
        return androidx.compose.ui.graphics.a.c(qVar, 0.0f, 0.0f, null, 520191);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(z7.c cVar, Throwable th2) {
        if (cVar != 0) {
            if (th2 != null) {
                try {
                    a0.c.P(cVar);
                    return;
                } catch (Throwable th3) {
                    ub.a.a(th2, th3);
                    return;
                }
            }
            if (cVar instanceof AutoCloseable) {
                cVar.close();
                return;
            }
            if (cVar instanceof ExecutorService) {
                p4.z.q((ExecutorService) cVar);
                return;
            }
            if (cVar instanceof TypedArray) {
                ((TypedArray) cVar).recycle();
                return;
            }
            if (cVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cVar).release();
                return;
            }
            if (cVar instanceof MediaDrm) {
                ((MediaDrm) cVar).release();
            } else if (cVar instanceof DrmManagerClient) {
                ((DrmManagerClient) cVar).release();
            } else {
                if (!(cVar instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) cVar).release();
            }
        }
    }

    public static m0.p1 n(x0.o oVar) {
        o2 o2Var = c1.f12773a;
        long jH = ((b1) oVar.j(o2Var)).h();
        long jB = q.b(0.6f, ((b1) oVar.j(o2Var)).e());
        long jI = ((b1) oVar.j(o2Var)).i();
        long jE = ((b1) oVar.j(o2Var)).e();
        z zVar = m0.j1.f13125a;
        long j10 = ((q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var)).j()) {
            q1.h0.r(j10);
        } else {
            q1.h0.r(j10);
        }
        long jB2 = q.b(0.38f, jE);
        long j11 = ((q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var)).j()) {
            q1.h0.r(j11);
        } else {
            q1.h0.r(j11);
        }
        long jB3 = q.b(0.38f, jH);
        boolean zE = oVar.e(jH) | oVar.e(jB) | oVar.e(jI) | oVar.e(jB2) | oVar.e(jB3);
        Object objK = oVar.K();
        if (zE || objK == x0.k.f24334a) {
            m0.p1 p1Var = new m0.p1(jI, q.b(0.0f, jI), jH, q.b(0.0f, jH), jB2, q.b(0.0f, jB2), jB3, jH, jB, jB2, jB3);
            oVar.h0(p1Var);
            objK = p1Var;
        }
        return (m0.p1) objK;
    }

    public static final double o(int i10, int i11, int i12, int i13, t8.g gVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d10, d11);
        }
        if (iOrdinal == 1) {
            return Math.min(d10, d11);
        }
        throw new j0();
    }

    public static final n0 p(n0 n0Var, q0 q0Var) {
        if (q0Var == null || n0Var.a() == x0.INVARIANT) {
            return n0Var;
        }
        if (q0Var.e0() != n0Var.a()) {
            fe.c cVar = new fe.c(n0Var);
            se.h0.f19950b.getClass();
            return new f0(new fe.a(n0Var, cVar, false, se.h0.f19951c));
        }
        if (!n0Var.c()) {
            return new f0(n0Var.b());
        }
        re.b bVar = re.l.f19010e;
        jc.l.d(bVar, "NO_LOCKS");
        return new f0(new se.y(bVar, new bd.e(5, n0Var)));
    }

    public static final a0 q(Context context) {
        jc.l.e(context, "context");
        a0 a0Var = new a0(context);
        h7.g gVar = a0Var.f6299b;
        e7.n0 n0Var = gVar.f8177s;
        n0Var.a(new f7.g(n0Var));
        e7.n0 n0Var2 = gVar.f8177s;
        n0Var2.a(new f7.i());
        n0Var2.a(new f7.q());
        return a0Var;
    }

    public static final long r(d0.f0 f0Var) {
        return lc.b.S(((a1) f0Var.f5311d.f5433d).e() * f0Var.n()) + (((long) f0Var.j()) * ((long) f0Var.n()));
    }

    public static void u(l1.c cVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        q2.p pVar;
        q2.o oVar;
        ic.k kVar;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jKeyAt = longSparseArray.keyAt(i10);
            ViewTranslationResponse viewTranslationResponseN = b0.n(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseN != null && (value = viewTranslationResponseN.getValue("android:text")) != null && (text = value.getText()) != null && (pVar = (q2.p) cVar.d().b((int) jKeyAt)) != null && (oVar = pVar.f17643a) != null) {
                Object objG = oVar.f17639d.f17630a.g(q2.j.f17614k);
                if (objG == null) {
                    objG = null;
                }
                q2.a aVar = (q2.a) objG;
                if (aVar != null && (kVar = (ic.k) aVar.f17587b) != null) {
                }
            }
        }
    }

    public static final boolean v(char c3, char c10, boolean z10) {
        if (c3 == c10) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static k0.b w(k0.b bVar, f3.m mVar, t2.l0 l0Var, f3.c cVar, x2.d dVar) {
        if (bVar != null && mVar == bVar.f10884a && c0.h(l0Var, mVar).equals(bVar.f10885b) && cVar.a() == bVar.f10886c.f6652a && dVar == bVar.f10887d) {
            return bVar;
        }
        k0.b bVar2 = k0.b.f10883h;
        if (bVar2 != null && mVar == bVar2.f10884a && c0.h(l0Var, mVar).equals(bVar2.f10885b) && cVar.a() == bVar2.f10886c.f6652a && dVar == bVar2.f10887d) {
            return bVar2;
        }
        k0.b bVar3 = new k0.b(mVar, c0.h(l0Var, mVar), new f3.d(cVar.a(), cVar.M()), dVar);
        k0.b.f10883h = bVar3;
        return bVar3;
    }

    public static final int x(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    public static int y(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static final int z(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    public abstract void O();

    public abstract void P();

    public boolean i() {
        return false;
    }

    public m4.n0 s(a6.a aVar) {
        ByteBuffer byteBuffer = aVar.f21382e;
        byteBuffer.getClass();
        p4.c.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return t(aVar, byteBuffer);
    }

    public abstract m4.n0 t(a6.a aVar, ByteBuffer byteBuffer);

    public void M() {
    }
}
