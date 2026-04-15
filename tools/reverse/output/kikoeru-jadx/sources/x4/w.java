package x4;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.beta.tinker.TinkerReport;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f24726a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f24727b = new w();

    public static AudioAttributes b(m4.d dVar, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) dVar.b().f14586a;
    }

    public static int c(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return 2250000;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return 40000;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public AudioTrack a(r5.c cVar, m4.d dVar, int i10) {
        boolean z10 = cVar.f18780d;
        int i11 = cVar.f18777a;
        int i12 = cVar.f18779c;
        int i13 = cVar.f18778b;
        int i14 = c0.f16548a;
        if (i14 < 23) {
            return new AudioTrack(b(dVar, z10), c0.r(i13, i12, i11), cVar.f18782f, 1, i10);
        }
        AudioTrack.Builder sessionId = v3.b.e().setAudioAttributes(b(dVar, z10)).setAudioFormat(c0.r(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(cVar.f18782f).setSessionId(i10);
        if (i14 >= 29) {
            sessionId.setOffloadedPlayback(cVar.f18781e);
        }
        return sessionId.build();
    }
}
