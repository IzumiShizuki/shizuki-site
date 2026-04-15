package i1;

import java.util.ArrayList;
import ud.o;
import ud.p;
import x0.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8636a;

    public a(int i10) {
        switch (i10) {
            case 1:
                this.f8636a = new ArrayList();
                break;
            default:
                this.f8636a = new ArrayList();
                break;
        }
    }

    public boolean a(k0 k0Var, Object obj) {
        ArrayList arrayList = k0Var.f24335a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof x0.a) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof k0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (a((k0) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ud.p
    public void b() {
        e((String[]) this.f8636a.toArray(new String[0]));
    }

    public abstract void e(String[] strArr);

    @Override // ud.p
    public o i(be.b bVar) {
        return null;
    }

    @Override // ud.p
    public void o(Object obj) {
        if (obj instanceof String) {
            this.f8636a.add((String) obj);
        }
    }

    @Override // ud.p
    public void c(ge.f fVar) {
    }

    public void d(k0 k0Var, Object obj) {
    }

    @Override // ud.p
    public void j(be.b bVar, be.e eVar) {
    }
}
