package c5;

import android.text.TextUtils;
import j2.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.k0;
import m4.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3560c;

    public s(String str, String str2, List list) {
        this.f3558a = str;
        this.f3559b = str2;
        this.f3560c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // m4.m0
    public final /* synthetic */ m4.q a() {
        return null;
    }

    @Override // m4.m0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f3558a, sVar.f3558a) && TextUtils.equals(this.f3559b, sVar.f3559b) && this.f3560c.equals(sVar.f3560c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3558a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3559b;
        return this.f3560c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f3558a;
        sb.append(str != null ? h0.n(a0.c.K(" [", str, ", "), this.f3559b, "]") : "");
        return sb.toString();
    }

    @Override // m4.m0
    public final /* synthetic */ void b(k0 k0Var) {
    }
}
