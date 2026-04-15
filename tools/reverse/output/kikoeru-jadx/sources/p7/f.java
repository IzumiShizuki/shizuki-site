package p7;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements z7.a, rf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.a f16867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf.a f16868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yb.h f16869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f16870d;

    public f(z7.a aVar) {
        rf.c cVar = new rf.c();
        jc.l.e(aVar, "delegate");
        this.f16867a = aVar;
        this.f16868b = cVar;
    }

    @Override // rf.a
    public final void b(Object obj) {
        this.f16868b.b(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f16867a.close();
    }

    @Override // z7.a
    public final z7.c d0(String str) {
        jc.l.e(str, "sql");
        return this.f16867a.d0(str);
    }

    @Override // rf.a
    public final Object g(yb.c cVar) {
        return this.f16868b.g(cVar);
    }

    public final void i(StringBuilder sb) {
        Iterable iterableW;
        if (this.f16869c == null && this.f16870d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        yb.h hVar = this.f16869c;
        if (hVar != null) {
            sb.append("\t\tCoroutine: " + hVar);
            sb.append('\n');
        }
        Throwable th2 = this.f16870d;
        if (th2 != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            ef.g gVar = new ef.g(ub.a.e(th2));
            if (gVar.hasNext()) {
                Object next = gVar.next();
                if (gVar.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (gVar.hasNext()) {
                        arrayList.add(gVar.next());
                    }
                    iterableW = arrayList;
                } else {
                    iterableW = ud.b.w(next);
                }
            } else {
                iterableW = vb.r.f22819a;
            }
            Iterator it = vb.m.V(iterableW, 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f16867a.toString();
    }
}
