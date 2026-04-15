package v4;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5.f f22532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f22539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f22540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22541j;

    public j(n5.f fVar, int i10, int i11, int i12, int i13, boolean z10) {
        a("bufferForPlaybackMs", i12, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i13, 0, "0");
        a("minBufferMs", i10, i12, "bufferForPlaybackMs");
        a("minBufferMs", i10, i13, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", i11, i10, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f22532a = fVar;
        this.f22533b = p4.c0.N(i10);
        this.f22534c = p4.c0.N(i11);
        this.f22535d = p4.c0.N(i12);
        this.f22536e = p4.c0.N(i13);
        this.f22537f = -1;
        this.f22538g = z10;
        this.f22539h = p4.c0.N(0);
        this.f22540i = new HashMap();
        this.f22541j = -1L;
    }

    public static void a(String str, int i10, int i11, String str2) {
        p4.c.b(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final int b() {
        Iterator it = this.f22540i.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((i) it.next()).f22521b;
        }
        return i10;
    }

    public final boolean c(d0 d0Var) {
        int i10;
        long j10 = this.f22534c;
        i iVar = (i) this.f22540i.get(d0Var.f22447a);
        iVar.getClass();
        n5.f fVar = this.f22532a;
        synchronized (fVar) {
            i10 = fVar.f15330d * fVar.f15328b;
        }
        boolean z10 = true;
        boolean z11 = i10 >= b();
        long jMin = this.f22533b;
        float f10 = d0Var.f22449c;
        if (f10 > 1.0f) {
            jMin = Math.min(p4.c0.y(f10, jMin), j10);
        }
        long jMax = Math.max(jMin, 500000L);
        long j11 = d0Var.f22448b;
        if (j11 < jMax) {
            if (!this.f22538g && z11) {
                z10 = false;
            }
            iVar.f22520a = z10;
            if (!z10 && j11 < 500000) {
                p4.c.B("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || z11) {
            iVar.f22520a = false;
        }
        return iVar.f22520a;
    }

    public final void d() {
        if (!this.f22540i.isEmpty()) {
            this.f22532a.a(b());
            return;
        }
        n5.f fVar = this.f22532a;
        synchronized (fVar) {
            if (fVar.f15327a) {
                fVar.a(0);
            }
        }
    }
}
