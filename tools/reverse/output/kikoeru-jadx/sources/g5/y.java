package g5;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m4.o0;
import p4.c0;
import ya.a1;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f7430a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (c0.f16548a < 26 && c0.f16549b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f7385a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new s(0, new i(3)));
        }
        if (c0.f16548a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f7385a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }

    public static String b(m4.q qVar) {
        Pair pairD;
        String str = qVar.f14544n;
        String str2 = qVar.f14544n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairD = d(qVar)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03dc A[PHI: r2
      0x03dc: PHI (r2v19 int) = (r2v18 int), (r2v23 int), (r2v24 int), (r2v25 int), (r2v26 int) binds: [B:276:0x03b0, B:279:0x03b6, B:281:0x03ba, B:283:0x03be, B:285:0x03c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03e3 A[Catch: NumberFormatException -> 0x03f1, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x03f1, blocks: (B:273:0x0394, B:275:0x03a6, B:286:0x03c4, B:297:0x03e3), top: B:429:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(m4.q r32) {
        /*
            Method dump skipped, instruction units count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.y.d(m4.q):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z10, boolean z11) {
        try {
            t tVar = new t(str, z10, z11);
            HashMap map = f7430a;
            List list = (List) map.get(tVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(tVar, new b7.m(z10, z11));
            if (z10 && arrayListF.isEmpty() && c0.f16548a <= 23) {
                arrayListF = f(tVar, new w(0));
                if (!arrayListF.isEmpty()) {
                    p4.c.B("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) arrayListF.get(0)).f7385a);
                }
            }
            a(str, arrayListF);
            i0 i0VarQ = i0.q(arrayListF);
            map.put(tVar, i0VarQ);
            return i0VarQ;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118 A[Catch: Exception -> 0x0162, TRY_ENTER, TryCatch #4 {Exception -> 0x0162, blocks: (B:3:0x000a, B:5:0x001e, B:7:0x0028, B:77:0x0137, B:10:0x0034, B:13:0x003f, B:71:0x0110, B:74:0x0118, B:76:0x011e, B:78:0x013f, B:79:0x0160), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(g5.t r20, g5.v r21) throws g5.u {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.y.f(g5.t, g5.v):java.util.ArrayList");
    }

    public static a1 g(r rVar, m4.q qVar, boolean z10, boolean z11) {
        List listA = rVar.a(qVar.f14544n, z10, z11);
        String strB = b(qVar);
        List listA2 = strB == null ? a1.f25946e : rVar.a(strB, z10, z11);
        f0 f0VarP = i0.p();
        f0VarP.c(listA);
        f0VarP.c(listA2);
        return f0VarP.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i10 = c0.f16548a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(c0.f16550c))) {
            String str3 = c0.f16549b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (c0.f16548a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (o0.k(str)) {
            return true;
        }
        String strC0 = ud.e.c0(mediaCodecInfo.getName());
        if (strC0.startsWith("arc.")) {
            return false;
        }
        if (strC0.startsWith("omx.google.") || strC0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strC0.startsWith("omx.sec.") && strC0.contains(".sw.")) || strC0.equals("omx.qcom.video.decoder.hevcswvdec") || strC0.startsWith("c2.android.") || strC0.startsWith("c2.google.")) {
            return true;
        }
        return (strC0.startsWith("omx.") || strC0.startsWith("c2.")) ? false : true;
    }
}
