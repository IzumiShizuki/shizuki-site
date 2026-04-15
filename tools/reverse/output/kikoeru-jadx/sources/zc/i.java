package zc;

import df.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import vb.q;
import yc.e0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26698b;

    public /* synthetic */ i(int i10, List list) {
        this.f26697a = i10;
        this.f26698b = list;
    }

    @Override // zc.h
    public final b e(be.c cVar) {
        switch (this.f26697a) {
            case 0:
                return ua.j.k(this, cVar);
            case 1:
                jc.l.e(cVar, "fqName");
                df.e eVar = new df.e(df.m.f0(vb.m.R((List) this.f26698b), new e0(cVar, 1)));
                return (b) (!eVar.hasNext() ? null : eVar.next());
            default:
                jc.l.e(cVar, "fqName");
                if (cVar.equals((be.c) this.f26698b)) {
                    return td.b.f20670a;
                }
                return null;
        }
    }

    @Override // zc.h
    public final boolean f(be.c cVar) {
        switch (this.f26697a) {
            case 1:
                jc.l.e(cVar, "fqName");
                Iterator it = ((Iterable) vb.m.R((List) this.f26698b).f6001b).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).f(cVar)) {
                        break;
                    }
                }
                break;
        }
        return ua.j.m(this, cVar);
    }

    @Override // zc.h
    public final boolean isEmpty() {
        switch (this.f26697a) {
            case 0:
                return ((List) this.f26698b).isEmpty();
            case 1:
                List list = (List) this.f26698b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f26697a) {
            case 0:
                return ((List) this.f26698b).iterator();
            case 1:
                return new df.e(new df.i(vb.m.R((List) this.f26698b), k.f26703a, p.f6004i));
            default:
                return q.f22818a;
        }
    }

    public String toString() {
        switch (this.f26697a) {
            case 0:
                return ((List) this.f26698b).toString();
            default:
                return super.toString();
        }
    }

    public i(h[] hVarArr) {
        this.f26697a = 1;
        this.f26698b = vb.l.M0(hVarArr);
    }

    public i(be.c cVar) {
        this.f26697a = 2;
        jc.l.e(cVar, "fqNameToMatch");
        this.f26698b = cVar;
    }
}
