package f6;

import java.util.Arrays;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f6726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i[] f6727f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f6723b = str;
        this.f6724c = z10;
        this.f6725d = z11;
        this.f6726e = strArr;
        this.f6727f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f6724c == dVar.f6724c && this.f6725d == dVar.f6725d) {
                String str = dVar.f6723b;
                int i10 = c0.f16548a;
                if (Objects.equals(this.f6723b, str) && Arrays.equals(this.f6726e, dVar.f6726e) && Arrays.equals(this.f6727f, dVar.f6727f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f6724c ? 1 : 0)) * 31) + (this.f6725d ? 1 : 0)) * 31;
        String str = this.f6723b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
