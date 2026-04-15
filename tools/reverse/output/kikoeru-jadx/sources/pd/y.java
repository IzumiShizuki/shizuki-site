package pd;

import java.util.ArrayList;
import java.util.List;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se.w f17088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f17091d;

    public y(se.w wVar, List list, ArrayList arrayList, List list2) {
        this.f17088a = wVar;
        this.f17089b = list;
        this.f17090c = arrayList;
        this.f17091d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f17088a.equals(yVar.f17088a) && this.f17089b.equals(yVar.f17089b) && this.f17090c.equals(yVar.f17090c) && this.f17091d.equals(yVar.f17091d);
    }

    public final int hashCode() {
        return this.f17091d.hashCode() + ((((this.f17090c.hashCode() + t0.z(this.f17088a.hashCode() * 961, 31, this.f17089b)) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f17088a + ", receiverType=null, valueParameters=" + this.f17089b + ", typeParameters=" + this.f17090c + ", hasStableParameterNames=false, errors=" + this.f17091d + ')';
    }
}
