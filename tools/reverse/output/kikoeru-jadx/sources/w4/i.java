package w4;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j5.d0;
import java.util.HashMap;
import m4.f1;
import m4.h1;
import m4.i1;
import m4.q;
import m4.r0;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f23374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f23375c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f23381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f23382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23383k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r0 f23386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ah.j f23387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ah.j f23388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ah.j f23389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q f23390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q f23391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q f23392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f23398z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f23377e = new h1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1 f23378f = new f1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f23380h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f23379g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23376d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23384l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23385m = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f23373a = context.getApplicationContext();
        this.f23375c = playbackSession;
        f fVar = new f();
        this.f23374b = fVar;
        fVar.f23369d = this;
    }

    public final boolean a(ah.j jVar) {
        String str;
        if (jVar == null) {
            return false;
        }
        String str2 = (String) jVar.f392d;
        f fVar = this.f23374b;
        synchronized (fVar) {
            str = fVar.f23371f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f23382j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f23398z);
            this.f23382j.setVideoFramesDropped(this.f23396x);
            this.f23382j.setVideoFramesPlayed(this.f23397y);
            Long l10 = (Long) this.f23379g.get(this.f23381i);
            this.f23382j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f23380h.get(this.f23381i);
            this.f23382j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f23382j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f23375c.reportPlaybackMetrics(this.f23382j.build());
        }
        this.f23382j = null;
        this.f23381i = null;
        this.f23398z = 0;
        this.f23396x = 0;
        this.f23397y = 0;
        this.f23390r = null;
        this.f23391s = null;
        this.f23392t = null;
        this.A = false;
    }

    public final void c(i1 i1Var, d0 d0Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.f23382j;
        if (d0Var == null || (iB = i1Var.b(d0Var.f10245a)) == -1) {
            return;
        }
        f1 f1Var = this.f23378f;
        int i10 = 0;
        i1Var.f(iB, f1Var, false);
        int i11 = f1Var.f14203c;
        h1 h1Var = this.f23377e;
        i1Var.n(i11, h1Var);
        m4.d0 d0Var2 = h1Var.f14264c.f14286b;
        if (d0Var2 != null) {
            int iG = c0.G(d0Var2.f14178a, d0Var2.f14179b);
            i10 = iG != 0 ? iG != 1 ? iG != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (h1Var.f14274m != -9223372036854775807L && !h1Var.f14272k && !h1Var.f14270i && !h1Var.a()) {
            builder.setMediaDurationMillis(c0.c0(h1Var.f14274m));
        }
        builder.setPlaybackType(h1Var.a() ? 2 : 1);
        this.A = true;
    }

    public final void d(a aVar, String str) {
        d0 d0Var = aVar.f23340d;
        if ((d0Var == null || !d0Var.b()) && str.equals(this.f23381i)) {
            b();
        }
        this.f23379g.remove(str);
        this.f23380h.remove(str);
    }

    public final void e(int i10, long j10, q qVar, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = g.n(i10).setTimeSinceCreatedMillis(j10 - this.f23376d);
        if (qVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = qVar.f14543m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = qVar.f14544n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = qVar.f14541k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = qVar.f14540j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = qVar.f14551u;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = qVar.f14552v;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = qVar.D;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = qVar.E;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = qVar.f14534d;
            if (str4 != null) {
                int i18 = c0.f16548a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = qVar.f14553w;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f23375c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
