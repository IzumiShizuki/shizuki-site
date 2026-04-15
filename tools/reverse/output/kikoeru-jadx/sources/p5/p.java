package p5;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;
import ya.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.g f16704b = new ce.g((byte) 0, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f16705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f16706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f16707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f16708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p4.v f16709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f16710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p4.x f16711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Pair f16712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16716n;

    public p(c0.s sVar) {
        this.f16703a = (Context) sVar.f3156b;
        o oVar = (o) sVar.f3159e;
        p4.c.j(oVar);
        this.f16705c = oVar;
        this.f16706d = new SparseArray();
        this.f16707e = (a1) sVar.f3160f;
        p4.v vVar = (p4.v) sVar.f3162h;
        this.f16709g = vVar;
        this.f16708f = new c((r) sVar.f3157c, vVar);
        this.f16710h = new CopyOnWriteArraySet();
        new m4.p().a();
        this.f16714l = -9223372036854775807L;
        this.f16716n = -1;
        this.f16713k = 0;
    }
}
