package v7;

import ef.o;
import j2.h0;
import java.util.ArrayList;
import jc.l;
import ub.a0;
import vb.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f22779e;

    public g(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        l.e(str, "referenceTable");
        l.e(str2, "onDelete");
        l.e(str3, "onUpdate");
        this.f22775a = str;
        this.f22776b = str2;
        this.f22777c = str3;
        this.f22778d = arrayList;
        this.f22779e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (l.a(this.f22775a, gVar.f22775a) && l.a(this.f22776b, gVar.f22776b) && l.a(this.f22777c, gVar.f22777c) && this.f22778d.equals(gVar.f22778d)) {
            return this.f22779e.equals(gVar.f22779e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22779e.hashCode() + ((this.f22778d.hashCode() + h0.e(h0.e(this.f22775a.hashCode() * 31, 31, this.f22776b), 31, this.f22777c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f22775a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.f22776b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.f22777c);
        sb.append("',\n            |   columnNames = {");
        o.Y(m.f0(m.B0(this.f22778d), ",", null, null, null, 62));
        o.Y("},");
        a0 a0Var = a0.f21526a;
        sb.append(a0Var);
        sb.append("\n            |   referenceColumnNames = {");
        o.Y(m.f0(m.B0(this.f22779e), ",", null, null, null, 62));
        o.Y(" }");
        sb.append(a0Var);
        sb.append("\n            |}\n        ");
        return o.Y(o.a0(sb.toString()));
    }
}
