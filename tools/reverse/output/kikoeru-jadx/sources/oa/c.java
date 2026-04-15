package oa;

import j2.h0;
import java.util.List;
import jc.l;
import ub.h;
import ub.i;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class c {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h[] f16289d = {ub.a.c(i.f21540a, new i9.f(28)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16292c;

    public /* synthetic */ c(int i10, List list, String str, String str2) {
        if (7 != (i10 & 7)) {
            z0.i(i10, 7, a.f16288a.a());
            throw null;
        }
        this.f16290a = list;
        this.f16291b = str;
        this.f16292c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f16290a, cVar.f16290a) && l.a(this.f16291b, cVar.f16291b) && l.a(this.f16292c, cVar.f16292c);
    }

    public final int hashCode() {
        return this.f16292c.hashCode() + h0.e(this.f16290a.hashCode() * 31, 31, this.f16291b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestBody(text=");
        sb.append(this.f16290a);
        sb.append(", target_lang=");
        sb.append(this.f16291b);
        sb.append(", source_lang=");
        return h0.n(sb, this.f16292c, ")");
    }

    public c(String str, String str2, List list) {
        this.f16290a = list;
        this.f16291b = str;
        this.f16292c = str2;
    }
}
