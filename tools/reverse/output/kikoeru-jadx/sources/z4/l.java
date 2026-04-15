package z4;

import android.net.Uri;
import java.util.ArrayList;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f26435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xa.h f26436g;

    public l(m4.q qVar, i0 i0Var, r rVar, ArrayList arrayList) {
        super(qVar, i0Var, rVar, arrayList);
        Uri.parse(((b) i0Var.get(0)).f26385a);
        long j10 = rVar.f26455e;
        j jVar = j10 <= 0 ? null : new j(null, rVar.f26454d, j10);
        this.f26435f = jVar;
        this.f26436g = jVar == null ? new xa.h(new j(null, 0L, -1L)) : null;
    }

    @Override // z4.m
    public final String a() {
        return null;
    }

    @Override // z4.m
    public final y4.h d() {
        return this.f26436g;
    }

    @Override // z4.m
    public final j f() {
        return this.f26435f;
    }
}
