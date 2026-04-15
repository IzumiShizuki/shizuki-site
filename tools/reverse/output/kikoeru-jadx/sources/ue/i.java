package ue;

import java.util.Arrays;
import java.util.List;
import le.o;
import se.a0;
import se.h0;
import se.k0;
import se.w;
import se.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f21628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f21629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f21630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f21631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f21633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f21634h;

    public i(k0 k0Var, g gVar, k kVar, List list, boolean z10, String... strArr) {
        jc.l.e(kVar, "kind");
        jc.l.e(list, "arguments");
        jc.l.e(strArr, "formatParams");
        this.f21628b = k0Var;
        this.f21629c = gVar;
        this.f21630d = kVar;
        this.f21631e = list;
        this.f21632f = z10;
        this.f21633g = strArr;
        String str = kVar.f21662a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f21634h = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // se.w0
    public final w0 B(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // se.a0, se.w0
    public final w0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return this;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        String[] strArr = this.f21633g;
        return new i(this.f21628b, this.f21629c, this.f21630d, this.f21631e, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return this;
    }

    @Override // se.w
    public final o n0() {
        return this.f21629c;
    }

    @Override // se.w
    public final List q() {
        return this.f21631e;
    }

    @Override // se.w
    public final h0 r() {
        h0.f19950b.getClass();
        return h0.f19951c;
    }

    @Override // se.w
    public final k0 t() {
        return this.f21628b;
    }

    @Override // se.w
    public final boolean u() {
        return this.f21632f;
    }

    @Override // se.w
    public final w v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        return this;
    }
}
