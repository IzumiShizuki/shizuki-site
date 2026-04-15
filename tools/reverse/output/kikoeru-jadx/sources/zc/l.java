package zc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import se.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f26705b;

    public l(h hVar, u uVar) {
        this.f26704a = hVar;
        this.f26705b = uVar;
    }

    @Override // zc.h
    public final b e(be.c cVar) {
        jc.l.e(cVar, "fqName");
        if (((Boolean) this.f26705b.a(cVar)).booleanValue()) {
            return this.f26704a.e(cVar);
        }
        return null;
    }

    @Override // zc.h
    public final boolean f(be.c cVar) {
        jc.l.e(cVar, "fqName");
        if (((Boolean) this.f26705b.a(cVar)).booleanValue()) {
            return this.f26704a.f(cVar);
        }
        return false;
    }

    @Override // zc.h
    public final boolean isEmpty() {
        h hVar = this.f26704a;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            be.c cVarA = ((b) it.next()).a();
            if (cVarA != null && ((Boolean) this.f26705b.a(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f26704a) {
            be.c cVarA = ((b) obj).a();
            if (cVarA != null && ((Boolean) this.f26705b.a(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
