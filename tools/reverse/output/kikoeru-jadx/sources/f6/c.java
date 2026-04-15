package f6;

import java.util.Arrays;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i[] f6722g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f6717b = str;
        this.f6718c = i10;
        this.f6719d = i11;
        this.f6720e = j10;
        this.f6721f = j11;
        this.f6722g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f6718c == cVar.f6718c && this.f6719d == cVar.f6719d && this.f6720e == cVar.f6720e && this.f6721f == cVar.f6721f) {
                String str = cVar.f6717b;
                int i10 = c0.f16548a;
                if (Objects.equals(this.f6717b, str) && Arrays.equals(this.f6722g, cVar.f6722g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f6718c) * 31) + this.f6719d) * 31) + ((int) this.f6720e)) * 31) + ((int) this.f6721f)) * 31;
        String str = this.f6717b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
