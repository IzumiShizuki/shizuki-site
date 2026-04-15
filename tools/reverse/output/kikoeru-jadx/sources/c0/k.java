package c0;

import b0.q0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f3080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f3082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f3083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f3086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f3088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hf.y f3092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f3094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q1.v f3095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a0.v f3096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ah.j f3097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3098s;

    public k(z zVar, List list, g gVar, androidx.media3.exoplayer.offline.u uVar, long j10, boolean z10, q0 q0Var, int i10, long j11, int i11, int i12, int i13, hf.y yVar, boolean z11, o oVar, q1.v vVar) {
        this.f3080a = zVar;
        this.f3081b = list;
        this.f3082c = gVar;
        this.f3083d = uVar;
        this.f3084e = j10;
        this.f3085f = z10;
        this.f3086g = q0Var;
        this.f3087h = i10;
        this.f3088i = j11;
        this.f3089j = i11;
        this.f3090k = i12;
        this.f3091l = i13;
        this.f3092m = yVar;
        this.f3093n = z11;
        this.f3094o = oVar;
        this.f3095p = vVar;
        a0.v vVar2 = new a0.v();
        vVar2.f156e = this;
        vVar2.f152a = z10;
        vVar2.f153b = gVar;
        vVar2.f154c = q0Var;
        vVar2.f155d = uVar;
        this.f3096q = vVar2;
        this.f3097r = zVar.f3184e;
        this.f3098s = ((int[]) uVar.f969c).length;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List a() {
        return this.f3081b;
    }

    public final long b(g gVar, int i10, int i11) {
        boolean zP = gVar.f3063b.f3061d.p(i10);
        int i12 = zP ? this.f3098s : 1;
        if (zP) {
            i11 = 0;
        }
        return (((long) (i12 + i11)) & 4294967295L) | (((long) i11) << 32);
    }
}
