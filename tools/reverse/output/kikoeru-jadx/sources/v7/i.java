package v7;

import ef.o;
import gb.j;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import jc.l;
import ud.s;
import vb.m;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f22786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f22787d;

    public i(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        l.e(abstractSet, "foreignKeys");
        this.f22784a = str;
        this.f22785b = map;
        this.f22786c = abstractSet;
        this.f22787d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f22784a.equals(iVar.f22784a) || !this.f22785b.equals(iVar.f22785b) || !l.a(this.f22786c, iVar.f22786c)) {
            return false;
        }
        Set set2 = this.f22787d;
        if (set2 == null || (set = iVar.f22787d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f22786c.hashCode() + ((this.f22785b.hashCode() + (this.f22784a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f22784a);
        sb.append("',\n            |    columns = {");
        sb.append(s.m(m.C0(this.f22785b.values(), new j(5))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(s.m(this.f22786c));
        sb.append("\n            |    indices = {");
        Set set = this.f22787d;
        sb.append(s.m(set != null ? m.C0(set, new j(6)) : r.f22819a));
        sb.append("\n            |}\n        ");
        return o.a0(sb.toString());
    }
}
