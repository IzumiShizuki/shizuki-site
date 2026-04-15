package e7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f6403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6405c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6406d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f6407e = new LinkedHashMap();

    public v(m0 m0Var, String str) {
        this.f6403a = m0Var;
        this.f6404b = str;
    }

    public u a() {
        u uVarB = b();
        uVarB.getClass();
        h7.i iVar = uVarB.f6400b;
        for (Map.Entry entry : this.f6405c.entrySet()) {
            String str = (String) entry.getKey();
            h hVar = (h) entry.getValue();
            jc.l.e(str, "argumentName");
            jc.l.e(hVar, "argument");
            iVar.getClass();
            ((LinkedHashMap) iVar.f8190d).put(str, hVar);
        }
        for (final r rVar : this.f6406d) {
            jc.l.e(rVar, "navDeepLink");
            iVar.getClass();
            final int i10 = 0;
            ArrayList arrayListE = g.e((LinkedHashMap) iVar.f8190d, new ic.k() { // from class: h7.h
                @Override // ic.k
                public final Object a(Object obj) {
                    boolean zContains;
                    String str2 = (String) obj;
                    switch (i10) {
                        case 0:
                            l.e(str2, "key");
                            zContains = rVar.c().contains(str2);
                            break;
                        default:
                            l.e(str2, "key");
                            zContains = rVar.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListE.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + rVar.f6379a + " can't be used to open destination " + ((u) iVar.f8188b) + ".\nFollowing required arguments are missing: " + arrayListE).toString());
            }
            ((ArrayList) iVar.f8189c).add(rVar);
        }
        Iterator it = this.f6407e.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            jc.l.e(null, "action");
            throw null;
        }
        String str2 = this.f6404b;
        if (str2 != null) {
            iVar.getClass();
            if (ef.n.y0(str2)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            jc.l.e(strConcat, "uriPattern");
            final r rVar2 = new r(strConcat);
            final int i11 = 1;
            ArrayList arrayListE2 = g.e((LinkedHashMap) iVar.f8190d, new ic.k() { // from class: h7.h
                @Override // ic.k
                public final Object a(Object obj) {
                    boolean zContains;
                    String str22 = (String) obj;
                    switch (i11) {
                        case 0:
                            l.e(str22, "key");
                            zContains = rVar2.c().contains(str22);
                            break;
                        default:
                            l.e(str22, "key");
                            zContains = rVar2.c().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListE2.isEmpty()) {
                StringBuilder sbK = a0.c.K("Cannot set route \"", str2, "\" for destination ");
                sbK.append((u) iVar.f8188b);
                sbK.append(". Following required arguments are missing: ");
                sbK.append(arrayListE2);
                throw new IllegalArgumentException(sbK.toString().toString());
            }
            iVar.f8192f = ub.a.d(new androidx.lifecycle.n0(13, strConcat));
            iVar.f8187a = strConcat.hashCode();
            iVar.f8191e = str2;
        }
        return uVarB;
    }

    public u b() {
        return this.f6403a.a();
    }
}
