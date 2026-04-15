package ed;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends s implements sd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f6491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f6492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6494d;

    public d0(b0 b0Var, Annotation[] annotationArr, String str, boolean z10) {
        jc.l.e(annotationArr, "reflectAnnotations");
        this.f6491a = b0Var;
        this.f6492b = annotationArr;
        this.f6493c = str;
        this.f6494d = z10;
    }

    @Override // sd.b
    public final e a(be.c cVar) {
        jc.l.e(cVar, "fqName");
        return g8.a.u(this.f6492b, cVar);
    }

    @Override // sd.b
    public final Collection getAnnotations() {
        return g8.a.z(this.f6492b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d0.class.getName());
        sb.append(": ");
        sb.append(this.f6494d ? "vararg " : "");
        String str = this.f6493c;
        sb.append(str != null ? be.e.d(str) : null);
        sb.append(": ");
        sb.append(this.f6491a);
        return sb.toString();
    }
}
