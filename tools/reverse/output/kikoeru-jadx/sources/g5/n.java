package g5;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;
import m4.o0;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f7388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7395k;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f7385a = str;
        this.f7386b = str2;
        this.f7387c = str3;
        this.f7388d = codecCapabilities;
        this.f7391g = z10;
        this.f7392h = z11;
        this.f7393i = z12;
        this.f7389e = z13;
        this.f7390f = z14;
        this.f7394j = z15;
        this.f7395k = o0.o(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(c0.f(i10, widthAlignment) * widthAlignment, c0.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g5.n h(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            g5.n r0 = new g5.n
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L39
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L39
            int r3 = p4.c0.f16548a
            r4 = 22
            if (r3 > r4) goto L37
            java.lang.String r3 = p4.c0.f16551d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L37
        L26:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L39
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L37
            goto L39
        L37:
            r8 = 1
            goto L3a
        L39:
            r8 = 0
        L3a:
            if (r14 == 0) goto L42
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r14.isFeatureSupported(r3)
        L42:
            if (r18 != 0) goto L51
            if (r14 == 0) goto L4f
            java.lang.String r3 = "secure-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L4f
            goto L51
        L4f:
            r9 = 0
            goto L52
        L51:
            r9 = 1
        L52:
            int r3 = p4.c0.f16548a
            r4 = 35
            if (r3 < r4) goto L6d
            if (r14 == 0) goto L6d
            java.lang.String r3 = "detached-surface"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L6d
            r10 = 1
        L63:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            goto L6f
        L6d:
            r10 = 0
            goto L63
        L6f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):g5.n");
    }

    public final v4.g b(m4.q qVar, m4.q qVar2) {
        m4.q qVar3;
        m4.q qVar4;
        String str = qVar.f14544n;
        m4.h hVar = qVar.B;
        String str2 = qVar2.f14544n;
        m4.h hVar2 = qVar2.B;
        int i10 = c0.f16548a;
        int i11 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f7395k) {
            if (qVar.f14554x != qVar2.f14554x) {
                i11 |= 1024;
            }
            if (!this.f7389e && (qVar.f14551u != qVar2.f14551u || qVar.f14552v != qVar2.f14552v)) {
                i11 |= 512;
            }
            if ((!m4.h.e(hVar) || !m4.h.e(hVar2)) && !Objects.equals(hVar, hVar2)) {
                i11 |= 2048;
            }
            if (c0.f16551d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f7385a) && !qVar.b(qVar2)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new v4.g(this.f7385a, qVar, qVar2, qVar.b(qVar2) ? 3 : 2, 0);
            }
            qVar3 = qVar;
            qVar4 = qVar2;
        } else {
            qVar3 = qVar;
            qVar4 = qVar2;
            if (qVar3.D != qVar4.D) {
                i11 |= 4096;
            }
            if (qVar3.E != qVar4.E) {
                i11 |= 8192;
            }
            if (qVar3.F != qVar4.F) {
                i11 |= 16384;
            }
            String str3 = this.f7386b;
            if (i11 == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair pairD = y.d(qVar3);
                Pair pairD2 = y.d(qVar4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new v4.g(this.f7385a, qVar3, qVar4, 3, 0);
                    }
                }
            }
            if (!qVar3.b(qVar4)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new v4.g(this.f7385a, qVar3, qVar4, 1, 0);
            }
        }
        return new v4.g(this.f7385a, qVar3, qVar4, 0, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1 A[PHI: r2
      0x00c1: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v14 android.util.Pair) binds: [B:3:0x000f, B:5:0x0017, B:10:0x002b, B:37:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(m4.q r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.n.c(m4.q, boolean):boolean");
    }

    public final boolean d(m4.q qVar) {
        int i10;
        String str = qVar.f14544n;
        String str2 = this.f7386b;
        if ((!str2.equals(str) && !str2.equals(y.b(qVar))) || !c(qVar, true)) {
            return false;
        }
        if (this.f7395k) {
            int i11 = qVar.f14551u;
            if (i11 > 0 && (i10 = qVar.f14552v) > 0) {
                return f(i11, i10, qVar.f14553w);
            }
        } else {
            int i12 = qVar.E;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7388d;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    g("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i12)) {
                    g("sampleRate.support, " + i12);
                    return false;
                }
            }
            int i13 = qVar.D;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    g("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    g("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((c0.f16548a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    p4.c.B("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f7385a + ", [" + maxInputChannelCount + " to " + i14 + "]");
                    maxInputChannelCount = i14;
                }
                if (maxInputChannelCount < i13) {
                    g("channelCount.support, " + i13);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(m4.q qVar) {
        if (this.f7395k) {
            return this.f7389e;
        }
        Pair pairD = y.d(qVar);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(int r12, int r13, double r14) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.n.f(int, int, double):boolean");
    }

    public final void g(String str) {
        StringBuilder sbK = a0.c.K("NoSupport [", str, "] [");
        sbK.append(this.f7385a);
        sbK.append(", ");
        sbK.append(this.f7386b);
        sbK.append("] [");
        sbK.append(c0.f16552e);
        sbK.append("]");
        p4.c.l("MediaCodecInfo", sbK.toString());
    }

    public final String toString() {
        return this.f7385a;
    }
}
