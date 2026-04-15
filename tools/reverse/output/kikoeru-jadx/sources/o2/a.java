package o2;

import j2.h0;
import jc.l;
import w1.f;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16144b;

    public a(f fVar, int i10) {
        this.f16143a = fVar;
        this.f16144b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f16143a, aVar.f16143a) && this.f16144b == aVar.f16144b;
    }

    public final int hashCode() {
        return (this.f16143a.hashCode() * 31) + this.f16144b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f16143a);
        sb.append(", configFlags=");
        return h0.m(sb, this.f16144b, ')');
    }
}
