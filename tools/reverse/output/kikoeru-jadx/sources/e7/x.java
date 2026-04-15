package e7;

import java.util.ArrayList;
import o.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f6410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f6412h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(n0 n0Var, String str) {
        super(n0Var.b(g.d(z.class)), null);
        jc.l.e(n0Var, "provider");
        this.f6412h = new ArrayList();
        this.f6410f = n0Var;
        this.f6411g = str;
    }

    public final w c() {
        int iHashCode;
        w wVar = (w) super.a();
        ArrayList<u> arrayList = this.f6412h;
        jc.l.e(arrayList, "nodes");
        h7.k kVar = wVar.f6409f;
        kVar.getClass();
        for (u uVar : arrayList) {
            if (uVar != null) {
                v0 v0Var = (v0) kVar.f8199d;
                w wVar2 = (w) kVar.f8198c;
                h7.i iVar = wVar2.f6400b;
                h7.i iVar2 = uVar.f6400b;
                int i10 = iVar2.f8187a;
                String str = (String) iVar2.f8191e;
                if (i10 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = (String) iVar.f8191e;
                if (str2 != null && jc.l.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + uVar + " cannot have the same route as graph " + wVar2).toString());
                }
                if (i10 == iVar.f8187a) {
                    throw new IllegalArgumentException(("Destination " + uVar + " cannot have the same id as graph " + wVar2).toString());
                }
                u uVar2 = (u) v0Var.d(i10);
                if (uVar2 == uVar) {
                    continue;
                } else {
                    if (uVar.f6401c != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (uVar2 != null) {
                        uVar2.f6401c = null;
                    }
                    uVar.f6401c = wVar2;
                    v0Var.f(iVar2.f8187a, uVar);
                }
            }
        }
        String str3 = this.f6411g;
        if (str3 == null) {
            if (this.f6404b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        w wVar3 = (w) kVar.f8198c;
        if (str3 == null) {
            iHashCode = 0;
        } else {
            if (str3.equals((String) wVar3.f6400b.f8191e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + wVar3).toString());
            }
            if (ef.n.y0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i11 = u.f6398e;
            iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        kVar.f8197b = iHashCode;
        kVar.f8201f = str3;
        return wVar;
    }
}
