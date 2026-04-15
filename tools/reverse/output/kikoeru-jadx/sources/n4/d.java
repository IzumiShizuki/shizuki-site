package n4;

import j2.h0;
import java.util.Arrays;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f15266e = new d(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15270d;

    public d(int i10, int i11, int i12) {
        this.f15267a = i10;
        this.f15268b = i11;
        this.f15269c = i12;
        this.f15270d = c0.I(i12) ? c0.B(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15267a == dVar.f15267a && this.f15268b == dVar.f15268b && this.f15269c == dVar.f15269c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15267a), Integer.valueOf(this.f15268b), Integer.valueOf(this.f15269c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f15267a);
        sb.append(", channelCount=");
        sb.append(this.f15268b);
        sb.append(", encoding=");
        return h0.m(sb, this.f15269c, ']');
    }
}
