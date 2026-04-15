package z4;

import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import p4.c0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4.q f26437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f26438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f26440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f26441e;

    public m(m4.q qVar, List list, s sVar, List list2) {
        p4.c.c(!list.isEmpty());
        this.f26437a = qVar;
        this.f26438b = i0.q(list);
        this.f26440d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f26441e = sVar.a(this);
        long j10 = sVar.f26458c;
        long j11 = sVar.f26457b;
        int i10 = c0.f16548a;
        this.f26439c = c0.V(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract y4.h d();

    public abstract j f();
}
